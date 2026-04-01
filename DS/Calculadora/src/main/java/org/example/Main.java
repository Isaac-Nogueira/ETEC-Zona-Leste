package org.example;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        MenuCalculadora menu = new menuCalculadora();
        menu.executarCalculadora();
    }
}

class MenuCalculadora {
    private Calculadora calculadora;
    private int opcao;
    private ConversorNumeros conversor;
    private EntradaSaidaDados io;

    public menuCalculadora() {
        this.calculadora = new Calculadora();
        this.opcao = -1;
        this.coversor = new ConversorNumeros();
        this.io = new EntradaSaidaDados();
    }
    public void executarCalculadora() {
        do {
            this.executarMenuPrincipal();
            this.avaliarOpcaoEscolhida();
        } while(this.opcao!=0);
    }
    private void executarMenuPrincipal() {
        String menssagemMenu = "Selecione uma Opção "
                +"/n 1 - Somar"
                +"/n 2 - Subtrair"
                +"/n 3 - Multiplicar"
                +"/n 4 - Dividir"
                +"/n 5 - Sair";
        String EntradaDeDados = io.entradaDados(menssagemMenu);
        this.opcao = conversor.stringToInt(entradaDados);
    }
    public void avaliarOpcaoEscolhida() {
        String saida;
        double num1=0, num2=0;
        if (this.opcao != 0 && this.opcao<=4) {
            String menssagemEntrada = "Digite o 1° número";
            num1 = conversor.stringToDouble(io.entradaDados(menssagemEntrada));
            calculadora.setNumero01(num1);
            menssagemEntrada = "Digite o 2° número";
            num2 = conversor.sringToDouble(io.entradaDados(menssagemEntrada));
            calculadora.setNumero02(num2);
        }
        switch(this.opcao) {
            case 1:
                calculadora.somar(num1,num2);
                saida="Resultado da Soma: " + calculadora.getResultado();
                io.saidaDados(saida);
                break;
            case 2:
                calculadora.subtrair(num1,num2);
                saida="Resultado da Subtração: " + calculadora.getResultado();
                io.saidaDados(saida);
                break;
            case 3:
                calculadora.multiplicar(num1,num2);
                saida="Resultado da Multiplicação: " + calculadora.getResultado();
                io.saidaDados(saida);
                break;
            case 4:
                calculadora.dividir(num1,num2);
                saida="Resultado da Divisão: " + calculadora.getResultado();
                io.saidaDados(saida);
                break;
            case 5:
                calculadora.sair();
            default:
                io.saidaDados("Opção inválida.");
                break;
        }
    }
}

class Calculadora {
    private double numero01;
    private double numero02;
    private double resultado;

    public calculadora() {
        this(0,0,0);
    }

    public calculadora(double numero01,double numero02,double resultado) {
        this.numero01 = numero01;
        this.numero02 = numero02;
        this.resultado = resultado;
    }

    public double getNumero01() {
        return numero01;
    }

    public void setNumero01(double numero01) {
        this.numero01 = numero01;
    }

    public double getNumero02() {
        return numero02;
    }

    public void setNumero02(double numero02) {
        this.numero02 = numero02;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    public void somar(double numero01, double numero02) {
        setResultado(this.getNumero01()+this.getNumero02());
    }
    public void subtrair(double numero01, double numero02) {
        setResultado(this.getNumero01()-this.getNumero02());
    }
    public void multiplicar(double numero01, double numero02) {
        setResultado(this.getNumero01()*this.getNumero02());
    }
    public void dividir(double numero01, double numero02) {
        setResultado(this.getNumero01()/this.getNumero02());
    }
    public void sair() {
        System.exit(0);
    }
}

class EntradaSaidaDados {
    public String entradaDados(String menssagemEntrada) {
        return JOptionPane.showInputDilog(menssagemEntrada);
    }
    public void saidaDados(String menssagemSaida) {
        JOptionPande.showInputDialog(null, menssagemSaida);
    }
}

class ConversorNumeros {
    public Integer StringToInt(String num) {
        int conversor = Integer.parseInt(num);
        return (conversor);
    }
    public Double stringToDouble(String num) {
        double conversor = Double.parseDouble(num);
        return (conversor);
    }
}