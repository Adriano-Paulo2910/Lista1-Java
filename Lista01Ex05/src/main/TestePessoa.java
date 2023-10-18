/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import entidade.Pessoa;

/**
 *
 * @author Adriano Paulo
 */
public class TestePessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa pessoa = new Pessoa("Paulo", 20);
        pessoa.dizerONome();
        pessoa.dizerAIdade();
        pessoa.fazerAniversario();
        pessoa.dizerAIdade();
    }
    
}
