/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projoperadora;

/**
 *
 * @author Alunos
 */
public class Projplanos {
    public static void main(String[] args) {
        // Instancia Operadora
        Operadora operadora = new Operadora("Vivo");
        // Instancia Plano
        Plano plano1 = new Plano("Familia" ,0.8, operadora);
        System.out.println(plano1.getNome() + "-" + plano1.getCustoMinuto() + "-" + plano1.getOperadora().getNome());
        
        Plano plano2 = new Plano("Estudante", 0.4, operadora);
        System.out.println(plano2.getNome() + "-" + plano2.getCustoMinuto() + "-" + plano2.getOperadora().getNome());
    }
    
}
