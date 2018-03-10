/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;
import java.lang.*;
import java.util.*;

/**
 *
 * @author L NelSoN ManGanGchA
 */
  class newThread implements Runnable {
        Thread t;
        newThread(){
            t=new Thread(this,"demo thread");
            System.out.println("Child thread: "+ t);
            t.start();
        }
               public void run(){
                   try{
                       for (int i=5;i>0;i--)
                       {
                           System.out.println("Child thread: "+i);
                           Thread.sleep(500);
                       }
                   } catch(InterruptedException e){
                       System.out.println("Child Interrupted");
                   }
                   System.out.println("CHild exiting");
               }
    }
public class Multithreading {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        new newThread();
        try {
            for(int i=5;i>0;i--)
            {
                System.out.println("Main Thread : "+ i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e){
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Main Thread exiting");
    }
    
}
