/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import entidades.Funcionario;

/**
 *
 * @author Adriano Paulo
 */
public class TesteFuncionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Funcionario funcionario = new Funcionario("Adriano", "Paulo", 8, 3000);
        funcionario.incrementarHoras(-2);
        String nomeCompleto = funcionario.nomeCompleto();
        System.out.println("Nome Completo: " + nomeCompleto);
        funcionario.calcularSalario();
    }
}
