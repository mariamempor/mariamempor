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
import java.awt.*;
import javax.swing.*;


public class NFrame extends JFrame{
   public NFrame(){ 
    Color corFundo = new Color(210,233,255);
    Color corBorda = new Color(72,164, 255);
    
    Container c = getContentPane();
    setLocation(10,0);
    setTitle("Aplicação Operadoras/Planos");
    setSize(1000,600);
    setUndecorated(true);
    c.setBackground (corFundo);
    getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
    getRootPane().setBorder(BorderFactory.createLineBorder(Color.BLUE,3));
    setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
   public static void main(String arg[]){
   new NFrame().show();
   }
}

