/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex2conversordegraus;

/**
 *
 * @author ISAAC - 1°DS AMS
 */
import java.util.Scanner;
public class Ex2ConversorDeGraus {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a sua Primeira Escala Termográfica: Celsius (1), Kelvin (2), Fahrenheit (3): ");
        double escal1 = scanner.nextDouble();
        
        System.out.println("Insira o Valor que será convertido: ");
        double valor1 = scanner.nextDouble();
        
        System.out.println("Escolha a Segunda Escala abaixo: Celsius (1), Kelvin (2), Fahrenheit (3): ");
        double escal2 = scanner.nextDouble();
                
        if (escal1 == 1) {
            double valorC = valor1;            
        
        if (escal2 == 1) {
            double CparaC = valor1;
            System.out.println("O valor não foi convertido pois é igual: " + valorC + " graus Celsius.");
        }   
        }
        
        if (escal1 == 1) {
            double valorC = valor1;
            
        if (escal2 == 2) {
            double CparaK = valor1 + 273.15;
            System.out.println(valor1 + " convertido em Kalvin resulta em: " + CparaK + " graus Kelvin.");
        }
        }
        
        if (escal1 == 1) {
            double valorC = valor1;
            
        if (escal2 == 3) {
            double CparaF = valor1 * 1.8 + 32;
            System.out.println(valor1 + " convertido em Fahrenheit resulta em: " + CparaF + " graus Fahrenheit.");
        }
        }
        
        if (escal1 == 2) {
            double valorK = valor1;
            
        if (escal2 == 1) {
            double KparaC = valor1 - 273.15;
            System.out.println(valor1 + " convertido em Celsius resulta em: " + KparaC + " graus Celsius.");
        }
        }
        
        if (escal1 == 2) {
            double valorK = valor1;
            
        if (escal2 == 2) {
            double KparaK = valor1;
            System.out.println("O valor não foi convertido pois é igual: " + valorK + " graus Kelvin.");
        }
        }
        
        if (escal1 == 2){
            double valorK = valor1;
        
        if (escal2 == 3) {
            double KparaC = valor1 - 273.15;
            double KparaF = KparaC * 1.8 + 32;
            System.out.println(valorK + " convertido em Fahrenheit resulta em: " + KparaF + " graus Fahrenheit.");
        }
        }
        
        if (escal1 == 3) {
            double valorF = valor1;
            
        if (escal2 == 1) {
            double FparaC1 = valor1 - 32;
            double FparaC2 = FparaC1 * 5 / 9;
            System.out.println(valorF + "convertido em Celsius resulta em: " + FparaC2 + " graus Celsius.");
        }
        }
        
        if (escal1 == 3) {
            double valorF = valor1;
            
        if (escal2 == 2) {
            double FparaK1 = valor1 - 32;
            double FparaK2 = FparaK1 * 5 / 9 + 273.15;
            System.out.println(valorF + " convertido em Kelvin resulta em: " + FparaK2 + " graus Kelvim.");
        }
        }
        
        if (escal1 == 3) {
            double valorF = valor1;
            
        if (escal2 == 3) {
            double FparaF = valor1;
            System.out.println("O valor não foi convertido pois é igual: " + valorF + " graus Fahrenheit.");
        }
        }
        
        scanner.close();
    }
}