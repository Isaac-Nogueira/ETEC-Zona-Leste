<?php
require_once 'conexao.php';

// 1. Busca os dados atuais da produção com base no ID passado na URL
$id = $_GET['id'];
$stmt = $pdo->prepare("SELECT * FROM producoes WHERE id = ?");
$stmt->execute([$id]);
$producao = $stmt->fetch(PDO::FETCH_ASSOC);

// Verifica se a produção existe, se não, volta para a tela inicial
if (!$producao) {
    header('Location: index.php');
    exit;
}

// 2. Processa a atualização quando o formulário for enviado
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $titulo = $_POST['titulo'];
    $tipo = $_POST['tipo'];
    $plataforma = $_POST['plataforma'];
    $genero = $_POST['genero'];
    $nota_pessoal = ($_POST['nota_pessoal'] === '') ? null : $_POST['nota_pessoal'];
    $status = $_POST['status'];
    $erro_upload = null;

    // Mantém a capa atual por padrão; só troca se um novo arquivo for enviado
    $capa = $producao['capa'];
    if (isset($_FILES['capa']) && $_FILES['capa']['error'] === UPLOAD_ERR_OK) {
        $permitidos = ['image/jpeg' => 'jpg', 'image/png' => 'png', 'image/webp' => 'webp'];
        $tipo_arquivo = mime_content_type($_FILES['capa']['tmp_name']);

        if (!isset($permitidos[$tipo_arquivo])) {
            $erro_upload = "Formato de imagem inválido. Use JPG, PNG ou WEBP.";
        } elseif ($_FILES['capa']['size'] > 5 * 1024 * 1024) { // limite de 5MB
            $erro_upload = "A imagem deve ter no máximo 5MB.";
        } else {
            // Apaga a capa antiga (se existir) antes de salvar a nova
            if ($producao['capa'] && file_exists('uploads/capas/' . $producao['capa'])) {
                unlink('uploads/capas/' . $producao['capa']);
            }
            $extensao = $permitidos[$tipo_arquivo];
            $capa = uniqid('capa_') . '.' . $extensao;
            move_uploaded_file($_FILES['capa']['tmp_name'], 'uploads/capas/' . $capa);
        }
    }

    if (!$erro_upload) {
        $sql = "UPDATE producoes SET titulo = ?, tipo = ?, plataforma = ?, genero = ?, nota_pessoal = ?, status = ?, capa = ? WHERE id = ?";
        $stmt = $pdo->prepare($sql);

        if ($stmt->execute([$titulo, $tipo, $plataforma, $genero, $nota_pessoal, $status, $capa, $id])) {
            header('Location: index.php?sucesso=editado');
            exit;
        }
    }
}
?>

<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <title>Editar Produção — Watchlist</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="form-page">
        <div class="form-card">
            <h3>Editar: <?= htmlspecialchars($producao['titulo']) ?></h3>

            <?php if (!empty($erro_upload)): ?>
                <p style="color:#D97878; font-size:0.85rem; margin-top:-14px; margin-bottom:18px;"><?= htmlspecialchars($erro_upload) ?></p>
            <?php endif; ?>

            <form method="POST" action="" enctype="multipart/form-data">
                <div class="field">
                    <label>Capa (opcional)</label>
                    <div class="capa-atual-wrapper">
                        <?php if ($producao['capa']): ?>
                            <img src="uploads/capas/<?= htmlspecialchars($producao['capa']) ?>" alt="Capa atual" class="capa-preview">
                        <?php else: ?>
                            <div class="capa-preview capa-vazia">Sem capa</div>
                        <?php endif; ?>
                        <div class="capa-upload">
                            <input type="file" name="capa" accept="image/jpeg,image/png,image/webp">
                            <span class="capa-hint">Envie uma imagem para substituir a capa atual</span>
                        </div>
                    </div>
                </div>
                <div class="field">
                    <label>Título</label>
                    <input type="text" name="titulo" value="<?= htmlspecialchars($producao['titulo']) ?>" required>
                </div>
                <div class="field">
                    <label>Tipo</label>
                    <select name="tipo" required>
                        <option value="Filme" <?= $producao['tipo'] === 'Filme' ? 'selected' : '' ?>>Filme</option>
                        <option value="Série" <?= $producao['tipo'] === 'Série' ? 'selected' : '' ?>>Série</option>
                    </select>
                </div>
                <div class="field">
                    <label>Plataforma de streaming</label>
                    <input type="text" name="plataforma" value="<?= htmlspecialchars($producao['plataforma']) ?>" required>
                </div>
                <div class="field">
                    <label>Gênero</label>
                    <input type="text" name="genero" value="<?= htmlspecialchars($producao['genero']) ?>" required>
                </div>
                <div class="field">
                    <label>Nota pessoal (0 a 10)</label>
                    <input type="number" name="nota_pessoal" min="0" max="10" step="0.1" value="<?= htmlspecialchars($producao['nota_pessoal'] ?? '') ?>">
                </div>
                <div class="field">
                    <label>Status</label>
                    <select name="status" required>
                        <option value="quero_ver" <?= $producao['status'] === 'quero_ver' ? 'selected' : '' ?>>Quero Ver</option>
                        <option value="assistindo" <?= $producao['status'] === 'assistindo' ? 'selected' : '' ?>>Assistindo</option>
                        <option value="assistido" <?= $producao['status'] === 'assistido' ? 'selected' : '' ?>>Assistido</option>
                    </select>
                </div>

                <div class="form-actions">
                    <button type="submit" class="btn btn-primary">Atualizar Dados</button>
                    <a href="index.php" class="btn btn-secondary">Cancelar</a>
                </div>
            </form>
        </div>
    </div>
</body>
</html>
