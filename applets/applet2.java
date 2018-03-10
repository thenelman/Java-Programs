/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applets;
import java.awt.*;
import java.applet.*;
import java.net.*;

/*
<appletcode="Applet2" width=300 height=50>
</applet>
*/
/**
 *
 * @author L NelSoN ManGanGchA
 */
public class applet2 extends Applet{
    public void paint(Graphics g){
        String msg;
        URL url=getCodeBase();
        msg= "code base: "+ url.toString();
        g.drawString(msg,10,20);
        url= getDocumentBase();
        msg="Document base: "+url.toString();
        g.drawString(msg,10 , 40);
    }
}
