/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex2lampada;

/**
 *
 * @author ISAAC 2°DS AMS
 */
import java.util.Scanner;
public class Ex2Lampada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lampada umaLampada = new Lampada();
        
        System.out.println("Acenda ou Apague a Lâmpada: 1 - Acender; 2 - Apagar");
        int
        
        umaLampada.acende();
        umaLampada.apaga();
        umaLampada.mostraEstado();
    }
}

class Lampada {
    boolean estadoDaLampada;
    
    void acende() {
        estadoDaLampada = true;
    }
    
    void apaga() {
        estadoDaLampada = false;
    }
    
    void mostraEstado() {
        System.out.println("A Lâmpada está: " + estadoDaLampada);
    }
}