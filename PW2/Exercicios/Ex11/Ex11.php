<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculadora</title>
    <link rel="stylesheet" href="/Exercicios/Ex11/Ex11.css">
</head>
<body>
    <form name="calculadora" action="Ex11.php" method="POST">
        Digite o 1° Valor: <br>
        <input type="text" name="txtNum1"><br>
        Digite o 2° Valor: <br>
        <input type="text" name="txtNum2"><br>
        Selecione o Operador: <br>
        <select name="txtOperador">
            <option value="+">+ (Adição)</option>
            <option value="-">- (Subtração)</option>
            <option value="x">x (Multiplicação)</option>
            <option value="/">/ (Divisão)</option>
        </select><br>
        <input type="submit" value="Calcular">
    </form>

    <?php
    if ($_SERVER['REQUEST_METHOD'] === 'POST') {
        $num1 = floatval($_POST['txtNum1']);
        $num2 = floatval($_POST['txtNum2']);
        $operador = $_POST['txtOperador'];

        switch ($operador) {
            case '+':
                $resultado = $num1 + $num2;
                break;
            case '-':
                $resultado = $num1 - $num2;
                break;
            case 'x':
                $resultado = $num1 * $num2;
                break;
            case '/':
                if ($num2 != 0) {
                    $resultado = $num1 / $num2;
                } else {
                    echo "<p><strong>Erro: Divisão por zero!</strong></p>";
                    exit;
                }
                break;
        }

        echo "<p><strong>Resultado: $num1 $operador $num2 = $resultado</strong></p>";
    }
    ?>
    <a href="/Exercicios/Ex01/Ex01.php"><button type="button">← Voltar ao Início</button></a>
</body>
</html>