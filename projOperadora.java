package projoperadora;

public class ProjOperadora {

    public static void main(String[] args) {
  
        Operadora operadora = new Operadora("Vivo");
        //instancia plano
       Plano plano1 = new Plano ("Familia" , 0.8, operadora);
       Plano plano2 = new Plano ("Estudante" , 0.3, operadora);
       
        System.out.println(plano1.getNome()+ "-"+ plano1.getOperadora().getNome()+"-"+plano1.getCustoMinuto());
        System.out.println(plano2.getNome()+"-"+ plano2.getOperadora().getNome()+"-"+ plano2.getCustoMinuto());
        
        operadora.adicionaPlano(plano1);
        operadora.adicionaPlano(plano2);
        System.out.println(operadora.getPlanos());
    }
    
}
