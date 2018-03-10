/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;
import java.lang.*;


class newthread2 implements Runnable 
{
        String name;
        Thread t;
        newthread2(String Threadname)
        {
            name=Threadname;
            t=new Thread(this,name);
            System.out.println("New thread: "+ t);
            t.start();
        }
        public void run(){
            try{
                for (int i=5;i>0;i--)
                  {
                           System.out.println(name+ " : "+i);
                           Thread.sleep(1000);
                       }
                   } catch(InterruptedException e){
                       System.out.println(name+"Interrupted");
                   }
                   System.out.println(name+"exiting");
               }
 }
public class multipleThreads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        newthread2 ob1=new newthread2("ONE");
        newthread2 ob2=new newthread2("TWO");
        System.out.println("Thread one is alive : "+ ob1.t.isAlive());
        System.out.println("Thread two is alive: " + ob2.t.isAlive());
       try{
            System.out.println("waiting for threads to finish");
              ob1.t.join();
              ob2.t.join();
          }catch(InterruptedException e){
             System.out.println("MAin thread Interrupted");
         }
       System.out.println("Thread one is alive : "+ ob1.t.isAlive());
        System.out.println("Thread two is alive: " + ob2.t.isAlive());
         System.out.println("Main thread Exiting ");
    }
}
