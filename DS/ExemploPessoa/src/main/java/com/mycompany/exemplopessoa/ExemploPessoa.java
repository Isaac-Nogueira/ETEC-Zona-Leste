/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplopessoa;

/**
 *
 * @author ISAAC 2°DS AMS
 */
public class ExemploPessoa {
    public static void main(String[] args) {
        Pessoa umaPessoa = new Pessoa();
        
        umaPessoa.nome = "Anna";
        umaPessoa.sexo = "Feminino";
        umaPessoa.pais = "Brasil";
        
        umaPessoa.anda();
        umaPessoa.fala();
        umaPessoa.corre();
        umaPessoa.estuda();
        umaPessoa.brinca();
        
        System.out.println();
        
        System.out.println("Nome: " + umaPessoa.nome);
        System.out.println("Gênero: " + umaPessoa.sexo);
        System.out.println("País: " + umaPessoa.pais);
        
        umaPessoa = null;
    }
}
