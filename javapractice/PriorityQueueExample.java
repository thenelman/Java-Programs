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
public class PriorityQueueExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Zebra");
        ts.add("Zico");
        ts.add("Banana");
        ts.add("Coco");
        ts.add("Babloo");
        PriorityQueue<String> pq = new PriorityQueue<>(ts);
        
        String first = pq.peek();
        System.out.println("First priority: "+ first);
        if(pq.contains("Zebra"))
            System.out.println("Priority Queue contains Zebra");
        pq.add("pineapple");
        pq.add("Apple");
        
        String firstAgain = pq.peek();
        System.out.println("First priority: "+ firstAgain);
        Iterator<String> itr = pq.iterator();
        //while(itr.hasNext())
            //System.out.println(itr.next());
        ArrayList<String> ar = new ArrayList();
        itr.forEachRemaining((str)-> ar.add(str));
        
        Iterator<String> arrayItr = ar.iterator();
        arrayItr.forEachRemaining((str)-> System.out.print(str+" "));
        
    }
    
}
