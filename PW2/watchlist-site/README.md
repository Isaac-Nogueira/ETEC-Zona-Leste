<div align="center">

# 🎬 WATCHLIST — Gerenciador de Filmes e Séries

<p>
  Sistema CRUD completo para organizar filmes e séries que você já assistiu,
  está assistindo, ou pretende ver — com nota pessoal, plataforma de streaming
  e capa personalizada.
</p>

<p>
  <img src="https://img.shields.io/badge/status-concluído-brightgreen" alt="status">
  <img src="https://img.shields.io/badge/licença-MIT-blue" alt="licença">
  <img src="https://img.shields.io/badge/versão-1.0.0-green" alt="versão">
</p>

<p>
  <a href="#-sobre">Sobre</a> •
  <a href="#-funcionalidades">Funcionalidades</a> •
  <a href="#%EF%B8%8F-tecnologias-utilizadas">Tecnologias</a> •
  <a href="#-instalação">Instalação</a> •
  <a href="#-o-que-precisa-ser-entregueocopiado-junto">Entrega/Cópia</a> •
  <a href="#-estrutura-do-projeto">Estrutura</a>
</p>

</div>

---

## 📖 Sobre

A Watchlist é um sistema de gerenciamento pessoal de filmes e séries, desenvolvido
como CRUD completo em PHP + MySQL. A proposta resolve um problema bem comum: perder
o controle do que já foi assistido, do que está pausado no meio, e daquela lista
infinita de "quero ver algum dia".

Cada produção cadastrada guarda título, tipo (filme ou série), plataforma de
streaming, gênero, uma capa (pôster), nota pessoal de 0 a 10, e um status que
reflete o progresso real de quem assiste: **Quero Ver**, **Assistindo** ou
**Assistido**.

## ✨ Funcionalidades

- ✅ Cadastro, edição e exclusão de produções (CRUD completo com PDO e SQL Injection prevenido via prepared statements)
- ✅ Upload de capa personalizada (JPG, PNG ou WEBP, até 5MB), com preview na edição
- ✅ Três status de acompanhamento: **Quero Ver**, **Assistindo** e **Assistido**
- ✅ Nota pessoal (0 a 10, opcional) para produções já assistidas
- ✅ Filtro por status direto na listagem
- ✅ Contador geral no topo (total de produções, quantas assistidas, quantas em andamento)
- ✅ Confirmação de exclusão com modal customizado (mostrando o título da produção)
- ✅ Mensagens de sucesso (toast) ao cadastrar, editar ou excluir
- ✅ Interface própria em tema escuro "cinema noturno" (paleta marsala + preto), sem depender de frameworks CSS externos

## 🎨 Design

O visual foge do padrão genérico de tabela + Bootstrap: cada produção é exibida
como um card no formato de pôster de cinema (proporção 2:3), organizados em grid
responsivo. A paleta remete às cores mais associadas a plataformas de streaming —
tons de marsala sobre fundo quase preto — com tipografia condensada (Oswald) nos
títulos e Work Sans no corpo do texto.

## 🛠️ Tecnologias utilizadas

<div align="center">
 <img src="https://img.shields.io/badge/PHP-777BB4?style=for-the-badge&logo=php&logoColor=white">
 <img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white">
 <img src="https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white">
 <img src="https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white">
 <img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black">
</div>

- **PHP** com **PDO** (PHP Data Objects) para conexão e queries preparadas
- **MySQL / MariaDB** como banco de dados
- **CSS puro** (sem frameworks) para toda a interface
- **JavaScript vanilla** para o modal de confirmação de exclusão

## 📦 Pré-requisitos

- XAMPP (ou outro pacote com Apache + PHP + MySQL)
- Um navegador atualizado

## 🚀 Instalação

```bash
# 1. Copie a pasta do projeto para o htdocs do XAMPP
#    Ex: C:\xampp\htdocs\watchlist

# 2. Inicie o Apache e o MySQL pelo painel do XAMPP

# 3. Acesse o phpMyAdmin
http://localhost/phpmyadmin

# 4. Importe o arquivo watchlist.sql (aba "Importar")
#    Isso cria o banco `watchlist` e a tabela `producoes`
```

Confira também se as credenciais em `conexao.php` batem com seu ambiente
(por padrão, usuário `root` e senha em branco, configuração default do XAMPP).

## ▶️ Como usar

```bash
# Com Apache e MySQL rodando, acesse:
http://localhost/watchlist/index.php
```

- **+ Adicionar Produção**: cadastra um novo filme/série
- **Filtros no topo**: alternam entre Todos, Quero Ver, Assistindo e Assistido
- **Editar**: atualiza os dados e permite trocar a capa
- **Excluir**: remove o registro (com confirmação) e apaga a imagem de capa do disco

## 📤 O que precisa ser entregue/copiado junto

Este projeto salva as capas dos filmes/séries como arquivos de imagem na pasta
`uploads/capas/`. O banco de dados (`watchlist.sql`) guarda apenas o **nome**
de cada arquivo, não a imagem em si.

Por isso, ao importar ou entregar o projeto, é necessário levar **os dois
pacotes juntos**:

1. **`watchlist.sql`** — estrutura do banco + registros cadastrados
2. **Pasta do projeto completa**, incluindo `uploads/capas/` com todas as
   imagens dentro

Se apenas o `.sql` for importado sem a pasta `uploads/capas/`, os registros
aparecerão normalmente, mas as capas ficarão quebradas (imagem não encontrada).

### Como importar em uma nova máquina
1. Copie a pasta do projeto (com `uploads/capas/` incluída) para `htdocs/`
2. No phpMyAdmin, crie/importe o banco a partir do `watchlist.sql`
3. Confira se a pasta `uploads/capas/` tem permissão de escrita (necessário
   para novos cadastros de capa)

## 📁 Estrutura do projeto

```
watchlist/
├── uploads/
│   └── capas/          # imagens de capa enviadas (não incluídas no .sql)
├── conexao.php          # conexão PDO com o banco
├── index.php             # listagem (grid de cards) + filtros + contador
├── criar.php              # formulário de cadastro
├── editar.php             # formulário de edição
├── excluir.php            # remove registro + imagem de capa
├── style.css              # tema visual (marsala + preto)
└── watchlist.sql           # estrutura do banco + dados de exemplo
```

## 🗃️ Estrutura do banco de dados

Tabela `producoes`:

| Campo          | Tipo                                          | Observação                    |
|----------------|------------------------------------------------|--------------------------------|
| `id`           | INT, AUTO_INCREMENT, PK                        |                                 |
| `titulo`       | VARCHAR(150)                                    |                                 |
| `tipo`         | ENUM('Filme', 'Série')                          |                                 |
| `plataforma`   | VARCHAR(50)                                     | Ex: Netflix, HBO Max            |
| `genero`       | VARCHAR(50)                                     | Ex: Drama, Ficção Científica    |
| `nota_pessoal` | DECIMAL(3,1)                                    | Opcional, de 0 a 10              |
| `status`       | ENUM('quero_ver', 'assistindo', 'assistido')    |                                 |
| `capa`         | VARCHAR(255)                                    | Nome do arquivo em `uploads/capas/` |

---

<div align="center">
  <sub>Projeto acadêmico adaptado a partir de um modelo de CRUD PHP + MySQL.</sub>
</div>
