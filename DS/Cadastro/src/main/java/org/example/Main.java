package org.example;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

class Menu extends JFrame {
    JLabel titulo, subtitulo;
    JButton btnCadastrese;

    public Menu() {
        super("Menu Inicial");

        Container tela = getContentPane();
        tela.setLayout(null);

        // ------ Definindo os Elementos ------ //

        titulo = new JLabel("Cadastre-se agora");
        subtitulo = new JLabel("Me entregue seus dados por obséquio");
        btnCadastrese = new JButton("Aperte para se cadastrar");

        // ------ Posicionando os Elementos ------ //

        titulo.setBounds(110, 60, 300, 30);
        subtitulo.setBounds(60, 100, 350, 20);
        btnCadastrese.setBounds(70, 140, 250, 25);

        // ------ Definindo a Fonte do Texto dos Elementos ------ //

        titulo.setFont(new Font("Times New Roman", Font.BOLD, 20));
        subtitulo.setFont(new Font("Times New Roman", Font.BOLD, 17));
        btnCadastrese.setFont(new Font("Times New Roman", Font.BOLD, 17));

        // ------ Definindo a Cor do Texto dos Elementos ------ //

        titulo.setForeground(new Color(62, 58, 43));
        subtitulo.setForeground(new Color(62, 58, 43));
        btnCadastrese.setForeground(new Color(247, 245, 235));

        // ------ Definindo a Cor do Background dos Elementos ------ //

        tela.setBackground(new Color(212, 207, 165));
        btnCadastrese.setBackground(new Color(162, 157, 127));

        // ------ Definindo o Conteúdo das Operações ------ //

        btnCadastrese.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        new Cadastro().setVisible(true);
                        dispose();
                    }
                }
        );

        // ------ Adicionando os Elementos na Tela ------ //

        tela.add(titulo);
        tela.add(subtitulo);
        tela.add(btnCadastrese);

        // ------ Definindo o Tamanho da Tela ------ //

        setSize(400, 280);

        // ------ Tornando a Tela Visível ------ //

        setVisible(true);

        // ------ Centralizando a Tela ao Compilar ------ //

        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Cadastro extends JFrame {
    JLabel rotCodigo, rotNome,rotEndereco, rotBairro, rotCidade, rotEstado, rotCEP, rotSexo, rotCelular, rotTelefone, rotDataAniversario, rotDataCadastro;

    JTextField txtCodigo, txtNome, txtEndereco, txtBairro, txtCidade, txtCEP, txtCelular, txtTelefone, txtDataAniversario, txtDataCadastro;

    JFormattedTextField codigo, nome, endereco, bairro, cidade, cep, celular, telefone, dataAniversario, dataCadastro;

    MaskFormatter maskCodigo, maskNome, maskEndereco, maskBairro, maskCidade, maskCEP, maskCelular, maskTelefone, maskDataAniversario, maskDataCadastro;

    JComboBox lista;

    String estados[] = {"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"};

    JRadioButton opcMasculino, opcFeminino;

    ButtonGroup grupo;

    JButton btnCadastrar, btnLimpar, btnFechar;

    public Cadastro() {
        super("Cadastro");

        Container tela = getContentPane();

        tela.setLayout(null);

        // ------ Definindo os Elementos ------ //

        rotCodigo = new JLabel("Código do Cliente:");
        rotNome = new JLabel("Nome Completo: ");
        rotEndereco = new JLabel("Endereço: ");
        rotBairro = new JLabel("Bairro: ");
        rotCidade = new JLabel("Cidade: ");
        rotEstado = new JLabel("Estado: ");
        rotCEP = new JLabel("C.E.P: ");
        rotSexo = new JLabel("Sexo: ");
        rotCelular = new JLabel("Celular: ");
        rotTelefone = new JLabel("Telefone: ");
        rotDataAniversario = new JLabel("Data do Aniversário: ");
        rotDataCadastro = new JLabel("Data do Cadastro: ");

        txtCodigo = new JTextField(15);
        txtNome = new JTextField(15);
        txtEndereco = new JTextField(15);
        txtBairro = new JTextField(15);
        txtCidade = new JTextField(15);
        txtCEP = new JTextField(15);
        txtCelular = new JTextField(15);
        txtTelefone = new JTextField(15);
        txtDataAniversario = new JTextField(15);
        txtDataCadastro = new JTextField(15);

        lista = new JComboBox(estados);
        lista.setMaximumRowCount(7);

        opcMasculino = new JRadioButton("Masculino");
        opcFeminino = new JRadioButton("Feminino");

        grupo = new ButtonGroup();
        grupo.add(opcMasculino);
        grupo.add(opcFeminino);

        btnCadastrar = new JButton("Cadastrar");
        btnLimpar = new JButton("Limpar");
        btnFechar = new JButton("Fechar");

        // ------ Posicionando os Elementos ------ //

        rotCodigo.setBounds(50, 20, 200, 20);
        rotNome.setBounds(50, 60, 200, 20);
        rotEndereco.setBounds(50, 100, 200, 20);
        rotBairro.setBounds(50, 140, 200, 20);
        rotCidade.setBounds(50, 180, 200, 20);
        rotEstado.setBounds(50, 220, 200, 20);
        rotCEP.setBounds(50, 260, 200, 20);
        rotSexo.setBounds(50, 300, 200, 20);
        rotCelular.setBounds(50, 340, 200, 20);
        rotTelefone.setBounds(50, 380, 200, 20);
        rotDataAniversario.setBounds(50, 420, 200, 20);
        rotDataCadastro.setBounds(50, 460, 200, 20);

        txtCodigo.setBounds(250, 20, 200, 20);
        txtNome.setBounds(250, 60, 200, 20);
        txtEndereco.setBounds(250, 100, 200, 20);
        txtBairro.setBounds(250, 140, 200, 20);
        txtCidade.setBounds(250, 180, 200, 20);
        txtCEP.setBounds(250, 260, 200, 20);
        txtCelular.setBounds(250, 340, 200, 20);
        txtTelefone.setBounds(250, 380, 200, 20);
        txtDataAniversario.setBounds(250, 420, 200, 20);
        txtDataCadastro.setBounds(250, 460, 200, 20);

        lista.setBounds(250, 220, 200, 20);

        opcMasculino.setBounds(250, 300, 100, 20);
        opcFeminino.setBounds(350, 300, 100, 20);

        btnCadastrar.setBounds(50, 500, 100, 30);
        btnLimpar.setBounds(200, 500, 100, 30);
        btnFechar.setBounds(350, 500, 100, 30);

        // ------ Definindo o Texto de Exemplo dos Elementos ------ //

        try {
            maskCodigo = new MaskFormatter("######");
            maskNome = new MaskFormatter("Nome e Sobrenome");
            maskEndereco = new MaskFormatter("Rua (nome da rua)");
            maskBairro = new MaskFormatter("(nome do bairro)");
            maskCidade = new MaskFormatter("(nome da cidade)");
            maskCEP = new MaskFormatter("#####-##");
            maskCelular = new MaskFormatter("(##)");
            maskTelefone = new MaskFormatter("(##)");
            maskDataAniversario = new MaskFormatter("##/##/####");
            maskDataCadastro = new MaskFormatter("##/##/####");

            maskCodigo.setPlaceholderCharacter('X');
            maskNome.setPlaceholderCharacter('X');
            maskEndereco.setPlaceholderCharacter('X');
            maskBairro.setPlaceholderCharacter('X');
            maskCidade.setPlaceholderCharacter('X');
            maskCEP.setPlaceholderCharacter('X');
            maskCelular.setPlaceholderCharacter('X');
            maskTelefone.setPlaceholderCharacter('X');
            maskDataAniversario.setPlaceholderCharacter('X');
            maskDataCadastro.setPlaceholderCharacter('X');
        }

        catch(ParseException excp){}

        codigo = new JFormattedTextField(maskCodigo);
        nome = new JFormattedTextField(maskNome);
        endereco = new JFormattedTextField(maskEndereco);
        bairro = new JFormattedTextField(maskBairro);
        cidade = new JFormattedTextField(maskCidade);
        cep = new JFormattedTextField(maskCEP);
        celular = new JFormattedTextField(maskCelular);
        telefone = new JFormattedTextField(maskTelefone);
        dataAniversario = new JFormattedTextField(maskDataAniversario);
        dataCadastro = new JFormattedTextField(maskDataCadastro);

        codigo.setBounds(250, 20, 200, 20);
        nome.setBounds(250, 60, 200, 20);
        endereco.setBounds(250, 100, 200, 20);
        bairro.setBounds(250, 140, 200, 20);
        cidade.setBounds(250, 180, 200, 20);
        cep.setBounds(250, 260, 200, 20);
        celular.setBounds(250, 340, 200, 20);
        telefone.setBounds(250, 380, 200, 20);
        dataAniversario.setBounds(250, 420, 200, 20);
        dataCadastro.setBounds(250, 460, 200, 20);

        // ------ Definindo a Fonte do Texto dos Elementos ------ //

        rotCodigo.setFont(new Font("Times New Roman", Font.BOLD, 17));
        rotNome.setFont(new Font("Times New Roman", Font.BOLD, 17));
        rotEndereco.setFont(new Font("Times New Roman", Font.BOLD, 17));
        rotBairro.setFont(new Font("Times New Roman", Font.BOLD, 17));
        rotCidade.setFont(new Font("Times New Roman", Font.BOLD, 17));
        rotEstado.setFont(new Font("Times New Roman", Font.BOLD, 17));
        rotCEP.setFont(new Font("Times New Roman", Font.BOLD, 17));
        rotSexo.setFont(new Font("Times New Roman", Font.BOLD, 17));
        rotCelular.setFont(new Font("Times New Roman", Font.BOLD, 17));
        rotTelefone.setFont(new Font("Times New Roman", Font.BOLD, 17));
        rotDataAniversario.setFont(new Font("Times New Roman", Font.BOLD, 17));
        rotDataCadastro.setFont(new Font("Times New Roman", Font.BOLD, 17));

        txtCodigo.setFont(new Font("Times New Roman", Font.BOLD, 17));
        txtNome.setFont(new Font("Times New Roman", Font.BOLD, 17));
        txtEndereco.setFont(new Font("Times New Roman", Font.BOLD, 17));
        txtBairro.setFont(new Font("Times New Roman", Font.BOLD, 17));
        txtCidade.setFont(new Font("Times New Roman", Font.BOLD, 17));
        txtCEP.setFont(new Font("Times New Roman", Font.BOLD, 17));
        txtCelular.setFont(new Font("Times New Roman", Font.BOLD, 17));
        txtTelefone.setFont(new Font("Times New Roman", Font.BOLD, 17));
        txtDataAniversario.setFont(new Font("Times New Roman", Font.BOLD, 17));
        txtDataCadastro.setFont(new Font("Times New Roman", Font.BOLD, 17));

        codigo.setFont(new Font("Times New Roman", Font.BOLD, 17));
        nome.setFont(new Font("Times New Roman", Font.BOLD, 17));
        endereco.setFont(new Font("Times New Roman", Font.BOLD, 17));
        bairro.setFont(new Font("Times New Roman", Font.BOLD, 17));
        cidade.setFont(new Font("Times New Roman", Font.BOLD, 17));
        cep.setFont(new Font("Times New Roman", Font.BOLD, 17));
        celular.setFont(new Font("Times New Roman", Font.BOLD, 17));
        telefone.setFont(new Font("Times New Roman", Font.BOLD, 17));
        dataAniversario.setFont(new Font("Times New Roman", Font.BOLD, 17));
        dataCadastro.setFont(new Font("Times New Roman", Font.BOLD, 17));

        // ------ Definindo a Cor do Texto dos Elementos ------ //

        rotCodigo.setForeground(new Color(62, 58, 43));
        rotNome.setForeground(new Color(62, 58, 43));
        rotEndereco.setForeground(new Color(62, 58, 43));
        rotBairro.setForeground(new Color(62, 58, 43));
        rotCidade.setForeground(new Color(62, 58, 43));
        rotEstado.setForeground(new Color(62, 58, 43));
        rotCEP.setForeground(new Color(62, 58, 43));
        rotSexo.setForeground(new Color(62, 58, 43));
        rotCelular.setForeground(new Color(62, 58, 43));
        rotTelefone.setForeground(new Color(62, 58, 43));
        rotDataAniversario.setForeground(new Color(62, 58, 43));
        rotDataCadastro.setForeground(new Color(62, 58, 43));

        txtNome.setForeground(new Color(62, 58, 43));
        txtEndereco.setForeground(new Color(62, 58, 43));
        txtBairro.setForeground(new Color(62, 58, 43));
        txtCidade.setForeground(new Color(62, 58, 43));

        codigo.setForeground(new Color(62, 58, 43));
        cep.setForeground(new Color(62, 58, 43));
        celular.setForeground(new Color(62, 58, 43));
        telefone.setForeground(new Color(62, 58, 43));
        dataAniversario.setForeground(new Color(62, 58, 43));
        dataCadastro.setForeground(new Color(62, 58, 43));

        opcMasculino.setForeground(new Color(62, 58, 43));
        opcFeminino.setForeground(new Color(62, 58, 43));

        btnCadastrar.setForeground(new Color(247, 245, 235));
        btnLimpar.setForeground(new Color(247, 245, 235));
        btnFechar.setForeground(new Color(247, 245, 235));

        lista.setForeground(new Color(62, 58, 43));

        // ------ Definindo a Cor do Background dos Elementos ------ //

        tela.setBackground(new Color(212, 207, 165));

        txtNome.setBackground(new Color(232, 229, 200));
        txtEndereco.setBackground(new Color(232, 229, 200));
        txtBairro.setBackground(new Color(232, 229, 200));
        txtCidade.setBackground(new Color(232, 229, 200));

        codigo.setBackground(new Color(232, 229, 200));
        cep.setBackground(new Color(232, 229, 200));
        celular.setBackground(new Color(232, 229, 200));
        telefone.setBackground(new Color(232, 229, 200));
        dataAniversario.setBackground(new Color(232, 229, 200));
        dataCadastro.setBackground(new Color(232, 229, 200));

        lista.setBackground(new Color(232, 229, 200));

        opcMasculino.setBackground(new Color(212, 207, 165));
        opcFeminino.setBackground(new Color(212, 207, 165));

        btnCadastrar.setBackground(new Color(162, 157, 127));
        btnLimpar.setBackground(new Color(162, 157, 127));
        btnFechar.setBackground(new Color(120, 100, 80));

        // ------ Definindo o Conteúdo das Operações ------ //

        btnCadastrar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        // ------ Coletando os dados ------ //

                        String InfoCodigo             = txtCodigo.getText();
                        String InfoNome               = txtNome.getText();
                        String InfoEndereco           = txtEndereco.getText();
                        String InfoBairro             = txtBairro.getText();
                        String InfoCidade             = txtCidade.getText();
                        String InfoEstado             = (String) lista.getSelectedItem();
                        String InfoCEP                = txtCEP.getText();
                        String InfoSexo               = opcMasculino.isSelected() ? "Masculino" : "Feminino";
                        String InfoCelular            = txtCelular.getText();
                        String InfoTelefone           = txtTelefone.getText();
                        String InfoDataAniversario    = txtDataAniversario.getText();
                        String InfoDataCadastro       = txtDataCadastro.getText();

                        // ------ Abrindo a Tela 3 ------ //

                        new Informacoes(InfoCodigo, InfoNome, InfoEndereco, InfoBairro,
                                InfoCidade, InfoEstado, InfoCEP, InfoSexo,
                                InfoCelular, InfoTelefone, InfoDataAniversario,
                                InfoDataCadastro).setVisible(true);
                        dispose();
                    }
                }
        );

        btnLimpar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        txtCodigo.setText("");
                        txtNome.setText("");
                        txtEndereco.setText("");
                        txtBairro.setText("");
                        txtCidade.setText("");
                        txtCEP.setText("");
                        txtCelular.setText("");
                        txtTelefone.setText("");
                        txtDataAniversario.setText("");
                        txtDataCadastro.setText("");
                    }
                }
        );

        btnFechar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        new Menu().setVisible(true);
                        dispose();
                    }
                }
        );

        // ------ Adicionando os Elementos na Tela ------ //

        tela.add(rotCodigo);
        tela.add(rotNome);
        tela.add(rotEndereco);
        tela.add(rotBairro);
        tela.add(rotCidade);
        tela.add(rotEstado);
        tela.add(rotCEP);
        tela.add(rotSexo);
        tela.add(rotCelular);
        tela.add(rotTelefone);
        tela.add(rotDataAniversario);
        tela.add(rotDataCadastro);

        tela.add(txtCodigo);
        tela.add(txtNome);
        tela.add(txtEndereco);
        tela.add(txtBairro);
        tela.add(txtCidade);
        tela.add(txtCEP);
        tela.add(txtCelular);
        tela.add(txtTelefone);
        tela.add(txtDataAniversario);
        tela.add(txtDataCadastro);

        tela.add(codigo);
        tela.add(nome);
        tela.add(endereco);
        tela.add(bairro);
        tela.add(cidade);
        tela.add(cep);
        tela.add(celular);
        tela.add(telefone);
        tela.add(dataAniversario);
        tela.add(dataCadastro);

        tela.add(lista);

        tela.add(opcMasculino);
        tela.add(opcFeminino);

        tela.add(btnCadastrar);
        tela.add(btnLimpar);
        tela.add(btnFechar);

        // ------ Definindo o Tamanho da Tela ------ //

        setSize(550, 600);

        // ------ Tornando a Tela Visível ------ //

        setVisible(true);

        // ------ Centralizando a Tela ao Compilar ------ //

        setLocationRelativeTo(null);
    }
}

class Informacoes extends JFrame {

    JButton btnFechar;

    public Informacoes(String InfoCodigo, String InfoNome, String InfoEndereco, String InfoBairro, String InfoCidade, String InfoEstado, String InfoCEP, String InfoSexo, String InfoCelular, String InfoTelefone, String InfoDataAniversario, String InfoDataCadastro) {

        super("Informações do Cadastro");

        Container tela = getContentPane();
        tela.setLayout(null);

        // ------ Definindo os Elementos ------ //

        JLabel rotCodigo = new JLabel("Código: " + InfoCodigo);
        JLabel rotNome = new JLabel("Nome: " + InfoNome);
        JLabel rotEndereco = new JLabel("Endereço: " + InfoEndereco);
        JLabel rotBairro = new JLabel("Bairro: " + InfoBairro);
        JLabel rotCidade = new JLabel("Cidade: " + InfoCidade);
        JLabel rotEstado = new JLabel("Estado: " + InfoEstado);
        JLabel rotCEP = new JLabel("CEP: " + InfoCEP);
        JLabel rotSexo = new JLabel("Sexo: " + InfoSexo);
        JLabel rotCelular = new JLabel("Celular: " + InfoCelular);
        JLabel rotTelefone = new JLabel("Telefone: " + InfoTelefone);
        JLabel rotDataAniversario = new JLabel("Data de Aniversário: " + InfoDataAniversario);
        JLabel rotDataCadastro = new JLabel("Data de Cadastro: " + InfoDataCadastro);

        btnFechar = new JButton("Fechar");

        // ------ Posicionando os Elementos ------ //

        rotCodigo.setBounds(50, 20,  400, 20);
        rotNome.setBounds(50, 60,  400, 20);
        rotEndereco.setBounds(50, 100, 400, 20);
        rotBairro.setBounds(50, 140, 400, 20);
        rotCidade.setBounds(50, 180, 400, 20);
        rotEstado.setBounds(50, 220, 400, 20);
        rotCEP.setBounds(50, 260, 400, 20);
        rotSexo.setBounds(50, 300, 400, 20);
        rotCelular.setBounds(50, 340, 400, 20);
        rotTelefone.setBounds(50, 380, 400, 20);
        rotDataAniversario.setBounds(50, 420, 400, 20);
        rotDataCadastro.setBounds(50, 460, 400, 20);

        btnFechar.setBounds(200, 500, 100, 30);

        // ------ Definindo a Fonte do Texto dos Elementos ------ //

        rotCodigo.setFont(new Font("Times New Roman", Font.BOLD, 17));
        rotNome.setFont(new Font("Times New Roman", Font.BOLD, 17));
        rotEndereco.setFont(new Font("Times New Roman", Font.BOLD, 17));
        rotBairro.setFont(new Font("Times New Roman", Font.BOLD, 17));
        rotCidade.setFont(new Font("Times New Roman", Font.BOLD, 17));
        rotEstado.setFont(new Font("Times New Roman", Font.BOLD, 17));
        rotCEP.setFont(new Font("Times New Roman", Font.BOLD, 17));
        rotSexo.setFont(new Font("Times New Roman", Font.BOLD, 17));
        rotCelular.setFont(new Font("Times New Roman", Font.BOLD, 17));
        rotTelefone.setFont(new Font("Times New Roman", Font.BOLD, 17));
        rotDataAniversario.setFont(new Font("Times New Roman", Font.BOLD, 17));
        rotDataCadastro.setFont(new Font("Times New Roman", Font.BOLD, 17));

        // ------ Definindo a Cor do Texto dos Elementos ------ //

        rotCodigo.setForeground(new Color(62, 58, 43));
        rotNome.setForeground(new Color(62, 58, 43));
        rotEndereco.setForeground(new Color(62, 58, 43));
        rotBairro.setForeground(new Color(62, 58, 43));
        rotCidade.setForeground(new Color(62, 58, 43));
        rotEstado.setForeground(new Color(62, 58, 43));
        rotCEP.setForeground(new Color(62, 58, 43));
        rotSexo.setForeground(new Color(62, 58, 43));
        rotCelular.setForeground(new Color(62, 58, 43));
        rotTelefone.setForeground(new Color(62, 58, 43));
        rotDataAniversario.setForeground(new Color(62, 58, 43));
        rotDataCadastro.setForeground(new Color(62, 58, 43));

        btnFechar.setForeground(new Color(247, 245, 235));

        // ------ Definindo a Cor do Background dos Elementos ------ //

        tela.setBackground(new Color(212, 207, 165));

        btnFechar.setBackground(new Color(120, 100, 80));

        // ------ Definindo o Conteúdo das Operações ------ //

        btnFechar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        new Menu().setVisible(true);
                        dispose();
                    }
                }
        );

        // ------ Adicionando os Elementos na Tela ------ //

        tela.add(rotCodigo);
        tela.add(rotNome);
        tela.add(rotEndereco);
        tela.add(rotBairro);
        tela.add(rotCidade);
        tela.add(rotEstado);
        tela.add(rotCEP);
        tela.add(rotSexo);
        tela.add(rotCelular);
        tela.add(rotTelefone);
        tela.add(rotDataAniversario);
        tela.add(rotDataCadastro);
        tela.add(btnFechar);

        // ------ Definindo o Tamanho da Tela ------ //

        setSize(500, 600);

        // ------ Centralizando a Tela ao Compilar ------ //

        setLocationRelativeTo(null);
    }
}

public class Main {
    public static void main(String[] args) {
        Menu app = new Menu();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}