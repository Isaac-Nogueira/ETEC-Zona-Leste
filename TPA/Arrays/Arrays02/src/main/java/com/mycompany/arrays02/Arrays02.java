/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrays02;

/**
 *
 * @author SUDEMIR
 */
import java.util.Arrays;
import java.util.Scanner;
public class Arrays02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quantos Nomes serão digitados?");
        int quant = scanner.nextInt();
        scanner.nextLine();
        4
        String[] nomes = new String[quant];
        
        for (int i = 0; i < quant; i++) {
            System.out.println("digite o " + (i + 1) + "° Nome:");
            nomes[i] = scanner.nextLine();
        }
        
        Arrays.sort(nomes);
        
        System.out.println("Nomes em ordem Crescente:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
        
        System.out.println("Nomes em ordem Decrescente:");
        for (int i = nomes.length - 1; i >= 0; i--) {
            System.out.println(nomes[i]);
        }
        
        scanner.close();
    }
}
