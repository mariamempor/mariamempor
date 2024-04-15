import javax.swing.JOptionPane;

public class DiarioDeNotas {
    static String nomeAluno;
    
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        
        String usuario = JOptionPane.showInputDialog("Digite 'Professor' se você for professor e 'Aluno' se você for aluno");
        
        if (usuario.equalsIgnoreCase("Professor")) {
            professor.identificarProfessor();
            aluno.visualizarNota();
        } else if(usuario.equalsIgnoreCase("Aluno")) {
            aluno.identificarAluno();
        } else {
            JOptionPane.showMessageDialog(null, "Usuário inválido");
        }
    }
}
