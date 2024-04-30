/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projop;

public class Plano {
    private String nome;
    private double custoMinuto;
    private Operadora operadora;
    
    public Plano (String nome, double custoMinuto, Operadora operadora){
        this.nome = nome = nome;
        this.custoMinuto = custoMinuto;
        this.operadora = operadora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCustoMinuto() {
        return custoMinuto;
    }

    public void setCustoMinuto(double custoMinuto) {
        this.custoMinuto = custoMinuto;
    }

    public Operadora getOperadora() {
        return operadora;
    }


    public void setOperadora(Operadora operadora) {
        this.operadora = operadora;
    } 
}
