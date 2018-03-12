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
public class LargestContiguousSubArrayLength {

    /**
     * @param args the command line arguments
     */
    static int findLength(ArrayList<Integer> list,int n){
        
        int maxLength=1;
        for(int i =0;i<n-1;i++){
            HashSet<Integer> set = new HashSet();
            set.add(list.get(i));
            int mn = list.get(i),mx=list.get(i);
            
            for(int j=i+1;j<n;j++){
                
                int num = list.get(j);
                if(set.contains(num))
                    break;
                set.add(num);
                mn = Math.min(mn, num);
                mx = Math.max(mx, num);
                
                if((mx-mn) == j-i)
                    maxLength = Math.max(maxLength, mx-mn+1);
                
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> A = new ArrayList();
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        System.out.println("Enter the list of numbers: ");
        for(int i=0;i<n;i++){
            Integer num = scan.nextInt();
            A.add(num);
        }
        
       int length = findLength(A,n);
        
        System.out.println("Length of largest contiguous subarray is "+length);
    }
    
}
