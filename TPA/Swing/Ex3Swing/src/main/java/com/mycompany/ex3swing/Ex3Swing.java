/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex3swing;

/**
 *
 * @author ISAAC 1°DS AMS
 */
import javax.swing.JOptionPane;

public class Ex3Swing {

    public static void main(String[] args) {
        int saldoA = 0, saldoR = 0; // saldoA é o saldo atual, já saldoP é o valor reajustado
        saldoA = Integer.parseInt(JOptionPane.showInputDialog("Informe o Saldo (apenas números):"));
        saldoR = saldoA / 100 * 1 + saldoA;
        
        JOptionPane.showMessageDialog(null, "O novo saldo é de: " + saldoR);
    }
}
