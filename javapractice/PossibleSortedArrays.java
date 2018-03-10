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
public class PossibleSortedArrays {

    /**
     * @param args the command line arguments
     */
   /* static void print(ArrayList<Integer> al){
        Iterator<Integer> itr = al.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();
    }*/
    static void find(int[] A,int[] B,ArrayList<Integer> subArray,int startA,int startB){
        //base case
        if(startA == A.length-1)
        {
            if(startB==B.length)
                return;
            if(startB==B.length-1)
            {
                if(A[startA]>B[startB])
                    return;
                else
                {
                    subArray.add(A[startA]);
                    subArray.add(B[startB]);
                    System.out.println(subArray);
                    subArray.clear();
                }
            }
        }
        
        for(int i = startA;i<A.length;i++){
            int j = startB;
            while(j < B.length){
                if(A[i]<B[j]){
                    subArray.add(A[i]);
                    subArray.add(B[j]);
                    System.out.println(subArray);
                    //System.out.println("Debug: "+ subArray);
                    if(i == A.length-1)
                        break;
                    for(int k = i+1;k<A.length;k++){
                        if(B[j] < A[k]){
                            //System.out.println("Debug: "+ subArray);
                            find(A,B,subArray,k,j);
                            
                        }
                        
                    }
                    
                }
                
                j++;
                //if(!subArray.isEmpty())
                       // subArray.clear();
            }
            if(!subArray.isEmpty())
                        subArray.clear();
            
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> subList = new ArrayList();
        int[] A = new int[]{10,15,25};
        int[] B = new int[]{1,5,20,30};
        
        find(A,B,subList,0,0);
    }
    
}
