<?php
// Inclui o arquivo de conexão para podermos usar a variável $pdo
require_once 'conexao.php';

// Verifica se veio um filtro de status pela URL (?status=assistido | quero_ver)
$filtro = $_GET['status'] ?? 'todos';

if (in_array($filtro, ['assistido', 'assistindo', 'quero_ver'])) {
    $stmt = $pdo->prepare("SELECT * FROM producoes WHERE status = ? ORDER BY id DESC");
    $stmt->execute([$filtro]);
} else {
    $filtro = 'todos';
    $stmt = $pdo->query("SELECT * FROM producoes ORDER BY id DESC");
}

$producoes = $stmt->fetchAll(PDO::FETCH_ASSOC);

// Conta quantas produções existem por status, independente do filtro atual
$contagem = $pdo->query("SELECT status, COUNT(*) as total FROM producoes GROUP BY status")
                 ->fetchAll(PDO::FETCH_KEY_PAIR);

$total_geral = array_sum($contagem);
$total_assistido = $contagem['assistido'] ?? 0;
$total_assistindo = $contagem['assistindo'] ?? 0;
$total_quero_ver = $contagem['quero_ver'] ?? 0;
?>

<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Watchlist — Filmes e Séries</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="modal-overlay" id="modal-excluir">
        <div class="modal-box">
            <h4>Excluir produção?</h4>
            <p>Tem certeza que deseja excluir <strong id="modal-titulo"></strong>? Essa ação não pode ser desfeita.</p>
            <div class="modal-actions">
                <button class="btn btn-secondary" onclick="fecharModal()">Cancelar</button>
                <button class="btn btn-danger" onclick="confirmarExclusaoFinal()">Excluir</button>
            </div>
        </div>
    </div>
    <?php if (isset($_GET['sucesso'])):
        $mensagens = [
            'criado'   => 'Produção cadastrada com sucesso!',
            'editado'  => 'Alterações salvas com sucesso!',
            'excluido' => 'Produção excluída.'
        ];
        $msg = $mensagens[$_GET['sucesso']] ?? null;
    ?>
        <?php if ($msg): ?>
            <div class="toast"><?= htmlspecialchars($msg) ?></div>
        <?php endif; ?>
    <?php endif; ?>
    <header class="topbar">
        <div class="topbar-row">
            <div>
                <h1 class="marquee">MY WATCH<span>LIST</span></h1>
                <p class="subtitle">Sua coleção pessoal de filmes e séries</p>
                <p class="counter">
                    <?= $total_geral ?> produções · <?= $total_assistido ?> assistidas · <?= $total_assistindo ?> em andamento
                </p>
            </div>
            <a href="criar.php" class="btn btn-primary">+ Adicionar Produção</a>
        </div>

        <nav class="filters">
            <a href="index.php" class="filter-pill <?= $filtro === 'todos' ? 'active' : '' ?>">Todos</a>
            <a href="index.php?status=quero_ver" class="filter-pill <?= $filtro === 'quero_ver' ? 'active' : '' ?>">Quero Ver</a>
            <a href="index.php?status=assistindo" class="filter-pill <?= $filtro === 'assistindo' ? 'active' : '' ?>">Assistindo</a>
            <a href="index.php?status=assistido" class="filter-pill <?= $filtro === 'assistido' ? 'active' : '' ?>">Assistido</a>
        </nav>
    </header>

    <?php if (count($producoes) === 0): ?>
        <div class="empty-state">
            <p>Nenhuma produção encontrada por aqui ainda.</p>
            <a href="criar.php" class="btn btn-primary" style="margin-top:10px;">Cadastrar a primeira</a>
        </div>
    <?php else: ?>
    <main class="grid">
        <?php foreach ($producoes as $producao): ?>
        <article class="card">
            <div class="card-poster" <?= $producao['capa'] ? 'style="background-image:url(\'uploads/capas/' . htmlspecialchars($producao['capa']) . '\')"' : '' ?>>
                <div class="poster-topbar">
                    <span class="tipo-tag"><?= $producao['tipo'] === 'Filme' ? '🎬 Filme' : '📺 Série' ?></span>
                    <?php
                        $classe_status = 'status-querover';
                        $texto_status = 'Quero Ver';
                        if ($producao['status'] === 'assistido') { $classe_status = 'status-assistido'; $texto_status = 'Assistido'; }
                        if ($producao['status'] === 'assistindo') { $classe_status = 'status-assistindo'; $texto_status = 'Assistindo'; }
                    ?>
                    <span class="status-tag <?= $classe_status ?>"><?= $texto_status ?></span>
                </div>
                <?php if (!$producao['capa']): ?>
                    <span class="initial"><?= htmlspecialchars(mb_substr($producao['titulo'], 0, 1)) ?></span>
                <?php endif; ?>
            </div>
            <div class="card-body">
                <h3 class="card-title"><?= htmlspecialchars($producao['titulo']) ?></h3>
                <p class="card-meta"><?= htmlspecialchars($producao['plataforma']) ?> · <?= htmlspecialchars($producao['genero']) ?></p>

                <?php if ($producao['nota_pessoal'] !== null): ?>
                    <p class="card-rating">★ <?= htmlspecialchars($producao['nota_pessoal']) ?> / 10</p>
                <?php else: ?>
                    <p class="card-rating empty">Sem avaliação</p>
                <?php endif; ?>

                <div class="card-actions">
                    <a href="editar.php?id=<?= $producao['id'] ?>" class="btn btn-secondary">Editar</a>
                    <button onclick="abrirModalExclusao(<?= $producao['id'] ?>, '<?= htmlspecialchars(addslashes($producao['titulo'])) ?>')" class="btn btn-danger">Excluir</button>
                </div>
            </div>
        </article>
        <?php endforeach; ?>
    </main>
    <?php endif; ?>

    <script>
        let idParaExcluir = null;

        function abrirModalExclusao(id, titulo) {
            idParaExcluir = id;
            document.getElementById('modal-titulo').textContent = titulo;
            document.getElementById('modal-excluir').classList.add('show');
        }

        function fecharModal() {
            document.getElementById('modal-excluir').classList.remove('show');
            idParaExcluir = null;
        }

        function confirmarExclusaoFinal() {
            if (idParaExcluir) {
                window.location.href = "excluir.php?id=" + idParaExcluir;
            }
        }
    </script>
</body>
</html>
