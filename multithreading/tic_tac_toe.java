/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author L NelSoN ManGanGchA
 */
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
        
public class tic_tac_toe extends JFrame {
    JPanel jp=new JPanel();
    XORButton[][] buttons= new XORButton[3][3];
    int[][] buttonChars= new int[3][3];
    tic_tac_toe(){
        super("Tic tac toe");
        setSize(500,400);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        jp.setLayout(new GridLayout (4,3));
        add(jp);
        for(int i= 0; i<3;i++){
            for(int j=0;j<3;j++)
        {
            buttons[i][j]= new XORButton(this,i,j);
            jp.add(buttons[i][j]);
        }
        setVisible(true);
        }
        }
    public static void main(String args[]){
       tic_tac_toe t= new tic_tac_toe();
    }
}
