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
        $numero1 = intval($_POST['txtNota1']);
        $numero2 = intval($_POST['txtNota2']);
        $numero3 = intval($_POST['txtNota3']);
        $numero4 = intval($_POST['txtNota4']);

        if ($numero1 >= 0 AND $numero1 <= 10 AND 
        $numero2 >= 0 AND $numero2 >= 10 AND 
        $numero3 >= 0 AND $numero3 <= 10 and
        $numero4 >= 0 AND $numero4 <= 10) {
            $soma = $numero1 + $numero2 + $numero3 + $numero4;

            $media = $soma / 4;

            if ($media <= 5) {
                echo "<p><strong>Média das Notas: $media <br>
                Situação: Reprovado.</strong></p>";
            } else {
                echo "<p><strong>Média das Notas: $media <br>
                Situação: Aprovado.</strong></p>";
            }
        }
    }
    ?>
</body>
</html>