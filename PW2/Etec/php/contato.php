<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Etec - Contato</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
    <link rel="stylesheet" href="../css/contato.css">
    <link rel="icon" href="../img/cps-favicon.png">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Nunito+Sans:ital,opsz,wght@0,6..12,200..1000;1,6..12,200..1000&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="../php/processa.php">
</head>
<body>
    <header>
        <div class="logo">
            <a href="index.php"><img src="../img/cps-logo.png" alt="Logo CPS"></a>
        </div>
        <nav>
            <ul>
                <li><a href="../php/index.php">Início</a></li>
                <li><a href="../php/cursos.php">Cursos</a></li>
                <li><a href="../php/contato.php" class="ativa">Contato</a></li>
                <li><a href="../php/sobre_nos.php">Sobre nós</a></li>
                <li><a href="../php/vestibulinho.php">Vestibulinho</a></li>
            </ul>
        </nav>
    </header>
    <h1>Entre em Contato</h1>
    <form id="formContato" action="processa.php">
        <label for="nome">Nome: </label>
        <input type="text" name="nome" id="nome" required>
        <label for="email">E-mail: </label>
        <input type="text" name="email" id="email" required>
        <label>Mensagem: </label>
        <textarea name="mensagem" rows="4"></textarea>
        <button type="submit">Enviar Dados</button>
    </form>
    <div class="content"></div>
    <footer>
        <div class="footer-container">
            <div class="footer-col">
                <img src="../img/cps-logo.png" alt="Logo CPS" class="footer-logo">
                <p>Formação Técnica Gratuita e de Qualidade</p>
            </div>
            <div class="footer-col">
                <h4>Links Rápidos</h4>
                <ul>
                    <div>
                        <li><a href="../php/index.php">Início</a></li>
                        <li><a href="../php/cursos.php">Cursos</a></li>
                        <li><a href="../php/vestibulinho.php">Vestibulinho</a></li>
                    </div>
                    <div>
                        <li><a href="../php/sobre_nos.php">Sobre nós</a></li>
                        <li><a href="../php/contato.php">Contato</a></li>
                    </div>
                </ul>
            </div>
            <div class="footer-col">
                <h4>Contato</h4>
                <p>📍 Rua Conselheiro Carrão, 900 - Vila Carrão, São Paulo</p>
                <p>📞 (11) 2045-4000</p>
                <p>✉️ eteczonaleste@cps.sp.gov.br</p>
            </div>
        </div>
        <div class="footer-bottom">
            <p>© 2024 Etec da Zona Leste — Todos os direitos reservados</p>
        </div>
    </footer>
    <script> // Script criado por inteligência artificial para fazer com que a mensagem de que os dados do usuário chegaram apareça em uma caixa ao invés de uma outra página processa.php
        document.getElementById('formContato').addEventListener('submit', function(e) {
            e.preventDefault(); // cancela o redirecionamento
            // cria e exibe a mensagem
            const msg = document.createElement('p');
            msg.textContent = 'Seus dados foram recebidos com sucesso! Entraremos em contato em breve.';
            msg.style.cssText = 'text-align:center; color:#97010a; font-size:1.2rem; font-weight:600; margin: 40px auto;';
            this.parentNode.insertBefore(msg, this);
        });
    </script>
</body>
</html>
