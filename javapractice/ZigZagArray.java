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
public class ZigZagArray {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Integer> zigZag(ArrayList<Integer> arr){
        int temp;
        for(int i=0;i<arr.size()-1;i++){
            if(i%2==0){
                if(arr.get(i) > arr.get(i+1)){
                    Collections.swap(arr, i, i+1);
                }
            }
            else{
                if(arr.get(i)<arr.get(i+1)){
                    Collections.swap(arr, i, i+1);
                }
            }
        }
        
        return arr;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> array = new ArrayList(n);
        for(int i = 0;i<n;i++)
            array.add(i,scan.nextInt());
        scan.close();
        array = zigZag(array);
        for(int i = 0;i<n;i++)
            System.out.print(array.get(i)+" ");
    }
    
}
