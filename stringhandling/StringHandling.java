/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringhandling;
import java.lang.*;
import java.util.Arrays;

/**
 *
 * @author L NelSoN ManGanGchA
 */
public class StringHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char chars[]={'a','b','c','e','f'};
        byte code[]={67,68,58,45};
        String s=new String(chars);
        String b=new String(chars,2,3);
        String c=new String(code);
        System.out.println(b);
        System.out.println(c.length());
        char str[]= new char[20];
        s.getChars(2, 4, str, 0);
        System.out.println((str));
        boolean a=s.regionMatches(true, 2, b, 0, 3);
       System.out.println(s +" matches with "+ b + ":" + a);
    }
    
}
