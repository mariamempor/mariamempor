/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projop;

/**
 *
 * @author Alunos
 */
 import java.awt.event.KeyEvent;
import javax.swing.JButton;

/**
 *
 * @author DENISE NEVES
 */
public class AplicacaoButton extends AplicacaoText{
    JButton B1,B2,B3;
		
		public AplicacaoButton()
		{
					
			B1 =new JButton("Incluir");
			B1.setSize(80, 50);
			B1.setLocation(300,320);
			B1.setMnemonic(KeyEvent.VK_I);

			
			B2 = new JButton("Sair");
			B2.setSize(80, 50);
			B2.setLocation(400, 320);
			B2.setMnemonic(KeyEvent.VK_S);

		
                        getContentPane().add(B1);
			getContentPane().add(B2);
//			getContentPane().add(B3);
			}

		
		public static void main(String arg[])
		{
			new AplicacaoButton().show();
		}

                    
}

    

