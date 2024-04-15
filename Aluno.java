
package diarioDeNotas;

import static diarioDeNotas.DiarioDeNotas.nomeAluno;
import javax.swing.JOptionPane;


public class Aluno {
    
   private String nome;
   private int idade;
    private String curso;
    private String email;
    private double telefone;
    private String ra;
    
    public void Aluno (String nome, int idade, String curso, String email, double telefone, String ra){
        this.setNome(nome);
        this.setIdade(idade);
        this.setCurso(curso);
        this.setEmail(email);
        this.setTelefone(telefone);
        this.setRa(ra);
        
    
    
  
}   

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefone
     */
    public double getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the ra
     */
    public String getRa() {
        return ra;
    }

    /**
     * @param ra the ra to set
     */
    public void setRa(String ra) {
        this.ra = ra;
    }   

    public void identificarAluno() {
        
        
    }

   
    
}
    
