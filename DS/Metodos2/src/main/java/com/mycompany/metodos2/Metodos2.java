/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.metodos2;

/**
 *
 * @author Admin
 */

import javax.swing.JOptionPane;

public class Metodos2 {

    public static void main(String[] args) 
    {
        int t;
        String p;
        digite();
        p = JOptionPane.showInputDialog("Digite uma palavra qualquer: ");
        t = tamanho(p);
        JOptionPane.showMessageDialog(null, p + " possui " + t + " caracteres");
    }
    
static void digite()
{
    JOptionPane.showMessageDialog(null, "Digite uma Palavra");
}

static int tamanho(String x)
{
    return x.length();
}

}
