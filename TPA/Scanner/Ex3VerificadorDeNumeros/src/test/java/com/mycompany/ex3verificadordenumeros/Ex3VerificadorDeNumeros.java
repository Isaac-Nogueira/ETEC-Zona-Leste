/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex3verificadordenumeros;

/**
 *
 * @author ISAAC - 1°DS AMS
 */
import java.util.Scanner;
public class Ex3VerificadorDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira o Número para verificar se este é Primo ou Não: ");
        int num = scanner.nextInt();
        
        if (num <= 1) {
            System.out.println("Não foi possível verificar o número.");
        } else {
            boolean primo = true;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.println(num + " é um número primo.");
            } else {
                System.out.println(num + " não é um número primo.");
            }
        }
        
        scanner.close();
    }
}
