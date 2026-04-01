package org.example;
import javax.swing.JOptionPane;

class EntradaSaidaDados {
    public String entradaDados(String mensagemEntrada) {
        return JOptionPane.showInputDialog(mensagemEntrada);
    }

    public void saidaDados(String mensagemSaida) {
        JOptionPane.showInputDialog(null, mensagemSaida);
    }
}