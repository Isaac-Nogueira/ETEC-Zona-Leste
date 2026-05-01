<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Página calcularsalario.php</title>
    <link rel="stylesheet" href="calcularsalario.css">
</head>

    <?php
        if ($_SERVER['REQUEST_METHOD'] === 'POST') {
                $valor = $_POST['txtvalor'];
                $horas = $_POST['txthoras'];
                $salario = $valor * $horas;
                echo "<p class='resultado'>De acordo com as informações digitadas, o salário é R$".$salario."</p>";
            }
        ?>
</body>
</html>