/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

import java.util.Scanner;

/**
 *
 * @author L NelSoN ManGanGchA
 */
public class PrintPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        print(n);
    }
    
    static void print(int n)
    {
        for(int i = 0;i<n;i++){
            for(int j=0;j<n+i;j++){
                if(j<n-1-i)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
