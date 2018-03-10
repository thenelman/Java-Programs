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
public class RotateAndDelete {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Integer> rotateClockwise(ArrayList<Integer> L,int d,int n){
        ArrayList<Integer> temp = new ArrayList<>(d);
        int k = n-d;
        for(int i =0; i< d; i ++){
            temp.add(i,L.get(k++));
        }
        
        for(int i = n-d-1 ; i >= 0; i--)
        {
            L.set(i+d, L.get(i));
        }
        
        
        for(int i = 0 ; i < d; i ++)
            L.set(i, temp.get(i));
        
        return L;
    }
    static void show(ArrayList<Integer> L){
        L.stream().forEach((i) -> {
            System.out.print(i+" ");
        });
        System.out.println();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //int d = scan.nextInt();
        ArrayList<Integer> M = new ArrayList<>();
        
        for(int i = 0 ;i < n;i++)
        {
            Integer num= scan.nextInt();
            M.add(num);
        }
        //M.set(d,M.get(n-1));
        //System.out.println(M.get(d)+" "+ M.get(n-1));
        int d = 1,k = 1;
        while(M.size()>1){
            //System.out.println("After rotation: ");
            M = rotateClockwise(M,d,n);
            //show(M);
            if(k<n)
                M.remove(n-k);
            else
                M.remove(0);
            //show(M);
            n= M.size();
            k++;
        }
        System.out.println(M.get(0));
    }
    
    
    
}
