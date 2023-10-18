/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Adriano Paulo
 */
public class Circulo {
    private float raio;
    private float area;
    private float perimetro;

    public Circulo() {
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
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
        area = (float) (3.14 * (raio * raio));
        System.out.println("Area: " + area);
    }
    
    public void calcularPerimetro(){
        perimetro = (float) (2 * 3.14 * raio);
        System.out.println("Perimetro: " + perimetro);
    }
}
