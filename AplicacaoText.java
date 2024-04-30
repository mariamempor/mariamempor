/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projop;

/**
 *
 * @author Alunos
 */

    import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JTextField;

/**
 *
 * @author DENISE NEVES
 */
public class AplicacaoText extends AplicacaoLabel{
    public JTextField Tx1;
		

		public AplicacaoText()
		{
			Tx1 = new JTextField();
			this.Tx1 = Tx1;
			Tx1.setBounds(220,160,200,30);
                        Tx1.setFont(new Font("Arial",Font.BOLD,16));
                        Tx1.setBorder(BorderFactory.createLineBorder(cor1,02));
						
			getContentPane().add(Tx1);
			
		}

		public static void main(String arg[])
		{
			new AplicacaoText().show();
		}

    
}
    

