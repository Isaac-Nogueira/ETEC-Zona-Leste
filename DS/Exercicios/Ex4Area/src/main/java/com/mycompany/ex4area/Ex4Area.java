/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex4area;

/**
 *
 * @author ISAAC 2°DS AMS
 */
import javax.swing.JOptionPane;
public class Ex4Area {
    public static void main(String[] args) {
        double h = 0, r = 0;
        
        h = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor da Altura do Cilindro?"));
        r = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor do Raio do Cilindro?"));
        
        double areaL = 2 * 3.14159265 * r * h;
        
        double volume = 3.14159265 * r * r * h;
        
        JOptionPane.showMessageDialog(null, "A Área Lateral do Cilindro é igual a: " + areaL);
        JOptionPane.showMessageDialog(null, "O Volume do Cilindro é igual a: " + volume);
    }
}
