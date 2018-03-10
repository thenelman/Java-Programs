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
public class arrayListPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("Initial size of al: "+al.size());
        
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1,"A2");
        
        System.out.println("Size of al after addition: "+ al.size());
        
        System.out.println("Contents of al: "+al);
        
        ListIterator<String> itr = al.listIterator();
        itr.add("Z");
        System.out.println("Contents of al: "+al);
        System.out.println("Size of al after addition: "+ al.size());
        System.out.println(itr.next());
        itr.set("C changed");
        System.out.println(itr.previous());
        System.out.println("Contents of al: "+al);
//al.remove("F");
        //al.remove(2);
        
        //System.out.println("Size of al after deletions: "+al.size());
        //String[] strArray = new String[al.size()];
        //strArray = al.toArray(strArray);
        //System.out.println("Contents of al:"+Arrays.toString(strArray));
        System.out.println("Reverse of tomato: "+ reverse("tomato"));
    }
    static String reverse(String message){
        ArrayDeque<Character> ar = new ArrayDeque();
        String str ="";
        for(int i =0; i<message.length() ;i++)
        {
            ar.push(message.charAt(i));
        }
        while(!ar.isEmpty()){
            str += ar.pop().toString();
        }
        return str;
    }
}
