/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex2swing;

/**
 *
 * @author ISAAC 1°DS AMS
 */
import javax.swing.JOptionPane;

public class Ex2Swing {

    public static void main(String[] args) {
        int media1 = 0, media2 = 0, soma = 0, mediaM = 0; 
        // variável media1 é do 7, 8 e 9, a media2 é do 4, 5 e 6, já mediaM é a média das duas médias
        media1 = (7 + 8 + 9) / 3;
        media2 = (4 + 5 + 6) / 3;
        soma = media1 + media2;
        mediaM = soma / 2;
        
        JOptionPane.showMessageDialog(null, "Média dos Números 7, 8 e 9: " + media1 + "; Média dos Números "
                + "4, 5 e 6: " + media2 + "; A soma das duas Médias feitas: " + soma + "; A Média das Médias feitas: " + mediaM);
    }
}
