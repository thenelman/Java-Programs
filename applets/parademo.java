/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applets;
import java.awt.*;
import java.applet.*;

/*
<applet code= "Parademo" width=300 height=80>
<param name=fontName value=Courier>
<param name=fontSize value=14>
<param name=leading value=2.0>
<param name=accountEnabled value= true>
</applet>
*/

public class parademo extends Applet {
    String fontName;
    int fontSize;
    float leading;
    boolean active;
    
    public void start(){
        String param;
        fontName= getParameter("fontName");
        if(fontName==null)
            fontName="not found";
        param= getParameter("fontSize");
        try{
            if(param!=null)
                fontSize=Integer.parseInt(param);
            else fontSize=0;
        } catch(NumberFormatException e){
            fontSize= -1;
        }
        
        param=getParameter("leading");
       try{ 
           if (param!=null)
               leading=Float.valueOf(param).floatValue();
           else leading =0;
           } catch(NumberFormatException e){
               leading= -1;
           }
       param = getParameter("accountEnabled");
       if(param!=null)
           active= Boolean.valueOf(param).booleanValue();
    }
    public void paint(Graphics g){
        g.drawString("fontName: "+fontName, 0, 10);
        g.drawString("FontSize: "+fontSize, 0, 26);
        g.drawString("Leading: "+ leading, 0, 45);
        g.drawString("account active: "+ active, 0, 64);
    }
}
