/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;
import java.lang.*;

class newthread extends Thread
{
   newthread(){
       super("baby Thread");
       System.out.println("child thread: "+ this);
       start();
   }
   public void run()
   {
       try {
           for(int i=5;i>0;i--)
           {
               System.out.println("Child Thread: "+i);
               Thread.sleep(500);
           }
       }catch (InterruptedException e)
                   {
                   System.out.println("Child Thread Interrupted");
                   }
    System.out.println("Child thread Exiting");
    }
}

public class extendingthread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    new newthread();
    try {
        for(int i=5;i>0;i--)
        {
            System.out.println("Main thread: " + i);
            Thread.sleep(1000);
        }
    }catch (InterruptedException e){
        System.out.println("Main Thread Interrupted");
    }
    System.out.println("Main thread exiting");
    }
    
}
