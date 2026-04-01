/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.metodos1;

/**
 *
 * @author Admin
 */

import javax.swing.JOptionPane;

public class Metodos1 {

    public static void main(String[] args) 
    {
        int a;
        digite();
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        dobro(a);
    }
    
    static void digite()
    {
        JOptionPane.showMessageDialog(null,"Digite um número: ");
    }
    
    static void dobro(int n)
    {
        int d = n * 2;
        JOptionPane.showMessageDialog(null,"Dobro de " + n + " é "+ d);
    }
}
