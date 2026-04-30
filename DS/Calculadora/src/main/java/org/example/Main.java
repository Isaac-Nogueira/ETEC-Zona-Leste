package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculadora extends JFrame {
    JLabel rotulo1, rotulo2, exibir;

    JTextField texto1, texto2;

    JButton somar, subtrair, multiplicar, dividir, raiz;

    public Calculadora() {
        super("Calculadora");

        Container tela = getContentPane();

        setLayout(null);

        rotulo1 = new JLabel("1° Número: ");
        rotulo2 = new JLabel("2° Número: ");
        exibir = new JLabel("");

        texto1 = new JTextField(5);
        texto2 = new JTextField(5);

        somar = new JButton("Somar");
        subtrair = new JButton("Subtrair");
        multiplicar = new JButton("Multiplicar");
        dividir = new JButton("Dividir");
        raiz = new JButton("Tirar a Raiz");

        rotulo1.setBounds(50, 20, 100, 20);
        rotulo2.setBounds(50, 60, 100, 20);

        texto1.setBounds(120, 20, 200, 20);
        texto2.setBounds(120, 60, 200, 20);

        exibir.setBounds(200, 160, 200, 20);

        somar.setBounds(50, 100, 120, 20);
        subtrair.setBounds(50, 130, 120, 20);
        multiplicar.setBounds(50, 160, 120, 20);
        dividir.setBounds(50, 190,120, 20);
        raiz.setBounds(50, 220, 120, 20);

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

        exibir.setVisible(false);

        tela.add(rotulo1);
        tela.add(rotulo2);

        tela.add(texto1);
        tela.add(texto2);

        tela.add(somar);
        tela.add(subtrair);
        tela.add(multiplicar);
        tela.add(dividir);
        tela.add(raiz);

        tela.add(exibir);

        setSize(400, 350);

        setVisible(true);

        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        Calculadora app = new Calculadora();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
