/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;
import java.io.*;
import java.util.*;
/**
 *
 * @author L NelSoN ManGanGchA
 */
public class PhoneBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Properties ht = new Properties();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name, number;
        FileInputStream fin = null;
        boolean changed = false;
        try{
            fin = new FileInputStream("phonebook.dat");
        }catch(FileNotFoundException e){
            //ignore
        }
        //if phonebook exist, load existing numbers
        try{
            if(fin!=null){
                 ht.load(fin);
                 fin.close();
            }
            
        }catch(IOException e){
            System.out.println("Error reading file");
        }
        
        do{
            System.out.println("Enter new name ('quit' to stop): ");
            name = br.readLine();
            if(name.equals("quit"))
                continue;
            
            System.out.println("Enter number: ");
            number = br.readLine();
            
            ht.put(name, number);
            changed = true;
        }while(!name.equals("quit"));
        
        //if phonebook has changed save it
        if(changed){
            FileOutputStream fout = new FileOutputStream("phonebook.dat");
            
            ht.store(fout,"Telephone Book");
            fout.close();
        }
        
        //look up a given name
        do{
            System.out.println("Enter name to find ('quit' to stop): ");
            name = br.readLine();
            if(name.equals("quit"))
                continue;
            number = (String) ht.getProperty(name);
            System.out.println(number);
        }while(!name.equals("quit"));
    }
    
}
