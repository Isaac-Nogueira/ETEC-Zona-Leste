/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosswitchcase;
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class ExerciciosSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para selecionar uma Fruta (1: Maçã, 2: Banana, 3: Laranja, 4: Melancia ou 5: Morango):");
        int numero1 = scanner.nextInt();
        
        switch (numero1) {
            case 1:
                System.out.println("A fruta escolhida foi Maçã.");
                break;
            case 2:
                System.out.println("A fruta escolhida foi Banana.");
                break;
            case 3:
                System.out.println("A fruta escolhoda foi Laranja.");
                break;
            case 4:
                System.out.println("A fruta escolhida foi Melancia.");
                break;
            case 5:
                System.out.println("A fruta escolhida foi Morango.");
                break;
                
            default:
                System.out.println("Fruta inválida.");
        }
        
        System.out.println("Digite um número para escolher um Jogo (1: Minecraft, 2: FIFA, 3: Fortnite, 4: Call of Duty ou 5: The Sims):");
        int numero2 = scanner.nextInt();
        
        switch (numero2) {
            case 1:
                System.out.println("O jogo escolhido foi Minecraft.");
                break;
            case 2:
                System.out.println("O jogo escolhido foi FIFA.");
                break;
            case 3:
                System.out.println("O jogo escolhido foi Fortinite.");
                break;
            case 4:
                System.out.println("O jogo escolhido foi Call of Duty.");
                break;
            case 5:
                System.out.println("O jogo escolhido foi The Sims.");
                break;
                
            default:
                System.out.println("Jogo  não encontrado.");
        }
        
        System.out.println("Digite um número para selecionar uma Dia da semana (1: Domingo, 2: Segunda-feira, 3: Terça-feira, 4: Quarta-feira, 5: Quinta-feira, 6: Sexta-feira ou 7: Sábado):");
        int numero3 = scanner.nextInt();
        
        switch (numero3) {
            case 1:
                System.out.println("O dia escolhido foi Domingo.");
                break;
            case 2:
                System.out.println("O dia escolhido foi Segunda-feira.");
                break;
            case 3:
                System.out.println("O dia escolhido foi Terça-feira.");
                break;
            case 4:
                System.out.println("O dia escolhido foi Quarta-feira.");
                break;
            case 5:
                System.out.println("O dia escolhido foi Quinta-feira.");
                break;
            case 6:
                System.out.println("O dia escolhido foi Sexta-feira.");
                break;
            case 7:
                System.out.println("O dia escolhido foi Sábado.");
                break;
                
            default:
                System.out.println("Dia inválido.");
        }
    }
    
}
