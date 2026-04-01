/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex3teorema;

/**
 *
 * @author ISAAC 2°DS AMS
 */
import java.util.Scanner;
public class Ex3Teorema {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Qual o valor do Primeiro Cateto?");
        double cateto1 = sc.nextDouble();
        
        System.out.println("Qual o valor do Segundo Cateto?");
        double cateto2 = sc.nextDouble();
        
        double hipotenusa = (cateto1 * cateto1) + (cateto2 * cateto2);
        
        System.out.println("O valor da Hipotenusa é igual a: " + hipotenusa);
    }
}
