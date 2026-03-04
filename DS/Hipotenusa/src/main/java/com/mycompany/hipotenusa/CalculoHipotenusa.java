/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hipotenusa;

/**
 *
 * @author ISAAC 2°DS AMS
 */
import java.util.Scanner;
public class CalculoHipotenusa {
    Scanner sc = new Scanner(System.in);
    
    double catetoA;
    double catetoB;
    double hQuadrado;
    double h;
    
    void cateto1() {
        System.out.println("Qual o valor do Primeiro Cateto? (A): ");
        catetoA = sc.nextDouble();
    }
    
    void cateto2() {
        System.out.println("Qual o valor do Segundo Cateto? (B): ");
        catetoB = sc.nextDouble();
    }
    
    void result() {
        hQuadrado = catetoA * catetoA + catetoB * catetoB;
        h = Math.sqrt(hQuadrado);
        System.out.println("O valor da Hipotenusa é igual a: " + h);
        
        sc.close();
    }
}
