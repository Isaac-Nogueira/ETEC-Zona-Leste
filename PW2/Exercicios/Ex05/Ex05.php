<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Soma dos Quadrados</title>
    <link rel="stylesheet" href="/Exercicios/Ex05/Ex05.css">
</head>
<body>
    <form name="quadrados" action="Ex05.php" method="POST">
        Informe os Números para que possa Somar os Quadrados dos Números: <br>
        Digite o 1° Número: <br>
        <input type="text" name="txtNum1"><br>
        Digite o 2° Número: <br>
        <input type="text" name="txtNum2"><br>
        Digite o 3° Número: <br>
        <input type="text" name="txtNum3"><br>
        <input type="submit" value="Resultado">
    </form>

    <?php
    if ($_SERVER['REQUEST_METHOD'] === 'POST') {
        $num1 = floatval($_POST['txtNum1']);
        $num2 = floatval($_POST['txtNum2']);
        $num3 = floatval($_POST['txtNum3']);
        $soma = ($num1 ** 2) + ($num2 ** 2) + ($num3 ** 2);

        echo "<p><strong>Soma do Quadrado de cada Número: $soma</strong></p>";
    }
    ?>
    <a href="/Exercicios/Ex06/Ex06.php"><button type="button">Próximo →</button></a>
</body>
</html>