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
public class SpliteratorExample {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Double> vals = new ArrayList<>();
        for(double i = 1.0;i<6.0;i++)
            vals.add(i);
        System.out.println("Contents of the arrayList : "+ vals);
        Spliterator<Double> itr = vals.spliterator();
        while(itr.tryAdvance((n)-> System.out.print(n + " ")));
        System.out.println();
        
        ArrayList<Double> sqrs = new ArrayList();
        itr = vals.spliterator();
        while(itr.tryAdvance((n)->sqrs.add(Math.sqrt(n))));
        itr = sqrs.spliterator();
        //Spliterator.OfDouble itr2 = (Spliterator.OfDouble) vals.spliterator();
        itr.forEachRemaining((n)-> System.out.print(n+" "));
        
    }
    
}
