<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cálculo de Salário</title>
    <link href="calcularsalario.php">
    <link rel="stylesheet" href="calcularsalario.css">
</head>
<body>
    <form name="frmsalario" action="calcularsalario.php" method="POST">
        Digite a quantidade de horas trabalhadas
        <input type="text" name="txthoras"><br>
        Digite o valor da hora em R$
        <input type="text" name="txtvalor"><br>
        <input type="submit" value="Salario"><br>
        <input type="reset" value="Limpar"><br>
    </form>
</body>
</html>