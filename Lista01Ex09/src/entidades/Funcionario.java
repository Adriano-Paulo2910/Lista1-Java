/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Adriano Paulo
 */
public class Funcionario {
    private String nome;
    private String sobreNome;
    private int horasTrabalhadas;
    private float valorPorHora;

    public Funcionario(String nome, String sobreNome, int horasTrabalhadas, float valorPorHora) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public float getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(float valorPorHora) {
        this.valorPorHora = valorPorHora;
    }
    
    public String nomeCompleto (){
        return this.nome + " " + this.sobreNome;
    }
    
    public void calcularSalario (){
        System.out.println("Salario: " + this.horasTrabalhadas * this.valorPorHora);
    }
    
    public void incrementarHoras (int valor){
        if (valor >= 0) {
            this.valorPorHora += valor;
        }
    }
}
