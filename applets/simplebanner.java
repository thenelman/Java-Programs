/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applets;
import java.applet.*;
import java.awt.*;
        
/*
<applet code="Simple Banner" width=300 height=50>
</applet>
*/

public class simplebanner extends Applet implements Runnable {
    String msg= "A simple Moving Banner";
    Thread t= null;
    int state;
    volatile boolean stopflag;
    public void init(){
        setBackground(Color.CYAN);
        setForeground(Color.red);
    }
    public void start(){
        t= new Thread(this);
        stopflag=false;
        t.start();
    }
    
    public void run(){
        for(;;){
            try{
                repaint();
                Thread.sleep(250);
                if(stopflag)
                        break;
            } catch(InterruptedException e){
            }
        }
    }
    public void stop(){
        stopflag=true;
        t=null;
    }
    
    public void paint(Graphics G){
        char ch;
        ch=msg.charAt(0);
        msg= msg.substring(1, msg.length());
        msg += ch;
        
        G.drawString(msg, 50,30);
        
    }
}
