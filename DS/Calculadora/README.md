# 🧮 Calculadora em Java (Swing)

Projeto de uma calculadora com interface gráfica desenvolvida em **Java** utilizando a biblioteca **Swing**, como atividade da disciplina de Desenvolvimento de Sistemas.

---

## 📌 Sobre o Projeto

A calculadora permite realizar as seguintes operações com dois números:

- ➕ Soma
- ➖ Subtração
- ✖️ Multiplicação
- ➗ Divisão
- √ Raiz Quadrada (do 1º número)
- 🗑️ Limpar campos

---

## 🗂️ Diagrama de Classes

A classe `Calculadora` herda de `JFrame` e contém os seguintes atributos e métodos:

![Diagrama de Classes](docs/diagrama-classes.png)

| Tipo | Nome |
|------|------|
| `JLabel` | `rotulo1`, `rotulo2`, `exibir` |
| `JTextField` | `texto1`, `texto2` |
| `JButton` | `somar`, `subtrair`, `multiplicar`, `dividir`, `raiz`, `limpar` |
| Método | `Calculadora()` — construtor que monta a interface |
| Método | `main(String[] args)` — ponto de entrada da aplicação |

---

## ▶️ Demonstração

### Interface inicial

![Interface Inicial](docs/tela-inicial.png)

---

### Soma — 20 + 5 = 25

![Soma](docs/soma.png)

---

### Subtração — 20 - 5 = 15

![Subtração](docs/subtracao.png)

---

### Multiplicação — 20 × 5 = 100

![Multiplicação](docs/multiplicacao.png)

---

### Divisão — 20 ÷ 5 = 4

![Divisão](docs/divisao.png)

---

### Raiz Quadrada — √25 = 5.0

![Raiz Quadrada](docs/raiz.png)

---

### Após limpar os campos

![Limpar](docs/limpar.png)

---

## 🛠️ Tecnologias Utilizadas

- **Java** (JDK)
- **Swing** (`javax.swing.*`)
- **AWT** (`java.awt.*`, `java.awt.event.*`)
- IDE: **IntelliJ IDEA**

---

## 📁 Estrutura do Projeto

```
Calculadora/
└── src/
    └── main/
        └── java/
            └── org/
                └── example/
                    └── Main.java
```

---

## 🚀 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/Isaac-Nogueira/ETEC-Zona-Leste.git
   ```
2. Navegue até a pasta do projeto:
   ```bash
   cd ETEC-Zona-Leste/DS/Calculadora
   ```
3. Compile e execute o arquivo `Main.java` com sua IDE ou pelo terminal:
   ```bash
   javac Main.java
   java Main
   ```

---

## 👨‍🎓 Informações

| Campo | Detalhe |
|-------|---------|
| Aluno | Isaac Dantas Nogueira |
| Escola | ETEC da Zona Leste |
| Turma | 2° DS MAS |
| Professor | Carlos Alberto |
| Disciplina | Desenvolvimento de Sistemas |
| Data | 07/05/2026 |
