/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplojtextfield;

/**
 *
 * @author ISAAC 2°DS AMS
 */
import javax.swing.*;
import java.awt.*;
public class ExemploJTextField extends JFrame {
    public static void main(String[] args) {
        JLabel rotulo1, rotulo2, rotulo3, rotulo4;
        JTextField texto1, texto2, texto3, texto4;
        public ExemploJTextField (){
            super("Exemplo com JTextField");
            Container tela = getContentPane();
            setLayout(null);

        }
    }
}

public static void main(String args[]) {
    ExemploJTextField app = new ExemploJTextField();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
