/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex4swing;

/**
 *
 * @author ISAAC 1°DS AMS
 */
import javax.swing.JOptionPane;

public class Ex4Swing {

    public static void main(String[] args) {
        double ipi = 0, p1 = 0, v1 = 0, q1 = 0, p2 = 0, v2 = 0, q2 = 0, v3 = 0, v4 = 0; // v3 é o valor total dos produtos, e v4, o valor que será pago
        ipi = Integer.parseInt(JOptionPane.showInputDialog("Qual a Taxa que será aplicada? "));
        p1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o Código do item 1: "));
        v1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor unitário do produto 1: "));
        q1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do item 1: "));
        p2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o Código so item 2: "));
        v2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor unitário do produto 2: "));
        q2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do item 2: "));
        v3 =(v1 * q1 + v2 * q2);
        v4 = v3 + (v3 / 100 * ipi);
        
        JOptionPane.showMessageDialog(null, "O valor que será pago é de: R$" + v4);
    }
}
