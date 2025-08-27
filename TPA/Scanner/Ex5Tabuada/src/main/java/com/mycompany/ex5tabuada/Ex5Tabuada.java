/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex5tabuada;

/**
 *
 * @author ISAAC - 1°DS AMS
 * 
 */
import java.util.Scanner;
public class Ex5Tabuada {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
       System.out.println("Digite abaixo um Número para exibir sua Tabuada:");
       double numero = scanner.nextDouble();
       
       double x1 = numero * 1;
       double x2 = numero * 2;
       double x3 = numero * 3;
       double x4 = numero * 4;
       double x5 = numero * 5;
       double x6 = numero * 6;
       double x7 = numero * 7;
       double x8 = numero * 8;
       double x9 = numero * 9;
       double x10 = numero * 10;
       
       System.out.println("Tabuada do Número " + numero + ": " + numero + " x 1 = " + x1 + "; " + numero + " x 2 = " + x2 + "; "
               + numero + " x 3 = " + x3 + "; " + numero + " x 4 = " + x4 + "; " + numero + " x 5 = " + x5 + "; " + numero + " x 6 = " + x6 + "; "
               + numero + " x 7 = " + x7 + "; " + numero + " x 8 = " + x8 + "; " + numero + " x 9 = " + x9 + "; " + numero + " x 10 = " + x10 + "; ");
                      
    }
}
