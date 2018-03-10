/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;
import java.lang.*;

/**
 *
 * @author L NelSoN ManGanGchA
 */

class Newthread implements Runnable{
    String name;
    Thread t;
    boolean suspendflag;
    
    Newthread(String threadname){
        name=threadname;
        t=new Thread(this,name);
        System.out.println("New Thread :"+ t);
        suspendflag=false;
        t.start();
    }
    
    public void run(){
        try{
            for(int i=0; i<15; i++){
                System.out.println(name+":"+ i);
                Thread.sleep(200);
                synchronized(this){
                    while(suspendflag){
                        wait();
                    }
                }
            }
        }catch(InterruptedException e){
            System.out.println(name+"Interrupted");
        }
        System.out.println(name+ "Exiting");
    }
    synchronized void mysuspend()
    {
        suspendflag=true;
    }
    synchronized void myresume(){
        suspendflag=false;
        notify();
    }
}
public class Suspendresume {
    public static void main(String args[]){
        Newthread ob1=new Newthread("One");
        Newthread ob2=new Newthread("two");
        try{
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("Suspeding Thread one");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("resuming thread one ");
            ob2.mysuspend();
            System.out.println("Suspending Thread two");
            Thread.sleep(1000);
            ob2.myresume();
            System.out.println("resuming Thread two");
        } catch(InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        
        try{
            System.out.println("Waiting for thread to finish");
            ob1.t.join();
            ob2.t.join();
        } catch(InterruptedException e){
            System.out.println("Main thread Interrupted");
        }
        System.out.println("main thread exiting");
    }
    
}
