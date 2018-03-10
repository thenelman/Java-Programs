/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author L NelSoN ManGanGchA
 */
import java.io.*;
public class trim {
    public static void main(String args[])
    throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String str;
        
       System.out.println("Enter 'stop' to quit");
       System.out.println("Enter state :");
       do{
           str=br.readLine();
           str=str.trim();
           if (str.equals("manipur"))
               System.out.println(" Capital is Imphal");
           if (str.equals("Assam"))
               System.out.println("Capital is Dispur");
           
       }while (!str.equals("stop"));
    }
}
