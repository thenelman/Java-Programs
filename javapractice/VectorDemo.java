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
public class VectorDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vector<Integer> v = new Vector(3,2);
        System.out.println("Initial size: "+ v.size());
        System.out.println("Initial capacity: "+v.capacity());
        
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);
        
        System.out.println("Capacity after four additions : "+v.capacity());
        
        v.addElement(5);
        System.out.println("Current capacity: "+ v.capacity());
        
        v.addElement(6);
        v.addElement(7);
        System.out.println("Current capacity: "+ v.capacity());
        
        v.addElement(9);
        v.addElement(10);
        System.out.println("Current capacity: "+ v.capacity());
        
        v.addElement(11);
        v.addElement(12);
        
        System.out.println("First Element : "+v.firstElement());
        System.out.println("Last element : "+v.lastElement());
        
        if(v.contains(3))
            System.out.println("Vector v contains 3");
        
        /*Enumeration<Integer> en = v.elements();
        while(en.hasMoreElements())
            System.out.print(en.nextElement()+" ");
        System.out.println();*/
        /*Iterator<Integer> itr = v.iterator();
        while(itr.hasNext())
            System.out.print(itr.next()+" ");
        System.out.println();*/
        for(int i: v)
            System.out.print(i+" ");
    }
    
}
