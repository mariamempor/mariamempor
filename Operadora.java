/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projop;
import java.util.ArrayList;


public class Operadora {
    private String nome;
    private ArrayList<Plano> planos;
   
    public Operadora(String nome){
     planos = new ArrayList();
     this.nome = nome;
   }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList getPlanos() {
        return planos;
    }

    public void adicionaPlano(Plano plano) {
        this.planos.add(plano);
    }
    
}
