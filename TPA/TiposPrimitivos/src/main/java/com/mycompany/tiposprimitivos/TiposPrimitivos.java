/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiposprimitivos;

/**Primeiro projeto em java feito no laboratório 111*/
 *
 * @author FATEC ZONA LESTE
 */
public class TiposPrimitivos {
    public static void main(String[] args)  { 
        
        byte idade = 25;
        short ano = 2025;
        int populacaoCidade = 500000;
        long populacaoMundial = 8000000000L; // Letra "L" obritório quando houver muitos algarismos
        
        float altura = 1.75f; 
        double peso = 72.5;
        
        char inicial = 'J';
        boolean ativo = true;
        
        System.out.println("Idade : " + idade);
        System.out.println("Ano: " + ano);
        System.out.println("População da cidade: " + populacaoCidade);
        System.out.println("População mundial: " + populacaoMundial);
        System.out.println("Altura: " + inicial);
        System.out.println("Peso: " + peso + "kg");
        System.out.println("Inicial do nome: " + inicial);
        System.out.println("Etá ativo? " + ativo);
    }
}
