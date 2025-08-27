/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex5swing;

/**
 *
 * @author ISAAC 1°DS AMS
 */
import javax.swing.JOptionPane;

public class Ex5Swing {

    public static void main(String[] args) {        
        double salM = 0, salU = 0, quant = 0;
        salM = 1000.00;
        salU = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor de seu salário? "));
        quant = salU / salM;
        
        JOptionPane.showMessageDialog(null, "(Valor do Salário Mínimo: R$1000,00). Você recebe " + quant 
                + " salário(s) mínimo(s), equivalente à R$" + salU + ". ");
    }
}
