package projoperadora;

import java.util.ArrayList;

public class Operadora {
    private String nome;
    private ArrayList <Plano> planos;
    
    public Operadora (String nome){
    planos = new ArrayList();
    this.nome = nome;

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void adicionaPlano (Plano plano){
        this.getPlanos().add(plano);
    }

    public ArrayList <Plano> getPlanos() {
        return planos;
    }

    
}
