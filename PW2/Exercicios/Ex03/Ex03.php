<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Média de Notas</title>
    <link rel="stylesheet" href="/Exercicios/Ex03/Ex03.css">
</head>
<body>
    <form name="media" action="Ex03.php" method="POST">
        Informe as Notas para obter a Média <br>
        Digite a Nota do 1° Bimestre: <br>
        <input type="text" name="txtNota1"><br>
        Digite a Nota do 2° Bimestre: <br>
        <input type="text" name="txtNota2"><br>
        Digite a Nota do 3° Bimestre: <br>
        <input type="text" name="txtNota3"><br>
        Digite a Nota do 4° Bimestre: <br>
        <input type="text" name="txtNota4"><br>
        <input type="submit" value="Média">
    </form>

    <?php
    if ($_SERVER['REQUEST_METHOD'] === 'POST') {
        $numero1 = floatval($_POST['txtNota1']);
        $numero2 = floatval($_POST['txtNota2']);
        $numero3 = floatval($_POST['txtNota3']);
        $numero4 = floatval($_POST['txtNota4']);

        if ($numero1 >= 0 && $numero1 <= 10 &&
            $numero2 >= 0 && $numero2 <= 10 &&
            $numero3 >= 0 && $numero3 <= 10 &&
            $numero4 >= 0 && $numero4 <= 10) {

            $media = ($numero1 + $numero2 + $numero3 + $numero4) / 4;

            if ($media < 5) {
                echo "<p><strong>Média das Notas: $media <br> Situação: Reprovado.</strong></p>";
            } else {
                echo "<p><strong>Média das Notas: $media <br> Situação: Aprovado.</strong></p>";
            }
        } else {
            echo "<p><strong>Por favor, digite notas entre 0 e 10.</strong></p>";
        }
    }
    ?>
    <a href="/Exercicios/Ex05/Ex05.php"><button type="button">Próximo →</button></a>
</body>
</html>