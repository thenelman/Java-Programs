/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;
import java.lang.*;
import java.util.*;
/**
 *
 * @author L NelSoN ManGanGchA
 */
public class collectionsAlgorithmsDemo {

    /**
     * @param args the command line arguments
     */
    static class MyComp implements Comparator<Integer>{
        @Override
        public int compare(Integer str1, Integer str2){
            return str1.compareTo(str2);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> newList = new ArrayList();
        Integer[] elements = new Integer[]{7,5,8,6,2,9,11};
        Collections.addAll(newList, elements);
        System.out.println(newList);
        Integer val =8;
        System.out.println(val.intValue());
        if(newList.contains(val))
            System.out.println(true);
        Collections.sort(newList, (n1,n2)-> n1.compareTo(n2));
        System.out.println(newList);
        int index = Collections.binarySearch(newList, val,(n1,n2)-> n2.compareTo(n1));
       
        System.out.println("Index of the element "+val.intValue()+" in order: "+ index);
         if(newList.contains(val))
            System.out.println(true);
         
        Deque<Integer> deque = new ArrayDeque();
        Collections.asLifoQueue(deque);
        for(int e : elements){
            deque.push(e);
            
        }
        //System.out.println(deque);
        
        while(!deque.isEmpty()){
            System.out.print(deque.pop()+" ");
        }
        System.out.println();
        ArrayList<Integer> arr2 = new ArrayList();
        Collections.addAll(arr2, 2, 5 , 9 ,8, 5,45,23);
        Collections.copy(arr2,newList);
        System.out.println(newList.size());
        System.out.println(arr2.size());
        
        Collections.sort(arr2, (n1,n2)-> n2.compareTo(n1));
        System.out.println("desc: "+ arr2);
        val =11;
        System.out.println(val.intValue());
        index = Collections.binarySearch(arr2, val,(n1,n2)-> n2.compareTo(n1));
        System.out.println("Index of the element "+val+" in order: "+ index);
    }
    
}
