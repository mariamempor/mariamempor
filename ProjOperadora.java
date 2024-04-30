
package projoperadora;

import java.util.ArrayList;

public class ProjOperadora {

    public static void main(String[] args) {
  
        Operadora operadora = new Operadora("Vivo");
        //instancia plano
       
        Plano plano1 = new Plano ("Familia" , 0.8, operadora);
        Plano plano2 = new Plano ("Estudante" , 0.3, operadora);
       
        System.out.println(plano1.getNome()+ " - " + plano1.getOperadora().getNome() + " - "+plano1.getCustoMinuto());
        System.out.println(plano2.getNome()+" - " + plano2.getOperadora().getNome() + " - "+ plano2.getCustoMinuto());
        
        operadora.adicionaPlano(plano1);
        operadora.adicionaPlano(plano2);
        // criar plano para outra operadora
        operadora = new Operadora("Tim");
        // criar outro plano para o tim    
        plano1 = new Plano("",0, operadora); 
        plano1.setNome("mãe Feliz - 2");
        plano1.setCustoMinuto(0.3);
                
        System.out.println("Plano: " + plano1.getNome() + " - Custo minuto: " + plano1.getCustoMinuto() + " - Operadora " + plano1.getOperadora() .getNome());
        operadora.adicionaPlano(plano1);
        
        System.out.println(operadora.getPlanos());
                
        ArrayList <Plano> planos = operadora.getPlanos();
        for (int i = 0; i< planos.size(); i++){
            Plano plano = planos.get (i);
            System.out.println(plano.getNome());
        }
        
        
    }
    
}
