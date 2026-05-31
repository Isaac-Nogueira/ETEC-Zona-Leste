<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cálculo de Salário</title>
    <link rel="stylesheet" href="/Exercicios/Ex06/Ex06.css">
</head>
<body>
    <form name="salario" action="Ex06.php" method="POST">
        Qual o valor Bruto de seu Salário? <br>
        <input type="text" name="txtSalario"><br>
        <input type="submit" value="Calcular">
    </form>

    <?php
    if ($_SERVER['REQUEST_METHOD'] === 'POST') {
        $salBruto = floatval($_POST['txtSalario']);
        $acrescimo = $salBruto + ($salBruto / 10);
        $salFinal = $acrescimo - ($salBruto / 10 * 2);

        echo "<p><strong>Seu Salário Final é: R$ " . number_format($salFinal, 2, ',', '.') . "</strong></p>";
    }
    ?>
    <a href="/Exercicios/Ex07/Ex07.php"><button type="button">Próximo →</button></a>
</body>
</html>