/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import entidades.Retangulo;

/**
 *
 * @author Adriano Paulo
 */
public class TesteRetangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Retangulo retangulo = new Retangulo();
        
        retangulo.setLado1(2);
        retangulo.setLado2(3);
        
        retangulo.calcularArea();
        retangulo.calcularPerimetro();
    }
}
