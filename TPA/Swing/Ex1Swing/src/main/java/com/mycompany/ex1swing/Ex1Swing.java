/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex1swing;

/**
 *
 * @author ISAAC 1°DS AMS
 */
import javax.swing.JOptionPane;

public class Ex1Swing {

    public static void main(String[] args) {
        int ano = 0, meses = 0, dias = 0, totalDias = 0;
        ano = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos Anos você tem: "));
        meses = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos meses Você tem: "));
        dias = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos dias Você tem: "));
        totalDias = (ano * 365) + (meses * 30) + dias;
              
        JOptionPane.showMessageDialog(null, "Você tem: " + totalDias + " dias de Vida!");
    }
}
