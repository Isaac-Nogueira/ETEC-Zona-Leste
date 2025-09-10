/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex2atendimentobancario;
import java.util.Scanner;
/**
 *
 * @author ISAAC - 1°DS AMS
 */
public class EX2AtendimentoBancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldoAtual = 15000.00;
        System.out.println("Digite uma número para selecionar um serviço (1: Consultar, 2: Saque, 3: Depósito, 4: Encerrar atendimento):");
        int servico = scanner.nextInt();
        
        switch (servico) {
            //Consultar saldo
            case 1:
                System.out.println("Saldo atual: R$" + saldoAtual);
                break;
            //Saque de dinheiro
            case 2:
                System.out.println("Saldo atual: R$" + saldoAtual + ". Qual o valor que será sacado?");
                double valorSaque = scanner.nextDouble();
                double saldoPosSaque = saldoAtual - valorSaque;
                
                if (valorSaque > saldoAtual) {
                    System.out.println("Erro. Valor maior que o saldo atual.");
                }
                else {
                    System.out.println("Valor sacado. Saldo atual: R$" + saldoPosSaque);
                }
                break;
            //Depósito de dinheiro
            case 3:
                System.out.println("Qual será o valor depositado?");
                double valorDepo = scanner.nextDouble();
                double valorPosDepo = saldoAtual + valorDepo;
                System.out.println("Saldo atual: R$" + valorPosDepo);
            //Encerrar atendimento
            case 4:
                System.out.println("Atendimento encerrado.");
        }
    }
}
