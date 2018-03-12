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
public class pythgoreanTriplets {

    /**
     * @param args the command line arguments
     */
    /*static boolean find(ArrayList<Integer> list,int start,int end,int value){
        if(start == end)
        {
            if(list.get(start)==value)
                return true;
        }
        for(int i = start;i<=end;i++){
            if(list.get(i) == value)
                return true;
        }
        return false;
    }*/
    static boolean checkPyTriplets(ArrayList<Integer> list,int size){
        for(int i = size-1;i>1;i--){
            int sum = list.get(i);
            int l = 0;
            int r = i-1;
            while(l<r){
                if (sum == list.get(l)+list.get(r))
                    return true;
                if(list.get(l)+list.get(r)>sum)
                    r--;
                else
                    l++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> A = new ArrayList();
        System.out.println("Enter the array of size "+n+"\n");
        for(int i =0;i<n;i++){
            Integer num = scan.nextInt();
            A.add(num);
        }
        Collections.sort(A);
        A.replaceAll(a-> a*a);
        boolean flag = checkPyTriplets(A,n);
        System.out.println(flag);
    }
    
}
