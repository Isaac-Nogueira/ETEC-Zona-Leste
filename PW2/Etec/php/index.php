<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Etec da Zona Leste</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
    <link rel="stylesheet" href="../css/style.css">
    <link rel="icon" href="../img/cps-favicon.png">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Nunito+Sans:ital,opsz,wght@0,6..12,200..1000;1,6..12,200..1000&display=swap" rel="stylesheet">
</head>
<body>
    <header>
        <div class="logo">
            <a href="index.php"><img src="../img/cps-logo.png" alt="Logo CPS"></a>
        </div>
        <nav>
            <ul>
                <li><a href="../php/index.php" class="ativa">Início</a></li>
                <li><a href="../php/cursos.php">Cursos</a></li>
                <li><a href="../php/contato.php">Contato</a></li>
                <li><a href="../php/sobre_nos.php">Sobre nós</a></li>
                <li><a href="../php/vestibulinho.php">Vestibulinho</a></li>
            </ul>
        </nav>
    </header>
    <div id="carouselExampleCaptions" class="carousel slide">
        <div class="carousel-indicators">
            <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
            <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
        </div>
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img src="../img/carrossel/img1.png" class="d-block w-100" alt="img1">
                <div class="carousel-caption d-none d-md-block">
                    <h1><b>Bem-vindo(a) ao site oficial da Etec da Zona Leste!</b></h1>
                    <a href="../php/sobre_nos.php">
                        <h3>Conheca um pouco de nossa história!</h3>
                    </a>
                </div>
            </div>
            <div class="carousel-item">
                <img src="../img/carrossel/img2.png" class="d-block w-100" alt="img2">
                <div class="carousel-caption d-none d-md-block">
                    <a href="../php/noticias.php">
                        <h3>Verifique as nossas opcões de Cursos e venha estudar na Etec!</h3>
                    </a>
                </div>
            </div>
        </div>
        <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Previous</span>
        </button>
        <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Next</span>
        </button>
    </div>
    <div class="cursos-destaque">
        <h1><b>Cursos em destaque</b></h1>
        <div class="cards-cursos">
            <a href="../php/cursos.php">
                <div class="sj">
                    <h3>⚖️ Serviços Jurídicos</h3>
                    <hr>
                    <p>
                        O curso oferece uma abordagem abrangente das leis e normas que regem as diferentes esferas da sociedade e das relações comerciais. 
                        Os alunos mergulharam em áreas essenciais do Direito, como o direito constitucional, que explora a estrutura e os princípios fundamentais da Constituição Federal.
                    </p>
                </div>
            </a>
            <a href="../php/cursos.php">
                <div class="ds-ams">
                    <h3>💻 Desenvolvimeto de Sistemas AMS</h3>
                    <hr>
                    <p>
                        É o profissional que analisa e projeta sistemas. Constrói, documenta, realiza testes e mantém sistemas de informação.
                        Utiliza ambientes de desenvolvimento e linguagens de programação específica. Modela, implementa e mantém bancos de dados.
                    </p>
                </div>
            </a>
            <a href="../php/cursos.php">
                <div class="adm">
                    <h3>📊 Administração</h3>
                    <hr>
                    <p>
                        O aluno vai aprender ainda a analisar as chances de um negócio ou produto ser bem-sucedido e o comportamento do consumidor. 
                        Estudará também técnicas de atendimento ao cliente, empreendedorismo (iniciativas para realizar novos negócios) e como uma
                         organização planeja alcançar seus objetivos e define suas metas para o futuro.
                    </p>
                </div>
            </a>
        </div>
        <a href="../php/cursos.php" class="botao-cursos"><b>Veja todas as opções</b></a>
    </div>
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
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>
</body>
</html>