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
public class PropertiesDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Properties defList = new Properties();
        defList.put("Bihar","Patna");
        defList.put("Nagaland","Kohima");
        Properties capitals = new Properties(defList);
        capitals.put("Manipur", "Imphal");
        capitals.put("Telangana", "Hyderabad");
        capitals.put("West Bengal", "Kolkata");
        capitals.put("Karnataka", "Bengaluru");
        capitals.put("Tamil Nadu","Chennai");
        
        Set<?> states = capitals.keySet();
        for(Object name : states)
            System.out.println("The capital of "+name+" is "+capitals.getProperty((String)name)+".");
        System.out.println();
        
        String str = capitals.getProperty("Bihar", "Not found");
        System.out.println("The capital of Bihar is "+str+".");
        
    }
    
}
