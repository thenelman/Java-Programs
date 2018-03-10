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
public class TreeSetExample {

    /**
     * @param args the command line arguments
     */
    /*static class MyComp implements Comparator<String>{
        @Override
        public int compare(String str1, String str2){
            return str2.compareTo(str1);
        }
    }*/
    public static void main(String[] args) {
        // TODO code application logic here
        //Comparator<String> mc = (str1,str2)-> str1.compareTo(str2);
        TreeSet<String> ts = new TreeSet<>((str1,str2)-> str2.compareTo(str1));
        ts.add("Zebra");
        ts.add("Zico");
        ts.add("Banana");
        ts.add("Coco");
        ts.add("Babloo");
        
        System.out.println(ts);
        //String ceil = ts.higher("C");
       // System.out.println(ceil);
        //Iterator<String> itr = ts.descendingIterator();
        //while(itr.hasNext())
            //System.out.println(itr.next());
        
       // NavigableSet<String> ns = ts.subSet("Banana",false,"Zico",false);
        
        
        /*if(first.equals(lastReverse))
            System.out.println(lastReverse);
        if(last.equals(firstReverse))
            System.out.println(last);*/
        //System.out.println(ns);
       // System.out.println(ts);
    }
    
}
