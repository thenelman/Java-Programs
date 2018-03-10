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
public class ArrayDemo {

    /**
     * @param args the command line arguments
     */
    static void display(int[] arr){
        for(int i:arr)
            System.out.print(i+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = new int[10];
        for(int i =0;i<10;i++)
            array[i]=-3*i;
        //Displa,sort and display the array
        System.out.println("Original array contents: ");
        display(array);
        Arrays.sort(array);
        System.out.print("Sorted: ");
        display(array);
        
        Arrays.fill(array,2,6,-1);
        System.out.print("After fill: ");
        display(array);
        Arrays.sort(array);
        System.out.print("After sorting again: ");
        display(array);
        
        System.out.print("The value of -9 is located at ");
        int index = Arrays.binarySearch(array,-9);
        System.out.println(index);
        
    }
    
}
