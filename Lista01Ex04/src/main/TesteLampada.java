/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import entidade.Lampada;

/**
 *
 * @author Adriano Paulo
 */
public class TesteLampada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Lampada lampada = new Lampada();
        
        lampada.setStatus(true);
        lampada.acender();
    }
    
}
