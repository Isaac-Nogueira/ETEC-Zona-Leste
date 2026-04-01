/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex1conversor;

/**
 *
 * @author ISAAC 2°DS AMS
 */
import java.util.Scanner;
public class Ex1Conversor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escolha uma Unidade para Converter para Celsius: 1 - Fahrenheit; 2 - Kelvin.");
        int unidade = sc.nextInt();
        
        switch (unidade) {
            case 1 ->                 {
                    System.out.println("Qual a Temperatura em Fahrenheit?");
                    double temp = sc.nextDouble();
                    double celsius = (temp - 32) / 1.8;
                    System.out.println("A Temperatura em Celsius é igual a: " + celsius);
                }
            case 2 ->                 {
                    System.out.println("Qual a Temperatura em Kelvin?");
                    double temp = sc.nextDouble();
                    double celsius = temp - 273;
                    System.out.println("A Temperatura em Celsius é igual a: " + celsius);
                }
            default -> System.out.println("O número digitado não foi reconhecido.");
        }
    }
}
