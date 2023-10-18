/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

/**
 *
 * @author Adriano Paulo
 */
public class Lampada {
    private float voltagem;
    private String cor;
    private String marca;
    private float preco;
    private float potencia;
    private boolean status;
    private String tipo;
    
    
    public Lampada(){
        
    }

    public Lampada(float voltagem, String cor, String marca, float preco, float potencia, boolean status, String tipo) {
        this.voltagem = voltagem;
        this.cor = cor;
        this.marca = marca;
        this.preco = preco;
        this.potencia = potencia;
        this.status = status;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(float voltagem) {
        this.voltagem = voltagem;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void acender(){
        if (this.status = true) {
            System.out.println("Lampada acesa.");
        }
    }
    
    public void apagar(){
        if (this.status = false){
            System.out.println("Lampada apagada.");
        }
    }
    
    public String ligado(){
        if (this.status == true) {
            return "Sim";
        }
        else{
           return "Não";
        }
    }
    
    public void imprime(){
        System.out.println("------Estado da Lampada------");
        System.out.println("Potencia: " + this.potencia);
        System.out.println("Cor: " + this.cor);
        System.out.println("Marca: " + this.marca);
        System.out.println("Ligada: " + this.ligado());
    }
}
