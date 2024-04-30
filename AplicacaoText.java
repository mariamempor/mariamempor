/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projOperadora;

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
			Tx1.setBounds(190,120,150,20);
                    
						
			getContentPane().add(Tx1);
			
		}

		public static void main(String arg[])
		{
			new AplicacaoText().show();
		}

    
}
