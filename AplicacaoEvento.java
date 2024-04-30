/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projop;

/**
 *
 * @author Alunos
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author DENISE NEVES
 */
    public class AplicacaoEvento extends AplicacaoButton implements ActionListener
	{
                Operadora operadora = new Operadora("");
                AplicacaoEvento()
		{
		   
               
                        B1.addActionListener(this);// Adiciona ações ao botão
			B2.addActionListener(this);
		   
			
		}
		public void actionPerformed(ActionEvent e)//
		{
                        //Incluir usuario
			if(e.getSource()==B1)
			{   
                            JOptionPane.showMessageDialog(null, "Entrou B1");
                            operadora = new Operadora(Tx1.getText());
                            System.out.println(operadora.getNome());
                            // limpar campos
                            Tx1.setText("");
			                              
			}
                        else {
                        				
                         // Sair da aplicação
			 if (e.getSource() == B2)
			 {				
				this.dispose();
		  	 }
                        } 
                        
				
		}
	       public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AplicacaoEvento().show();

	}
}

