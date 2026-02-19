/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bhaskara;

/**
 *
 * @author ISAAC - 2ºDS AMS
 */
import java.util.Scanner;
public class Bhaskara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /* x = -b quadrado + ou - raíz de b quadrado - 4 . a . c dividido por 2 . a */
        
        System.out.println("Digite um valor para A (diferente de zero): ");
        double a = sc.nextDouble();
        
        System.out.println("Digite um valor para B: ");
        double b = sc.nextDouble();
        
        System.out.println("Digite um valor para C: ");
        double c = sc.nextDouble();
        
        double delta = (b * b) - (4 * a * c);
        
        if (delta < 0) {
            System.out.println("Não há raízes reais, o valor de delta é negativo.");
        } else {
            double x1 = (- b + Math.sqrt(delta)) / (2 * a);
            double x2 = (- b - Math.sqrt(delta)) / (2 * a);
            
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        }
        
        sc.close();
    }
}