
import javax.swing.JOptionPane;

class Aluno {
    String nome;
    int idade;
    String ra;
    String email;
    String telefone;
    
    public void identificarAluno() {
        nome = JOptionPane.showInputDialog("Digite seu nome:");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
        ra = JOptionPane.showInputDialog("Digite seu RA:");
        email = JOptionPane.showInputDialog("Digite seu email:");
        telefone = JOptionPane.showInputDialog("Digite seu telefone:");
        
        JOptionPane.showMessageDialog(null, "Bem-vindo, aluno " + nome);
    }
    
    public void visualizarNota() {
        // Implemente aqui a lógica para visualizar notas do aluno
    }
}
