/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrays01;

/**
 *
 * @author ISAAC - 1°DS AMS
 */
import java.util.Scanner;
public class Arrays01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quantos números serão digitados?");
        int quant = scanner.nextInt();
        
        int[] numeros = new int[quant];
        
        for (int i = 0; i < quant; i++) {
            System.out.println("Digite o " + (i + 1) + "° Número:");
            numeros[i] = scanner.nextInt();
        }
        
        int quantPares = 0;
        int quantImpares = 0;
        for (int num : numeros) {
            if (num % 2 == 0) {
                quantPares++;
            } else {
                quantImpares++;
            }
        }
        
        int[] pares = new int[quantPares];
        int[] impares = new int[quantImpares];
        
        int iP = 0;
        int iI = 0;
        for (int num : numeros) {
            if (num % 2 == 0){
                pares[iP++] = num;
            } else {
                impares[iI++] = num;
            }
        }
        
        System.out.println("Números Pares:");
        for (int p : pares) {
            System.out.println(p + " ");
        }
        
        System.out.println("Números Ímpares:");
        for (int im : impares) {
            System.out.println(im + " ");
        }
        
        scanner.close();
    }
}
