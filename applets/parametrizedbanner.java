/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applets;
import java.applet.*;
import java.awt.*;

/*
<applet code="parametrizedbanner" width=300 height=50>
<param name=message value="java makes the web move!">
</applet>
*/

public class parametrizedbanner extends Applet implements Runnable{
    String msg;
    Thread t=null;
    int state;
    volatile boolean stopflag;
    public void init(){
        setBackground(Color.cyan);
        setForeground(Color.ORANGE);
    }
    public void start(){
        msg=getParameter("message");
        if (msg==null)
            msg= "message not found";
        msg=" "+msg;
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
            }catch (InterruptedException e){
        }
    }
}
    public void stop(){
        stopflag=true;
        t=null;
    }
    public void paint(Graphics g){
        char ch;
        ch= msg.charAt(0);
        msg=msg.substring(1, msg.length());
        msg+=ch;
        
        g.drawString(msg,50,30);
    }
}

