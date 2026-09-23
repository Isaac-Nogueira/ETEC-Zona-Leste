<?php
require_once 'conexao.php';

// Verifica se o formulário foi enviado (método POST)
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    // Recebe os dados dos campos de input
    $titulo = $_POST['titulo'];
    $tipo = $_POST['tipo'];
    $plataforma = $_POST['plataforma'];
    $genero = $_POST['genero'];
    // Nota é opcional: se vier em branco, salva como NULL
    $nota_pessoal = ($_POST['nota_pessoal'] === '') ? null : $_POST['nota_pessoal'];
    $status = $_POST['status'];
    $erro_upload = null;

    // Processa o upload da capa, se um arquivo foi enviado
    $capa = null;
    if (isset($_FILES['capa']) && $_FILES['capa']['error'] === UPLOAD_ERR_OK) {
        $permitidos = ['image/jpeg' => 'jpg', 'image/png' => 'png', 'image/webp' => 'webp'];
        $tipo_arquivo = mime_content_type($_FILES['capa']['tmp_name']);

        if (!isset($permitidos[$tipo_arquivo])) {
            $erro_upload = "Formato de imagem inválido. Use JPG, PNG ou WEBP.";
        } elseif ($_FILES['capa']['size'] > 5 * 1024 * 1024) { // limite de 5MB
            $erro_upload = "A imagem deve ter no máximo 5MB.";
        } else {
            // Gera um nome único para não sobrescrever outras capas
            $extensao = $permitidos[$tipo_arquivo];
            $capa = uniqid('capa_') . '.' . $extensao;
            move_uploaded_file($_FILES['capa']['tmp_name'], 'uploads/capas/' . $capa);
        }
    }

    if (!$erro_upload) {
        // Monta a query SQL com "placeholders" (?) para evitar SQL Injection
        $sql = "INSERT INTO producoes (titulo, tipo, plataforma, genero, nota_pessoal, status, capa) VALUES (?, ?, ?, ?, ?, ?, ?)";
        $stmt = $pdo->prepare($sql);

        // Executa substituindo os '?' pelas variáveis na ordem correta
        if ($stmt->execute([$titulo, $tipo, $plataforma, $genero, $nota_pessoal, $status, $capa])) {
            header('Location: index.php?sucesso=criado');
            exit;
        }
    }
}
?>

<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <title>Nova Produção — Watchlist</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="form-page">
        <div class="form-card">
            <h3>Cadastrar Produção</h3>

            <?php if (!empty($erro_upload)): ?>
                <p style="color:#D97878; font-size:0.85rem; margin-top:-14px; margin-bottom:18px;"><?= htmlspecialchars($erro_upload) ?></p>
            <?php endif; ?>

            <form method="POST" action="" enctype="multipart/form-data">
                <div class="field">
                    <label>Capa (opcional)</label>
                    <input type="file" name="capa" accept="image/jpeg,image/png,image/webp">
                </div>
                <div class="field">
                    <label>Título</label>
                    <input type="text" name="titulo" required>
                </div>
                <div class="field">
                    <label>Tipo</label>
                    <select name="tipo" required>
                        <option value="Filme">Filme</option>
                        <option value="Série">Série</option>
                    </select>
                </div>
                <div class="field">
                    <label>Plataforma de streaming</label>
                    <input type="text" name="plataforma" placeholder="Ex: Netflix, Prime Video, Disney+" required>
                </div>
                <div class="field">
                    <label>Gênero</label>
                    <input type="text" name="genero" placeholder="Ex: Romance, Acão, Drama" required>
                </div>
                <div class="field">
                    <label>Nota pessoal (0 a 10)</label>
                    <input type="number" name="nota_pessoal" min="0" max="10" step="0.1" placeholder="Opcional — preencha se já assistiu">
                </div>
                <div class="field">
                    <label>Status</label>
                    <select name="status" required>
                        <option value="quero_ver">Quero Ver</option>
                        <option value="assistindo">Assistindo</option>
                        <option value="assistido">Assistido</option>
                    </select>
                </div>

                <div class="form-actions">
                    <button type="submit" class="btn btn-primary">Salvar Produção</button>
                    <a href="index.php" class="btn btn-secondary">Cancelar</a>
                </div>
            </form>
        </div>
    </div>
</body>
</html>
