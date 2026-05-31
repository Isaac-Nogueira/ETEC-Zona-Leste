<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Soma dos Ímpares</title>
    <link rel="stylesheet" href="/Exercicios/Ex09/Ex09.css">
</head>
<body>
    <form name="verificar" action="Ex09.php" method="POST">
        Informe Dois Números para que possa Somar os Números Ímpares do Intervalo:<br>
        Digite o 1° Número: <br>
        <input type="text" name="txtNum1"><br>
        Digite o 2° Número: <br>
        <input type="text" name="txtNum2"><br>
        <input type="submit" value="Resultado">
    </form>

    <?php
    if ($_SERVER['REQUEST_METHOD'] === 'POST') {
        $num1 = floatval($_POST['txtNum1']);
        $num2 = floatval($_POST['txtNum2']);
        $soma = 0;

    for ($i = $num1; $i <= $num2; $i++) {
        if ($i % 2 != 0) {
            $soma += $i;
        }
    }

    echo "<p>Soma dos ímpares: $soma</p>";
    }
    ?>
    <a href="/Exercicios/Ex10/Ex10.php"><button type="button">Próximo →</button></a>
</body>
</html>