/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;
import java.io.*;
import java.util.*;
import java.lang.*;
/**
 *
 * @author L NelSoN ManGanGchA
 */
public class ReverseStringWithoutSpecialCharacter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String message = "the_nel_man@red_eye";
        StringBuilder str = new StringBuilder(message);
        //ArrayList<String> array = new ArrayList();
        ArrayList<Integer> index = new ArrayList();
        ArrayDeque<Character> stack = new ArrayDeque();
        
        for(int i = 0;i<message.length();i++)
        {
            
            if(Character.isAlphabetic(message.charAt(i))){
                stack.push(message.charAt(i));
                index.add(i);
            }
        }
        int ind =0;
        while(!stack.isEmpty()){
            int i = index.remove(ind);
            str.setCharAt(i,stack.pop());
        }
        
        System.out.println(str.toString());
    }
    
}
