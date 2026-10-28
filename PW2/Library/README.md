# Catálogo de livros

Aplicação web em PHP que consulta a API pública da [Open Library](https://openlibrary.org), recebe os dados em JSON, processa as informações e as apresenta de forma dinâmica ao usuário.

## Finalidade

O sistema funciona como um catálogo de pesquisa de livros. O usuário informa um título, um autor, um assunto ou uma combinação deles, e o servidor busca no acervo da Open Library, que reúne milhões de obras catalogadas pelo Internet Archive.

O projeto também demonstra, na prática, o consumo de uma API REST por uma aplicação PHP:

1. o usuário preenche o formulário e clica em **Pesquisar**;
2. o PHP valida os dados e monta a requisição;
3. o PHP faz uma requisição HTTP `GET` à API (`https://openlibrary.org/search.json`);
4. a API responde em formato JSON;
5. o PHP converte o JSON com `json_decode()` e exibe os resultados na página.

## Funcionalidades

- Pesquisa por **título**, **autor** e **assunto**, de forma isolada ou combinada
- Resultados com **20 livros por página** e navegação entre páginas
- Exibição de capa, título, autores, ano da primeira publicação, número de edições e assuntos
- Link para a página completa de cada livro na Open Library
- Mensagens claras para campos vazios, nenhum resultado e falhas de conexão
- Layout simples e responsivo, em azul e off-white

## Tecnologias

- **PHP 8+** com a extensão **cURL** para as requisições HTTP
- **HTML e CSS** (o CSS está embutido no `index.php`)
- **API da Open Library** (sem necessidade de chave)

## Como executar

### Com o XAMPP

1. Abra o XAMPP Control Panel e inicie o **Apache**.
2. Copie a pasta `biblioteca` para `C:\xampp\htdocs\`.
3. Acesse `http://localhost/biblioteca/` no navegador.

### Com o servidor embutido do PHP

```bash
cd biblioteca
php -S localhost:8000
```

Depois acesse `http://localhost:8000`.

## Estrutura do projeto

```
biblioteca/
├── index.php   # lógica em PHP, HTML e CSS da página
└── README.md   # este arquivo
```

## Configuração

Em `index.php`, altere a constante `AGENTE_USUARIO` para incluir o seu e-mail. A Open Library pede que as aplicações que usam a API se identifiquem.

Para mudar a quantidade de livros por página, altere a constante `LIVROS_POR_PAGINA`.

## Observações

- A busca funciona melhor com títulos e termos em inglês ou no nome original da obra. Em português, costuma retornar menos resultados.
- Nem todos os livros têm capa, ano ou assuntos cadastrados. A página mostra apenas o que existe.
- Todo texto exibido passa por `htmlspecialchars()` para evitar a injeção de HTML.

## Créditos

Dados fornecidos pela [Open Library](https://openlibrary.org), projeto do Internet Archive.
