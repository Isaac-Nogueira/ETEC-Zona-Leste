/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex1tarifas;
import java.util.Scanner;
/**
 *
 * @author ISAAC - 1°DS AMS
 */
public class EX1Tarifas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para selecionar o tipo de Transporte (1: Ônibus Urbano, "
                + "2: Metrô, 3: Trem Intermunicipal, 4: Ônibus Rodoviário):");
        int numero = scanner.nextInt();
        System.out.println("Quantas passagens serão compradas?");
        int quant = scanner.nextInt();
        
        switch (numero) {
            //Valor do ônibus urbano: 4,40
            case 1:
                double valor1 = 4.40 * quant;
                System.out.println("Valor unitário: R$4,40. Valor total: R$" + valor1);
                break;
            //Valor do metrô: 5,00
            case 2:
                double valor2 = 5.00 * quant;
                System.out.println("Valor unitário: R$5,00. Valor total: R$" + valor2);
                break;
            //Valor do trem: 6,50
            case 3:
                double valor3 = 6.50 * quant;
                System.out.println("Valor unitário: R$6,50. Valor total: R$" + valor3);
                break;
            //Valor do ônibus rodoviário: 12,00
            case 4:
                double valor4 = 12.00 * quant;
                System.out.println("Valor unitário: R$12,00. Valor total: R$" + valor4);
                break;
                
            default:
                System.out.println("Erro ao calcular o preço da passagem.");
        }
    }
}