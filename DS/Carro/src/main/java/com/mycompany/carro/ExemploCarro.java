/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carro;

/**
 *
 * @author Admin
 */
public class ExemploCarro {
    public static void main(String[] args) {
        Carro umCarro = new Carro();
        
        umCarro.modelo = "Gol";
        umCarro.cor = "Preto";
        umCarro.motor = "1.0";
        
        umCarro.ligar();
        umCarro.mudarMarcha();
        umCarro.acelerar();
        umCarro.brecar();
        umCarro.desligar();
        
        umCarro = null;
        
        System.out.println();
        
        System.out.println(umCarro.modelo);
        System.out.println(umCarro.cor);
        System.out.println(umCarro.motor);
    }
}
