/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;
import java.util.*;
/**
 *
 * @author L NelSoN ManGanGchA
 */
public class HashSets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan= new Scanner(System.in);
        LinkedHashSet<String> hs = new LinkedHashSet<>();
        String str;
        do{
            str = scan.next();
            if(!str.equalsIgnoreCase("Stop"))
                hs.add(str);
        }while(!str.equalsIgnoreCase("Stop"));
        
        System.out.println(hs);
    }
    
}
