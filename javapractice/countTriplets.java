/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;
import java.util.*;
import java.lang.*;
import java.math.BigInteger;

/**
 *
 * @author L NelSoN ManGanGchA
 */

public class countTriplets {
    
    /**
     * @param args the command line arguments
     */
    /*static class BigIntCmp implements Comparator<BigInteger>{

        @Override
        public int compare(BigInteger o1, BigInteger o2) {
            //To change body of generated methods, choose Tools | Templates.
            return o1.compareTo(o2);
        }
    }*/
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int count = 0;
        Integer max  = scan.nextInt();
        int capacity = scan.nextInt();
        System.out.println(capacity+" capacity.");
        //scan.nextLine();
        LinkedList<Integer> input =new LinkedList();
        for(int i = 0 ; i < capacity ; i++){
          Integer value = scan.nextInt();
          //System.out.println(i);
          input.add(value);
        }
        
        //input.add(5);
        //input.add(7);
        //input.add(3);
        //input.add(4);
        //input.add(1);
        scan.close();
        Collections.sort(input);
        
        for(int i =0; i<input.size()-2;i++)
        {
            int j=i+1;
            int k = input.size()-1;
            
            while(j<k)
            {
                Integer sum = input.get(i)+input.get(j)+input.get(k);
                if(sum < max){
                 count += (k-j);
                    j++;
                }
                else
                    k--;   
                }
        }
        System.out.println("Count of triplets less than " + max + " is: "+count);
        
    }
}
