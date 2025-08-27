/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex4mediadenotas;

/**
 *
 * @author ISAAC - 1°DS AMS
 */
import java.util.Scanner;
public class Ex4MediaDeNotas {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
       System.out.println("Quantas Notas serão inseridas para a média? (2, 3 ou 4?):");
       double quant = scanner.nextDouble();
       
       if (quant == 2) {
           System.out.println("Digite a Primeira Nota: ");
           double nota1 = scanner.nextDouble();
        
           System.out.println("Insira a Segunda: ");
           double nota2 = scanner.nextDouble();
           
           double media1 = nota1 + nota2;
           double media2 = media1 / 2;
           
           System.out.println("Resultado da Média: " + media2);
       }
       
       if (quant == 3) {
           System.out.println("Digite a Primeira Nota: ");
           double nota1 = scanner.nextDouble();
        
           System.out.println("Insira a Segunda: ");
           double nota2 = scanner.nextDouble();
        
           System.out.println("Insira a Terceira: ");
           double nota3 = scanner.nextDouble();
       
           double media1 = nota1 + nota2 + nota3;
           double media2 = media1 / 3;
           
           System.out.println("Resultado da Média: " + media2);
           
       }
       
       if (quant == 4) {
           System.out.println("Digite a Primeira Nota: ");
           double nota1 = scanner.nextDouble();
        
           System.out.println("Insira a Segunda: ");
           double nota2 = scanner.nextDouble();
        
           System.out.println("Insira a Terceira: ");
           double nota3 = scanner.nextDouble();
        
           System.out.println("Digite a última nota: ");
           double nota4 = scanner.nextDouble();
        
           double media1 = nota1 + nota2 + nota3 + nota4;
           double media2 = media1 / 4;
        
           System.out.println("Média das Notas inseridas: " + media2);
       }               
    }
}
