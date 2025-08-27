/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operacoesmatematicas;

/**
 *
 * @author ISAAC
 */
public class OperacoesMatematicas {

    public static void main(String[] args) {
        // Olá, sou Isaac Nogueira e estou aprendendo como desenvolver um algorítmo que executa operações matemáticas!

        double areaQuadrado = 3.0*3.0; // Número1 (Altura) * Número2 (Largura)
        double areaRetangulo = 2.0*4.0; // Número1 (Altura) * Número2 (Largura)
        double areaLosango = 3.5*4.0/2; // Número1 (Diagonal Maior) * Número2 (Diagonal Menor) / 2 (Valor Fixo)
        double areaTriangulo = 3.0*3.5/2; // Número2 (Base) * Número2 (Altura) / 2 (Valor fixo)
        double areaCircunferencia = 3.14*Math.pow(2.0,2); // 3,14 (PI - Valor Fixo) * Número2 (Raio/R) ** 2 (Ao quadrado - Valor Fixo)
        double media = (5.0 + 7.0) / 2; // 2 (Valor Não Fixo)
        double soma = 4.0+6.0;
        double subtracao = 3.0-5.0; // Resultado Negativo ou Positivo
        double divisao = 7.0/2.0; // Resultado possivelmente decimal
        double multiplicacao = 5.0*3.0;
                
        System.out.println("Área do Quadrado : " + areaQuadrado);
        System.out.println("Área do Retângulo : " + areaRetangulo);
        System.out.println("Área do Losango : " + areaLosango);
        System.out.println("Área do Triângulo : " + areaTriangulo);
        System.out.println("Área da Circunferência : " + areaCircunferencia);
        System.out.println("Média : " + media);
        System.out.println("Soma : " + soma);
        System.out.println("Subtração : " + subtracao);
        System.out.println("Divisão : " + divisao);
        System.out.println("Multiplicação : " + multiplicacao);
    }
}
