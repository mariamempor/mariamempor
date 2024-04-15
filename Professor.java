
import javax.swing.JOptionPane;

class Professor {
    String nome;
    int idade;
    String email;
    
    public void identificarProfessor() {
        nome = JOptionPane.showInputDialog("Digite seu nome:");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
        email = JOptionPane.showInputDialog("Digite seu email:");
        
        JOptionPane.showMessageDialog(null, "Bem-vindo, professor " + nome);
    }
}
