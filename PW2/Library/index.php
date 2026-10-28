<?php
declare(strict_types=1);

/**
 * Catálogo de livros com a Open Library (https://openlibrary.org).
 * Fluxo: formulário (GET) -> PHP valida -> GET em search.json -> json_decode -> exibição.
 */

const URL_API         = 'https://openlibrary.org/search.json';
const LIVROS_POR_PAGINA = 20;
// A Open Library pede que a aplicação se identifique. Troque pelo seu e-mail.
const AGENTE_USUARIO  = 'CatalogoDeLivros/1.0 (seu-email@exemplo.com)';

/** Consulta a Open Library e devolve o JSON decodificado em forma de array. */
function buscarLivros(array $filtros, int $pagina): array
{
    $parametros = $filtros + [
        'fields' => 'key,title,author_name,first_publish_year,cover_i,edition_count,subject',
        'limit'  => LIVROS_POR_PAGINA,
        'page'   => $pagina,
    ];
    $url = URL_API . '?' . http_build_query($parametros);

    $conexao = curl_init($url);
    curl_setopt_array($conexao, [
        CURLOPT_RETURNTRANSFER => true,
        CURLOPT_TIMEOUT        => 15,
        CURLOPT_CONNECTTIMEOUT => 5,
        CURLOPT_FOLLOWLOCATION => true,
        CURLOPT_USERAGENT      => AGENTE_USUARIO,
        CURLOPT_HTTPHEADER     => ['Accept: application/json'],
    ]);
    $resposta  = curl_exec($conexao);
    $status    = (int) curl_getinfo($conexao, CURLINFO_HTTP_CODE);
    $erroCurl  = curl_error($conexao);
    curl_close($conexao);

    if ($resposta === false) {
        throw new RuntimeException("Não foi possível conectar à Open Library ({$erroCurl}).");
    }
    if ($status === 429) {
        throw new RuntimeException('Muitas consultas em pouco tempo. Aguarde um instante e tente de novo.');
    }
    if ($status !== 200) {
        throw new RuntimeException("A Open Library respondeu com erro HTTP {$status}.");
    }

    $dados = json_decode($resposta, true);
    if (!is_array($dados) || !isset($dados['docs'])) {
        throw new RuntimeException('A resposta da Open Library não está no formato esperado.');
    }
    return $dados;
}

/** Escapa um texto para exibição segura em HTML. */
function escapar(?string $texto): string
{
    return htmlspecialchars((string) $texto, ENT_QUOTES | ENT_SUBSTITUTE, 'UTF-8');
}

/** Monta o endereço de uma página de resultados mantendo os filtros. */
function enderecoDaPagina(int $numero, string $titulo, string $autor, string $assunto): string
{
    return '?' . http_build_query([
        'titulo'  => $titulo,
        'autor'   => $autor,
        'assunto' => $assunto,
        'pagina'  => $numero,
    ]);
}

// ---------- Entrada ----------
$titulo  = trim((string) ($_GET['titulo']  ?? ''));
$autor   = trim((string) ($_GET['autor']   ?? ''));
$assunto = trim((string) ($_GET['assunto'] ?? ''));
$pagina  = max(1, (int) ($_GET['pagina'] ?? 1));

$pesquisou = isset($_GET['titulo']) || isset($_GET['autor']) || isset($_GET['assunto']);

// Nomes dos parâmetros conforme a API da Open Library; só entram os campos preenchidos.
$filtros = array_filter(
    ['title' => $titulo, 'author' => $autor, 'subject' => $assunto],
    fn(string $valor): bool => $valor !== ''
);

$livros = [];
$total  = 0;
$erro   = null;

if ($pesquisou) {
    if ($filtros === []) {
        $erro = 'Preencha pelo menos um campo para pesquisar.';
    } else {
        try {
            $dados  = buscarLivros($filtros, $pagina);
            $livros = $dados['docs'];
            $total  = (int) ($dados['numFound'] ?? 0);
        } catch (Throwable $excecao) {
            $erro = $excecao->getMessage();
        }
    }
}

$totalPaginas = max(1, (int) ceil($total / LIVROS_POR_PAGINA));
?>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Catálogo de livros</title>
    <style>
        :root {
            --azul: rgb(24, 40, 84);
            --fundo: #f6f4ee;
            --superficie: #fdfcf9;
            --borda: #dcd8cc;
            --texto-suave: #5a6379;
        }

        * { box-sizing: border-box; }

        body {
            margin: 0;
            background: var(--fundo);
            color: var(--azul);
            font-family: system-ui, -apple-system, "Segoe UI", Roboto, sans-serif;
            line-height: 1.5;
        }

        main {
            max-width: 720px;
            margin: 0 auto;
            padding: 8vh 1.25rem 3rem;
        }

        .topo { text-align: center; margin-bottom: 2rem; }
        h1 { margin: 0 0 .4rem; font-family: Georgia, "Times New Roman", serif; font-size: 2.2rem; font-weight: 700; }
        .topo p { margin: 0; color: var(--texto-suave); }

        /* Formulário */
        .formulario {
            display: grid;
            gap: 1rem;
            padding: 1.75rem;
            background: var(--superficie);
            border: 1px solid var(--borda);
            border-radius: 8px;
        }

        .campo label { display: block; margin-bottom: .3rem; font-size: .95rem; font-weight: 600; }

        input {
            width: 100%;
            padding: .65rem .8rem;
            font: inherit;
            color: var(--azul);
            background: #fff;
            border: 1px solid var(--borda);
            border-radius: 6px;
        }
        input::placeholder { color: #9aa1b2; }

        button {
            padding: .75rem 1rem;
            font: inherit;
            font-weight: 600;
            color: var(--fundo);
            background: var(--azul);
            border: 0;
            border-radius: 6px;
            cursor: pointer;
        }
        button:hover { background: rgb(14, 26, 60); }

        input:focus-visible, button:focus-visible, a:focus-visible {
            outline: 3px solid rgba(24, 40, 84, .35);
            outline-offset: 2px;
        }

        /* Resultados */
        .resultados { margin-top: 2rem; }

        .aviso {
            margin: 0;
            padding: 1.25rem;
            text-align: center;
            color: var(--texto-suave);
            border: 1px dashed var(--borda);
            border-radius: 8px;
        }
        .aviso.erro { color: #8a1c1c; border: 1px solid #e3b8b8; background: #fbf1f1; }

        .contagem { margin: 0 0 .75rem; font-size: .9rem; color: var(--texto-suave); }

        .lista { list-style: none; margin: 0; padding: 0; display: grid; gap: .8rem; }

        .livro {
            display: flex;
            gap: 1rem;
            padding: 1rem;
            background: var(--superficie);
            border: 1px solid var(--borda);
            border-radius: 8px;
        }

        .livro img { flex: none; width: 90px; height: 135px; object-fit: cover; border-radius: 3px; background: var(--borda); }

        .sem-capa {
            flex: none;
            display: grid;
            place-items: center;
            width: 90px;
            height: 135px;
            font-size: .8rem;
            color: var(--texto-suave);
            background: #ece9df;
            border-radius: 3px;
        }

        .info { min-width: 0; }
        .info h2 { margin: 0; font-family: Georgia, "Times New Roman", serif; font-size: 1.15rem; line-height: 1.3; }
        .info p { margin: .2rem 0 0; }
        .autor { font-weight: 600; }
        .dados, .assuntos { font-size: .9rem; color: var(--texto-suave); }

        a { color: var(--azul); text-underline-offset: 3px; }
        .info a { display: inline-block; margin-top: .5rem; font-size: .9rem; }

        .paginacao {
            display: flex;
            justify-content: center;
            align-items: center;
            gap: 1.25rem;
            margin-top: 1.5rem;
            font-size: .95rem;
        }

        footer { margin-top: 2.5rem; text-align: center; font-size: .85rem; color: var(--texto-suave); }

        @media (max-width: 480px) {
            h1 { font-size: 1.8rem; }
            .formulario { padding: 1.25rem; }
            .livro img, .sem-capa { width: 70px; height: 105px; }
        }
    </style>
</head>
<body>
    <main>
        <header class="topo">
            <h1>Catálogo de livros</h1>
            <p>Pesquise no acervo da Open Library por título, autor ou assunto.</p>
        </header>

        <form method="get" action="" class="formulario">
            <div class="campo">
                <label for="titulo">Título:</label>
                <input type="text" id="titulo" name="titulo" value="<?= escapar($titulo) ?>" placeholder="Ex.: Dom Casmurro">
            </div>
            <div class="campo">
                <label for="autor">Autor:</label>
                <input type="text" id="autor" name="autor" value="<?= escapar($autor) ?>" placeholder="Ex.: Machado de Assis">
            </div>
            <div class="campo">
                <label for="assunto">Assunto:</label>
                <input type="text" id="assunto" name="assunto" value="<?= escapar($assunto) ?>" placeholder="Ex: Romance">
            </div>
            <button type="submit">Pesquisar Livro</button>
        </form>

        <section class="resultados" aria-live="polite">
            <?php if ($erro): ?>
                <p class="aviso erro" role="alert"><?= escapar($erro) ?></p>

            <?php elseif (!$pesquisou): ?>
                <p class="aviso">Os livros encontrados aparecerão aqui.</p>

            <?php elseif ($livros === []): ?>
                <p class="aviso">Nenhum livro encontrado. Tente menos palavras ou outra grafia.</p>

            <?php else: ?>
                <?php
                    $primeiro = ($pagina - 1) * LIVROS_POR_PAGINA + 1;
                    $ultimo   = $primeiro + count($livros) - 1;
                ?>
                <p class="contagem">
                    <?= number_format($total, 0, ',', '.') ?> resultados · mostrando <?= $primeiro ?>–<?= $ultimo ?>
                </p>

                <ul class="lista">
                    <?php foreach ($livros as $livro): ?>
                        <?php
                            $capa     = isset($livro['cover_i']) ? "https://covers.openlibrary.org/b/id/{$livro['cover_i']}-M.jpg" : null;
                            $autores  = array_slice($livro['author_name'] ?? [], 0, 3);
                            $assuntos = array_slice($livro['subject'] ?? [], 0, 3);
                            $ano      = $livro['first_publish_year'] ?? null;
                            $edicoes  = $livro['edition_count'] ?? null;
                        ?>
                        <li class="livro">
                            <?php if ($capa): ?>
                                <img src="<?= escapar($capa) ?>" alt="Capa de <?= escapar($livro['title'] ?? '') ?>" loading="lazy" width="90" height="135">
                            <?php else: ?>
                                <div class="sem-capa">Sem capa</div>
                            <?php endif; ?>

                            <div class="info">
                                <h2><?= escapar($livro['title'] ?? 'Sem título') ?></h2>
                                <?php if ($autores): ?>
                                    <p class="autor"><?= escapar(implode(', ', $autores)) ?></p>
                                <?php endif; ?>
                                <p class="dados">
                                    <?php if ($ano): ?>Publicação: <?= escapar((string) $ano) ?><?php endif; ?>
                                    <?php if ($ano && $edicoes): ?> · <?php endif; ?>
                                    <?php if ($edicoes): ?><?= (int) $edicoes ?> <?= $edicoes == 1 ? 'edição' : 'edições' ?><?php endif; ?>
                                </p>
                                <?php if ($assuntos): ?>
                                    <p class="assuntos"><?= escapar(implode(', ', $assuntos)) ?></p>
                                <?php endif; ?>
                            </div>
                        </li>
                    <?php endforeach; ?>
                </ul>

                <?php if ($totalPaginas > 1): ?>
                    <nav class="paginacao" aria-label="Paginação">
                        <?php if ($pagina > 1): ?>
                            <a href="<?= escapar(enderecoDaPagina($pagina - 1, $titulo, $autor, $assunto)) ?>">Anterior</a>
                        <?php endif; ?>
                        <span>Página <?= $pagina ?> de <?= number_format($totalPaginas, 0, ',', '.') ?></span>
                        <?php if ($pagina < $totalPaginas): ?>
                            <a href="<?= escapar(enderecoDaPagina($pagina + 1, $titulo, $autor, $assunto)) ?>">Próxima</a>
                        <?php endif; ?>
                    </nav>
                <?php endif; ?>
            <?php endif; ?>
        </section>

        <footer>API usada: <a href="https://openlibrary.org" target="_blank" rel="noopener">Open Library</a>.</footer>
    </main>
</body>
</html>
