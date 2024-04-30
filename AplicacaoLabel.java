/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projOperadora;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

/**
 *
 * @author DENISE NEVES
 */

    public class AplicacaoLabel extends NFrame{

    
	JLabel L1, L2; // Objeto Independente
	Color cor1 = new Color(13,28,102);
        Color cor2 = Color.WHITE;
        
	public AplicacaoLabel()
	{

		L1 =new JLabel("Cadastro de Operadoras", JLabel.CENTER);
		L1.setFont(new Font("Arial",Font.BOLD,14));
                L1.setBorder(BorderFactory.createLineBorder(cor1,04));
                L1.setForeground(cor2);
                L1.setBounds(130,60,300,30);
		
		L2 =new JLabel("Nome :",JLabel.RIGHT);
                L2.setFont(new Font("Arial",Font.BOLD,12));
                L2.setBounds(70,120,100,20);
		
	       ImageIcon icon = new ImageIcon("C:\\Users\\DENISE NEVES\\Documents\\NetBeansProjects\\Academico\\src\\academico\\IMAGENS\\Egg.gif");
               JLabel label = new JLabel(icon);
               label.setBounds(70,250,200,200);
                
		getContentPane().setLayout(null);
		getContentPane().add(L1); 
		getContentPane().add(L2);
		//getContentPane().add(label);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AplicacaoLabel().show();

	}
}

    

