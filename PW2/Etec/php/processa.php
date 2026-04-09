<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Processa.php</title>
</head>
<body>
    <?php
        if ($_SERVER["$REQUEST_METHOD"] == "POST") {
            $nome = $_POST['nome'];
            $email = $_POST['email'];

            if (!empty($nome) && !empty($email)) {
                echo "<h2>Dados Recebidos com sucesso!</h2>";
                echo "Nome: " . htmlspecialchars($nome) . "<br>";
                echo "E-mail: " . htmlspecialchars($email) . "<br>";
            } else {
                echo "Por favor, preencha os campos.";
            }
        }
    ?>
</body>
</html>