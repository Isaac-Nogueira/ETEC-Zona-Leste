/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex1calculadora;

/**
 *
 * @author ISAAC - 1°DS AMS
 */
import java.util.Scanner;
public class Ex1Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite abaixo a operação desejada: Soma (1), Subtração (2), Multiplicação (3), Divisão (4): ");
        double operacao = scanner.nextDouble();
        
        System.out.println("Insira o Primeiro Número: ");
        double num1 = scanner.nextDouble();
        
        System.out.println("Insira o Segundo Número: ");
        double num2 = scanner.nextDouble();
        
        // Identifica a operação escolhida e encaminha para um certo "if"
        if (operacao == 1) {
            double soma = num1 + num2;
            System.out.println("Resultado: " + soma);
        }
        
        if (operacao == 2) {
            double subt = num1 - num2;
            System.out.println("Resultado: " + subt);
        }
        
        if (operacao == 3) {
            double mult = num1 * num2;
            System.out.println("Resultado: " + mult);
        }
        
        if (operacao == 4) {
            double divi = num1 / num2;
            System.out.println("Resultado: " + divi);
            
            // Virá até aqui caso o divisor seja equivalente à zero e informará um erro de cálculo
        if (num2 == 0) {
            System.out.println("Erro, cálculo não realizado.");
        }
        }
        
        scanner.close();
    }
}
