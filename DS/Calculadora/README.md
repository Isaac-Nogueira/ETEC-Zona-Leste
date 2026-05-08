# 🧮 Calculadora em Java

**Disciplina:** Desenvolvimento de Sistemas  
**Professor:** Carlos Alberto  
**Aluno:** Isaac Dantas Nogueira  
**Instituição:** ETEC da Zona Leste – 2°DS MAS  
**Data:** 07/05/2026

---

## 📋 Descrição

Projeto de uma calculadora desktop desenvolvida em Java com interface gráfica (Swing/JFrame), capaz de realizar operações de soma, subtração, multiplicação, divisão e raiz quadrada.

---

## 🗂️ Diagrama de Classes

```
┌─────────────────────────────────┐
│           Calculadora           │
├─────────────────────────────────┤
│ - rotulo1 : JLabel              │
│ - rotulo2 : JLabel              │
│ - texto1  : JTextField          │
│ - texto2  : JTextField          │
│ - somar   : JButton             │
│ - subtrair: JButton             │
│ - multiplicar : JButton         │
│ - dividir : JButton             │
│ - raiz    : JButton             │
│ - limpar  : JButton             │
│ - exibir  : JLabel              │
├─────────────────────────────────┤
│ + Calculadora() : void          │
│ + main(String[] args) : void    │
└─────────────────────────────────┘
         |
         └──> extends JFrame
```

---

## ⚙️ Funcionalidades

- ➕ Soma
- ➖ Subtração
- ✖️ Multiplicação
- ➗ Divisão
- √ Raiz Quadrada
- 🗑️ Limpar campos

---

## 🖥️ Como executar

1. Clone o repositório:
```bash
   git clone https://github.com/Isaac-Nogueira/ETEC-ZonaLeste.git
```
2. Acesse a pasta do projeto:
```bash
   cd ETEC-ZonaLeste/DS/Calculadora
```
3. Compile e execute:
```bash
   javac Main.java
   java Main
```

---

## 🛠️ Tecnologias utilizadas

- Java
- Swing (JFrame, JButton, JLabel, JTextField)

---

## 🔗 Link do Projeto

[GitHub – Calculadora](https://github.com/Isaac-Nogueira/ETEC-ZonaLeste/tree/main/DS/Calculadora)
