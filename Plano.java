
package projoperadora;

public class Plano {
   private String nome;
   private double custoMinuto;
   private Operadora operadora;
   
   public Plano( String nome, double custoMinuto, Operadora operadora){
       this.nome = nome;
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