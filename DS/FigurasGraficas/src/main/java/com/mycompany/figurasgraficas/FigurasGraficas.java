/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.figurasgraficas;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class FigurasGraficas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circulo umCirculo = new Circulo();
        Quadrado umQuadrado = new Quadrado();
        Retangulo umRetangulo = new Retangulo();
        Triangulo umTriangulo = new Triangulo();
        
        System.out.println("Qual a Forma Geométrica escolhida? (1 - Círculo; 2 - Quadrado; 3 - Retângulo; 4 - Triângulo): ");
        int figura = sc.nextInt();
        
        switch (figura) {
            case 1 -> {
                System.out.println("A Figura escolhida foi a 1 - Círculo.");
                umCirculo.area();
            }
            case 2 -> {
                System.out.println("A Figura escolhida foi a 2 - Quadrado.");
                umQuadrado.area();
            }
            case 3 -> {
                System.out.println("A Figura escolhida foi a 3 - Retângulo.");
                umRetangulo.area();
            }
            case 4 -> {
                System.out.println("A Figura escolhida foi a 4 - Triângulo.");
                umTriangulo.area();
            }
            default -> System.out.println("Número não reconhecido.");
        }
    }
}

class Circulo {
    Scanner sc = new Scanner(System.in);
    
    static final double PI = 3.14159265;
    
    void area() {
        System.out.println("Qual o valor do Raio da Figura?");
        double raio = sc.nextDouble();
        
        double area = raio * PI;
        
        System.out.println("A Área da Figura é igual a: " + area);
    }
}

class Quadrado {
    Scanner sc = new Scanner(System.in);
    
    void area() {
        System.out.println("Qual o valor da Base/Altura da Figura?");
        double base = sc.nextDouble();
        
        double area = base * base;
        
        System.out.println("A Área da Figura é igual a: " + area);
    }
}

class Retangulo {
    Scanner sc = new Scanner(System.in);
    
    void area() {
        System.out.println("Qual o valor da Base da Figura?");
        double base  = sc.nextDouble();
        
        System.out.println("Qual o valor da Altura da Figura?");
        double altura = sc.nextDouble();
        
        double area = base * altura;
        
        System.out.println("A Área da Figura é igual a: " + area);
    }
}

class Triangulo {
    Scanner sc = new Scanner(System.in);
    
    void area() {
        System.out.println("Qual o valor da base da Figura?");
        double base = sc.nextDouble();
        
        System.out.println("Qual o valor da altura da Figura?");
        double altura = sc.nextDouble();
        
        double area = base * altura / 2;
        
        System.out.println("A Área da Figura é igual a: " + area);
    }
}