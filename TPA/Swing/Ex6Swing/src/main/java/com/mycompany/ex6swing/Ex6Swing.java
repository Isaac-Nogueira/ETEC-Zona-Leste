/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex6swing;

/**
 *
 * @author ISAAC 1°DS 
 */
import javax.swing.JOptionPane;

public class Ex6Swing {

    public static void main(String[] args) {
        int num = 0, ant = 0, suc = 0;
        num = Integer.parseInt(JOptionPane.showInputDialog("Insira um Número para que seja exibido seu Antecessor e Sucessor: "));
        ant = num - 1;
        suc = num + 1;
        
        JOptionPane.showMessageDialog(null, "Antecessor do Número " + num + ": " + ant + ", e seu Sucessor: " + suc + ". ");
    }
}
