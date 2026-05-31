<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tabuada</title>
    <link rel="stylesheet" href="/Exercicios/Ex01/Ex01.css">
</head>
<body>
    <form name="tabuada" action="Ex01.php" method="POST">
        Digite o número desejado para que seja exibida sua Tabuada <br>
        <input type="text" name="txtNumero"><br>
        <input type="submit" value="Tabuada">
    </form>

    <?php
    if ($_SERVER['REQUEST_METHOD'] === 'POST') {
        $numero = intval($_POST['txtNumero']);
        echo "<p><strong>Tabuada do Número $numero:</strong></p>";

        for ($i = 1; $i <= 10; $i++) {
            $resultado = $numero * $i;
            echo "$numero x $i = $resultado <br>";
        }
    }
    ?>
    <a href="/Exercicios/Ex02/Ex02.php"><button type="button">Próximo →</button></a>
</body>
</html>