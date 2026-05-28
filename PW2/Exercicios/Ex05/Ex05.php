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
        $num1 = intval($_POST['txtNum1']);
        $num2 = intval($_POST['txtNum2']);
        $num3 = intval($_POST['txtNum3']);

        $soma = $num1 * $num1 + $num2 * $num2 + $num3 * $num3;
        
        echo "<p><strong>Soam do Quadrado de cada Número: $soma</strong></p>";
    }
    ?>
</body>
</html>