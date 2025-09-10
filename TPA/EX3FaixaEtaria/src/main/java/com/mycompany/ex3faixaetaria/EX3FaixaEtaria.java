/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex3faixaetaria;
import java.util.Scanner;
/**
 *
 * @author ISAAC - 1°DS AMS
 */
public class EX3FaixaEtaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Qual a idade em anos?");
        int idade = scanner.nextInt();
        
        System.out.println("Digite o número 1 para prosseguir.");
        int numero = scanner.nextInt();
        
        switch (numero) {
            case 1 -> {
                if (idade <= 12) {
                    System.out.println("Classificação: Criança.");
                }
                else if (idade <= 17) {
                    System.out.println("Classificação: Adolescente.");
                }
                else if (idade <= 59) {
                    System.out.println("Classificação: Adulto.");
                }
                else {
                    System.out.println("Classificação: Idoso.");
                }
            }
                
            default -> System.out.println("Erro.");
        }
    }
}