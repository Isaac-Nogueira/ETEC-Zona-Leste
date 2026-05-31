<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Verificação de Número Ímpar</title>
    <link rel="stylesheet" href="/Exercicios/Ex10/Ex10.css">
</head>
<body>
    <form name="verificar" action="Ex10.php" method="POST">
        Informe Um Números para Verificar se o mesmo é Ímpar ou Não <br>
        Digite o Número: <br>
        <input type="text" name="txtNum1"><br>
        <input type="submit" value="Verificar">
    </form>

    <?php
    if ($_SERVER['REQUEST_METHOD'] === 'POST') {
        $num1 = floatval($_POST['txtNum1']);

    if ($num1 % 2 != 0) {
        echo "<p>O Número digitado é Ímpar</p>";
    } else {
        echo "<p>O Número digitado Não é Ímpar</p>";
    }
    }
    ?>
    <a href="/Exercicios/Ex11/Ex11.php"><button type="button">Próximo →</button></a>
</body>
</html>