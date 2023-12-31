/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Adriano Paulo
 */
public class Retangulo {
    private float lado1;
    private float lado2;
    private float area;
    private float perimetro;

    public Retangulo() {
        
    }
    
    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }
    
    public void calcularArea(){
        area = lado1 * lado2;
        System.out.println("Area: " + area);
    }
    
    public void calcularPerimetro(){
        perimetro = 2 * (lado1 * lado2);
        System.out.println("Perimetro: " + perimetro);
    }
}
