/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projop;

/**
 *
 * @author Alunos
 */

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
		L1.setFont(new Font("Arial",Font.BOLD,18));
                L1.setBorder(BorderFactory.createLineBorder(cor1,04));
                L1.setForeground(cor2);
                L1.setBounds(130,20,560,60);
		
		L2 =new JLabel("NOME :",JLabel.RIGHT);
                L2.setFont(new Font("Arial",Font.BOLD,16));
                L2.setForeground(cor1);
                L2.setBounds(110,160,100,30);
		
	       ImageIcon icon = new ImageIcon("C:\\Users\\TEMP\\Documents\\NetBeansProjects\\ProjPlanos\\src\\projplanos\\icone.png");
               JLabel label = new JLabel(icon);
               label.setBounds(10,20,100,60);
                
		getContentPane().setLayout(null);
		getContentPane().add(L1); 
		getContentPane().add(L2);
		getContentPane().add(label);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AplicacaoLabel().show();

	}
}


