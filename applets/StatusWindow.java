/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applets;
import java.awt.*;
import java.applet.*;

/*
<applet code="Status Window" width=300 height=50>
</applet>
*/

public class StatusWindow extends Applet {
    public void init(){
        setBackground(Color.cyan);
    }
    
    public void paint(Graphics g){
        g.drawString("this is the applet window", 10, 20);
        showStatus("This is the status window");
    }
}
