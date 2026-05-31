<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Verificação de Números</title>
    <link rel="stylesheet" href="/Exercicios/Ex08/Ex08.css">
</head>
<body>
    <form name="verificar" action="Ex08.php" method="POST">
        Informe os Números para Verificar qual é o Maior e o Menor: <br>
        Digite o 1° Número: <br>
        <input type="text" name="txtNum1"><br>
        Digite o 2° Número: <br>
        <input type="text" name="txtNum2"><br>
        Digite o 3° Número: <br>
        <input type="text" name="txtNum3"><br>
        <input type="submit" value="Verificar">
    </form>

    <?php
    if ($_SERVER['REQUEST_METHOD'] === 'POST') {
        $num1 = floatval($_POST['txtNum1']);
        $num2 = floatval($_POST['txtNum2']);
        $num3 = floatval($_POST['txtNum3']);

        if ($num1 >= $num2 && $num1 >= $num3) {
            $maior = $num1;
        } elseif ($num2 >= $num1 && $num2 >= $num3) {
            $maior = $num2;
        } else {
            $maior = $num3;
        }

        if ($num1 <= $num2 && $num1 <= $num3) {
            $menor = $num1;
        } elseif ($num2 <= $num1 && $num2 <= $num3) {
            $menor = $num2;
        } else {
            $menor = $num3;
        }

        echo "<p><strong>O Maior Número digitado é: $maior</strong></p>";
        echo "<p><strong>O Menor Número digitado é: $menor</strong></p>";
    }
    ?>
    <a href="/Exercicios/Ex09/Ex09.php"><button type="button">Próximo →</button></a>
</body>
</html>