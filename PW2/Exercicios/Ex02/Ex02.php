<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tabuada</title>
    <link rel="stylesheet" href="/Ex01/Ex01.css">
</head>
<body>
    <?php
    if ($_SERVER['REQUEST_METHOD'] === 'POST') {
        $preco = intval($_POST['txtValor']);
        $desconto = intval($_POST['txtDesconto']);
        $porcentagem = $desconto / 100;
        $valorFinal = $preco - $porcentagem;
        echo "<p><strong>Valor Final: $valorFinal</strong></p>";
    }
    ?>
</body>
</html>