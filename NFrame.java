/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projOperadora;

import java.awt.Color;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author DENISE NEVES
 */
public class NFrame extends JFrame{
   public NFrame(){ 
    Color cor1 = new Color(229,0,0);
    Color cor2 = new Color(255,141,0);
    Color cor3 = new Color (255,238,0);
    Color cor4 = new Color (2,129,33);
    Color cor5 = new Color (0,76,255);
    Color cor6 = new Color (119,0,136);
    
    Container c = getContentPane();
    setLocation(100,50);
    setTitle("Aplicação Operadoras/Planos");
    setSize(800,500);
    setUndecorated(true);
    c.setBackground (cor1);
    c.setBackground (cor2);
    c.setBackground (cor3);
    c.setBackground (cor4);
    c.setBackground (cor5);
    c.setBackground (cor6);
    
    getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
    getRootPane().setBorder(BorderFactory.createLineBorder(Color.black,3));
    setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
   public static void main(String arg[]){
   new NFrame().show();
   }
}