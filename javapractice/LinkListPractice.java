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
public class LinkListPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<String> ll = new LinkedList<>();
        ll.add("A");
        ll.add("S");
        ll.add("D");
        ll.add("E");
        ll.add("F");
        
        ll.addLast("Z");
        ll.addFirst("AP");
        
        ll.add(2,"B");
        
        System.out.println("Original contents of ll: "+ll);
        String str = ll.get(2);
        System.out.println("String at index 2: "+str);
        
        ll.remove("F");
        ll.remove(4);
        
        System.out.println("Contents of ll after deletion: "+ll);
        
        ll.removeFirst();
        ll.removeLast();
        
        System.out.println("Contents of ll after removing first and last element: "+ll);
        
        String oldStr = ll.set(2, str + "Changed");
        
        System.out.println("Contents of old str: "+oldStr);
        System.out.println("Contents of ll : "+ll);
    }
    
}
