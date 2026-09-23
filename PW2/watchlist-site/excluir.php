<?php
require_once 'conexao.php';

// Verifica se o ID foi passado na URL
if (isset($_GET['id'])) {
    $id = $_GET['id'];

    // Busca a capa antes de excluir, para também remover o arquivo do disco
    $stmt = $pdo->prepare("SELECT capa FROM producoes WHERE id = ?");
    $stmt->execute([$id]);
    $producao = $stmt->fetch(PDO::FETCH_ASSOC);

    // Prepara o DELETE
    $sql = "DELETE FROM producoes WHERE id = ?";
    $stmt = $pdo->prepare($sql);

    // Executa passando o ID. Se houver sucesso, o registro é removido para sempre.
    if ($stmt->execute([$id]) && $producao && $producao['capa'] && file_exists('uploads/capas/' . $producao['capa'])) {
        unlink('uploads/capas/' . $producao['capa']);
    }
}

// Independentemente de sucesso ou erro, redireciona o usuário de volta para a lista
header('Location: index.php?sucesso=excluido');
exit;
?>
