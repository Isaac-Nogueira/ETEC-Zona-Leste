/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exdowhile;

/**
 *
 * @author ISAAC - 1°DS AMS
 */
import java.util.Scanner;
public class ExDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ex1: Exibir todos os números pares existentes entre 1 e 20.");        
        int num = 1;
        
        do {
            if (num % 2 == 0) { //Verifica se o número é par
                System.out.println("O número é " + num);
            }
            num++; //Soma o número até o próximo número par
        } while (num <= 20);
        
        System.out.println("Ex2: Efetuar a tabuada do número informado.");
        System.out.println("Insira um número para que a sua tabuada seja exibida:");
        int tab = scanner.nextInt();
        int mult = 1;
        
        do {
            System.out.println("Tabuada do número " + tab + ":");
            int result = tab * mult;
            System.out.println("O número " + tab + " multiplicado por " + mult + " resulta em: " + result);
            mult++; //Soma um valor ao número para multiplicar pelo valor que entrou 
        } while (mult <= 10);
        
        System.out.println("Exibir a quantidade de números existentes entre 100 a 125.");
        int valor = 100;
        
        do {
            System.out.println("Entre 100 e 125 há o número: " + valor);
            valor++;
        } while (valor <= 125);
        
        System.out.println("Através de um valor inicial e final  apresente a soma dos números ímpares entre os números informados.");
        System.out.println("Insira o valor inicial:");
        int num1 = scanner.nextInt();
        System.out.println("Insira o valor final:");
        int num2 = scanner.nextInt();
        int soma = 0;
        
        do {
            if (num1 % 2 == 1) {
                soma += num1;
            }
            num1++;
        } while (num1 <= num2);
        
        System.out.println("A soma de todos os números ímpares entre " + num1 + " e " + num2 + " é: " + soma);
    }
}