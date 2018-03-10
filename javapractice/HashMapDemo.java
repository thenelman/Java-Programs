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
public class HashMapDemo {

    /**
     * @param args the command line arguments
     */
    static class CmpLast implements Comparator<String>{
        @Override
        public int compare(String str1, String str2){
            int i,j,k;
            i = str1.lastIndexOf(' ');
            j = str2.lastIndexOf(' ');
            
            k = str1.substring(i).compareToIgnoreCase(str2.substring(j));
            //if(k==0)
              //  return str1.compareToIgnoreCase(str2);
            //else
                return k;
        }
    }
    static class CmpThenByFirst implements Comparator<String>{
        @Override
        public int compare(String str1, String str2){
            return str1.compareToIgnoreCase(str2);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        TreeMap<String,Double> hm = new TreeMap(new CmpLast().thenComparing((str1,str2)-> str1.compareToIgnoreCase(str2)));
        hm.put("John Doe",6565.20);
        hm.put("Nelson Mangangcha",2502.58);
        hm.put("John Sparrow",10565.20);
        hm.put("Monet Sparrow",5565.85);
        
        Set<Map.Entry<String, Double>> st= hm.entrySet();
        for(Map.Entry<String, Double> emp : st)
        {
            System.out.println(emp.getKey()+":"+emp.getValue());
        }
        
        System.out.println();
        
        double balance = hm.get("Nelson Mangangcha");
        double old = hm.put("Nelson Mangangcha", (balance+10000) );
        System.out.println("Nelson Mangangcha's old balance: "+old);
        System.out.println("Nelson Mangangcha's new balance: "+hm.get("Nelson Mangangcha"));
    }
    
}
