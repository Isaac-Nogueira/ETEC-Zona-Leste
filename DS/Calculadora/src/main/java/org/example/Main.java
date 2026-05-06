package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculadora extends JFrame {
    JLabel rotulo1, rotulo2, exibir;

    JTextField texto1, texto2;

    JButton somar, subtrair, multiplicar, dividir, raiz, limpar;

    public Calculadora() {
        super("Calculadora");

        Container tela = getContentPane();

        setLayout(null);

        // ------ Definindo od Elementos ------ //

        rotulo1 = new JLabel("1° Número: ");
        rotulo2 = new JLabel("2° Número: ");

        texto1 = new JTextField(5);
        texto2 = new JTextField(5);

        somar = new JButton("Somar");
        subtrair = new JButton("Subtrair");
        multiplicar = new JButton("Multiplicar");
        dividir = new JButton("Dividir");
        raiz = new JButton("Raiz");
        limpar = new JButton("Limpar");

        exibir = new JLabel("");

        // ------ Posicionando os Elementos ------ //

        rotulo1.setBounds(50, 20, 100, 20);
        rotulo2.setBounds(50, 60, 100, 20);

        texto1.setBounds(140, 20, 200, 20);
        texto2.setBounds(140, 60, 200, 20);

        somar.setBounds(50, 110, 140, 20);
        subtrair.setBounds(200, 110, 140, 20);
        multiplicar.setBounds(50, 140, 140, 20);
        dividir.setBounds(200, 140,140, 20);
        raiz.setBounds(50, 170, 140, 20);
        limpar.setBounds(200, 170, 140, 20);

        exibir.setBounds(50, 210, 200, 20);

        // ------ Definindo a Fonte do Texto dos Elementos ------ //

        rotulo1.setFont(new Font("Times New Roman", Font.BOLD, 17));
        rotulo2.setFont(new Font("Times New Roman", Font.BOLD, 17));

        texto1.setFont(new Font("Times New Roman", Font.BOLD, 17));
        texto2.setFont(new Font("Times New Roman", Font.BOLD, 17));

        exibir.setFont(new Font("Times New Roman", Font.BOLD, 17));

        somar.setFont(new Font("Times New Roman", Font.BOLD, 17));
        subtrair.setFont(new Font("Times New Roman", Font.BOLD, 17));
        multiplicar.setFont(new Font("Times New Roman", Font.BOLD, 17));
        dividir.setFont(new Font("Times New Roman", Font.BOLD, 17));
        raiz.setFont(new Font("Times New Roman", Font.BOLD, 17));
        limpar.setFont(new Font("Time New Roman", Font.BOLD, 17));

        // ------ Definindo a Cor do Texto dos Elementos ------ //

        rotulo1.setForeground(new Color(247, 248, 252));
        rotulo2.setForeground(new Color(247, 248, 252));

        texto1.setForeground(new Color(247, 248, 252));
        texto2.setForeground(new Color(247, 248, 252));

        exibir.setForeground(new Color(247, 248, 252));

        somar.setForeground(new Color(247, 248, 252));
        subtrair.setForeground(new Color(247, 248, 252));
        multiplicar.setForeground(new Color(247, 248, 252));
        dividir.setForeground(new Color(247, 248, 252));
        raiz.setForeground(new Color(247, 248, 252));
        limpar.setForeground(new Color(247, 248, 252));

        // ------ Definindo a Cor do Backgroundo dos Elementos ------ //

        texto1.setBackground(new Color(63, 94, 102));
        texto2.setBackground(new Color(63, 94, 102));

        somar.setBackground(new Color(74, 117, 128));
        subtrair.setBackground(new Color(74, 117, 128));
        multiplicar.setBackground(new Color(74, 117, 128));
        dividir.setBackground(new Color(74, 117, 128));
        raiz.setBackground(new Color(74, 117, 128));
        limpar.setBackground(new Color(74, 117, 128));

        tela.setBackground(new Color(49, 76, 83));

        // ------ Definindo o Conteúdo das Operações ------ //

        somar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int numero1, numero2, soma;

                        soma = 0;

                        numero1 = Integer.parseInt(texto1.getText());
                        numero2 = Integer.parseInt(texto2.getText());

                        soma = numero1 + numero2;

                        exibir.setVisible(true);
                        exibir.setText("A Soma é: " + soma);
                    }
                }
        );

        subtrair.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int numero1, numero2, subtracao;

                        subtracao = 0;

                        numero1 = Integer.parseInt(texto1.getText());
                        numero2 = Integer.parseInt(texto2.getText());

                        subtracao = numero1 - numero2;

                        exibir.setVisible(true);
                        exibir.setText("A Subtração é: " + subtracao);
                    }
                }
        );

        multiplicar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int numero1, numero2, multiplicacao;

                        multiplicacao = 0;

                        numero1 = Integer.parseInt(texto1.getText());
                        numero2 = Integer.parseInt(texto2.getText());

                        multiplicacao = numero1 * numero2;

                        exibir.setVisible(true);
                        exibir.setText("A Multiplicação é: " + multiplicacao);
                    }
                }
        );

        dividir.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int numero1, numero2, divisao;

                        divisao = 0;

                        numero1 = Integer.parseInt(texto1.getText());
                        numero2 = Integer.parseInt(texto2.getText());

                        divisao = numero1 / numero2;

                        exibir.setVisible(true);
                        exibir.setText("A Divisão é: " + divisao);
                    }
                }
        );

        raiz.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int numero1, numero2;
                        double raizquadrada, somaNumeros;

                        raizquadrada = 0;

                        numero1 = Integer.parseInt(texto1.getText());
                        numero2 = Integer.parseInt(texto2.getText());

                        somaNumeros = numero1 + numero2;

                        raizquadrada = Math.sqrt(somaNumeros);

                        exibir.setVisible(true);
                        exibir.setText("A Raiz é: " + raizquadrada);
                    }
                }
        );

        limpar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        texto1.setText("");
                        texto2.setText("");
                    }
                }
        );

        // ------ Definindo o Elemento Exibir como false ------ //

        exibir.setVisible(false);

        // ------ Adicionando os Elementos ------ //

        tela.add(rotulo1);
        tela.add(rotulo2);

        tela.add(texto1);
        tela.add(texto2);

        tela.add(somar);
        tela.add(subtrair);
        tela.add(multiplicar);
        tela.add(dividir);
        tela.add(raiz);
        tela.add(limpar);

        tela.add(exibir);

        // ------ Definindo a Dimensão da Tela ------ //

        setSize(400, 300);

        // ------ Definindo o Conteúdo como Visível ------ //

        setVisible(true);

        // ------ Centralizando a Tela ao Compilar ------ //

        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        Calculadora app = new Calculadora();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
