/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex6dadosdousuario;

/**
 *
 * @author ISAAC - 1°DS AMS
 */
import java.util.Scanner;
import java.util.Date;
public class Ex6DadosDoUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira seus dados abaixo: 1.Qual o seu Nome?");
        String nome = scanner.nextLine();
        
        System.out.println("Qual a Data de seu Nascimento?");
        String data = scanner.nextLine();
        
        System.out.println("Qual o Curso em que está Estudando?");
        String curso = scanner.nextLine();
        
        System.out.println("Qual a sua Escolaridade? (apenas UM número)");
        int serie = scanner.nextInt();
        
        System.out.println("Qual a sua Altura?");
        double alt = scanner.nextDouble();
        
        System.out.println("Qual o seu Peso em Kg?");
        float peso = scanner.nextFloat();
        
        System.out.println("Dados inseridos: Seu Nome: " + nome + ", sua Data de Nascimento: " + data + ", você está Cursando: " + curso 
                + ", seu Nível Escolar: " + serie + "° ano" + ", sua Atura: " + alt + " e seu Peso: " + peso + ".");
    }
}
