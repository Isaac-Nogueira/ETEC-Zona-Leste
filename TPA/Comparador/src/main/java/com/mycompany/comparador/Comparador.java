/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.comparador;

/**
 *
 * @author ISAAC - 1°DS AMS
 */
import javax.swing.JOptionPane;
public class Comparador {
    public static void main(String[] args) {
        
        //Comparador de valores para saber se houve lucro
        int valC = 0, valV = 0, dif = 0;
        valC = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor da Compra do Produto?"));
        valV = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor da Venda do Produto?"));
        dif = valV - valC;
        
        if (valV > valC) {
            JOptionPane.showMessageDialog(null, "Houve lucro, com uma diferença de R$" + dif + " do valor da Compra");
        }
        else {
            JOptionPane.showMessageDialog(null, "Não houve lucro, pois não há uma diferença positiva do valor da Compra.");
        }
        
        //Comparando chaves de acesso
        int chave = 0, senha = 0;
        chave = Integer.parseInt(JOptionPane.showInputDialog("Insira a senha numérica para acessar:"));
        senha = 1234;
        
        if (chave == senha) {
            JOptionPane.showMessageDialog(null, "Acesso permitido.");
        }
        else {
            JOptionPane.showMessageDialog(null, "Acesso negado.");
        }
        
        //Verificador de idade mínima
        int idade = 0, minima = 0;
        idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade? (Idade mínima: 16 anos)"));
        minima = 16;
        
        if (idade >= minima) {
            JOptionPane.showMessageDialog(null, "Você tem idade suficiente para ser contratado. Envie-nos seu Currículo.");
        }
        else {
            JOptionPane.showMessageDialog(null, "Você não tem a idade mínima para começar a trabalhar!");
        }
        
        //Verificando limite de velocidade
        int vel = 0, velmax = 0;
        vel = Integer.parseInt(JOptionPane.showInputDialog("Qual a velocidade? (máximo 90 km/h)"));
        velmax = 90;
        
        if (vel < velmax){
            JOptionPane.showMessageDialog(null, "Você esteve dentro do limite de velocidade (90 km/h)");
        }
        else {
            JOptionPane.showMessageDialog(null, "Você ultrapassou o limite de velocidade (90 km/h).");
        }
        
        //Verificador de idade máxima
        int age = 0, maxima = 0;
        age = Integer.parseInt(JOptionPane.showInputDialog("Qual é a sua Idade em anos? (Máximo: 12 anos)"));
        maxima = 12;
        
        if (age <= 12) {
            JOptionPane.showMessageDialog(null, "Você pode entrar na área infantil.");
        }
        else {
            JOptionPane.showMessageDialog(null, "Você não pode entrar na área infantil.");
        }
        
        //Redefinindo uma senha
        int atual = 0, nova = 0;
        atual = 1234;
        nova = Integer.parseInt(JOptionPane.showInputDialog("Insira a nova senha:"));
        
        if (atual != nova) {
            JOptionPane.showMessageDialog(null, "A senha foi redefinida.");
        }
        else {
            JOptionPane.showMessageDialog(null, "As senhas são iguais, portanto, não foi redefinida.");
        }
    }
}