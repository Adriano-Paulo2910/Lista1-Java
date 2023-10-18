/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import entidade.Porta;

/**
 *
 * @author Adriano Paulo
 */
public class TestePorta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Porta porta = new Porta(true, "Amarela", 2, 3, 4);
        System.out.println("--------Dados da porta-----------");
        porta.paint("Azul");
        porta.close();
        System.out.println("Cor: " + porta.getCor());
        System.out.println("Aberta: " + porta.isOpen());
    } 
}
