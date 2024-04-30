/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projop;

import java.util.ArrayList;

/**
 *
 * @author Alunos
 */
public class projPlanos {
       public static void main(String[] args) {
        Operadora operadora = new Operadora("Vivo");
     //System.out.println("Operadora:" + operadora.getNome());

     Plano plano1 = new Plano("Estudante",0.2, operadora);

     System.out.println("Plano:"+ plano1.getNome() +
                         "-Custo do minuto:"+ plano1.getCustoMinuto()+
                         "-Operadora" + plano1.getOperadora().getNome()
                        );
      Plano plano2 = new Plano("Familia Feliz",0.2, operadora);

     System.out.println("Plano:"+ plano2.getNome() +
                         "-Custo do minuto:"+ plano2.getCustoMinuto()+
                         "-Operadora" + plano2.getOperadora().getNome()
                        );
   
    operadora.adicionaPlano(plano1);
    operadora.adicionaPlano(plano2);
    // criar plano para outra operadora 
    operadora = new Operadora("Tim");
    // Criar outro plano para o Tim 
    plano1 = new Plano("",0, operadora);
    plano1.setNome("Mãe Feliz-2");
    plano1.setCustoMinuto(0.3);
    
    System.out.println("Plano:"+ plano1.getNome() +
                         "-Custo do minuto:"+ plano1.getCustoMinuto()+
                         "-Operadora" + plano1.getOperadora().getNome()
                        ); 
    operadora.adicionaPlano(plano1);
    
      plano1 = new Plano("",0, operadora);
    plano1.setNome("Amanhã");
    plano1.setCustoMinuto(0.1);
    
    
    
    System.out.println("*Lista de Planos da Operadora*"); 
    operadora.adicionaPlano(plano1);

    ArrayList<Plano> planosM = operadora.getPlanos();

        for (int i = 0; i< planosM.size(); i++){
            Plano plano = planosM.get(i);
            System.out.println(plano.getNome());
        }
        }
        
    }