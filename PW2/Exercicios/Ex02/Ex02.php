<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Desconto de Produto</title>
    <link rel="stylesheet" href="/Exercicios/Ex02/Ex02.css">
</head>
<body>
    <form name="desconto" action="Ex02.php" method="POST">
        Desconto de Produto
        Qual o Preço do Produto? <br>
        <input type="text" name="txtValor"><br>
        Qual a Porcentagem do Desconto que deseja?
        <input type="text" name="txtDesconto"><br>
        <input type="submit" value="Desconto">
    </form>

    <?php
    if ($_SERVER['REQUEST_METHOD'] === 'POST') {
        $preco = floatval($_POST['txtValor']);
        $desconto = floatval($_POST['txtDesconto']);
        $valorDesconto = $preco * ($desconto / 100);
        $valorFinal = $preco - $valorDesconto;
        echo "<p><strong>Valor Final: R$ " . number_format($valorFinal, 2, ',', '.') . "</strong></p>";
    }
    ?>
    <a href="/Exercicios/Ex03/Ex03.php"><button type="button">Próximo →</button></a>
</body>
</html>