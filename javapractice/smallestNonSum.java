/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;
import java.util.*;
import java.lang.*;
/**
 *
 * @author L NelSoN ManGanGchA
 */
public class smallestNonSum {

    /**
     * @param args the command line arguments
     */
    static int smallestNonSumInteger(ArrayList<Integer> list,int n){
        int min = 1;
        for(int i =0;i< n && list.get(i)<=min;i++){
            min+=list.get(i);
        }
        return min;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> A = new ArrayList();
        for(int i =0;i<n;i++){
            Integer val = scan.nextInt();
            A.add(val);
        }
        int smallest = smallestNonSumInteger(A,n);
        System.out.println(smallest);
    }
    
}
