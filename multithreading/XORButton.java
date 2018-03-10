/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author L NelSoN ManGanGchA
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class XORButton extends JButton implements ActionListener{
    protected ImageIcon X,O;
    protected tic_tac_toe parent;
    protected int r,c;
     boolean xor;
     public XORButton(tic_tac_toe t, int row , int col){
    
         parent= t;
         //X=new Image;
        // O=new ImageIcon("o.jpg");
         r=row;
         c=col;
         addActionListener(this);
     }
     @Override
     public void actionPerformed(ActionEvent ae){
         xor= !xor;
         if(xor)
             setText("X");
         else
             setText("O");
     }
    
}
