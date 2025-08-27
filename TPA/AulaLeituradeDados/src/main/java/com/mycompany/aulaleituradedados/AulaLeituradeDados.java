/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aulaleituradedados;

/**
 *
 * @author FATEC ZONA LESTE
 */

import java.util.Scanner;

public class AulaLeituradeDados {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
         // Leitura de texto
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        // Leitura de número inteiro
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        
        System.out.println("Olá, " + nome + "!Você tem" + idade + " anos.");
        
         scanner.close();
    }
}
