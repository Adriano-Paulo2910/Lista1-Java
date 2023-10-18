/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import entidades.Circulo;

/**
 *
 * @author Adriano Paulo
 */
public class TesteCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circulo circulo = new Circulo();
        circulo.setRaio(2);
        circulo.calcularArea();
        circulo.calcularPerimetro();
    }
}
