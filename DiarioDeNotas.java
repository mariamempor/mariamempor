package diarioDeNotas;

import javax.swing.JOptionPane;

public class DiarioDeNotas {
static String  nomeAluno;
static String nomeProf;

    public static void main(String[] args) {
        
        Aluno aluno  = new Aluno();
        Professor professor = new Professor ();
               
        String usuario = JOptionPane.showInputDialog("Digite Professor se vocês for professor e aluno se você for aluno");
        if (usuario.equalsIgnoreCase("professor")) {
            
            String nomeProfessor = JOptionPane.showInputDialog("Digite seu nome");
            
              nomeProf = JOptionPane.showInputDialog("Digite o nome do aluno");

            JOptionPane.showMessageDialog(null, "Bem vindo " + usuario + nomeProf);
        
             aluno.identificarAluno();
             professor.identificarProfessor ();
        

        
        }else if(usuario.equalsIgnoreCase("aluno")){
         nomeAluno = JOptionPane.showInputDialog("Digite seu nome");
         JOptionPane.showMessageDialog(null, "Bem vindo aluno " + usuario + nomeAluno);   
        }else{
         JOptionPane.showMessageDialog(null, "Usuário invaalido" );   
         
     
        }

    }
    
   /* public void opacao2(){
         String usuario = JOptionPane.showInputDialog("Digite Professor se vocês for professor e aluno se você for aluno");

        if(usuario.equalsIgnoreCase("professor") || (usuario.equalsIgnoreCase("aluno"))){
          String nome = JOptionPane.showInputDialog("Digite seu nome");
        }else{
         JOptionPane.showMessageDialog(null, "Usuário invaalido" );   

        }
    
}*/

}