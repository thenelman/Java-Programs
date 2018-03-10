/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;
import java.lang.*;
class callme {
     void call(String msg){
    System.out.print("["+msg);
    try {
    Thread.sleep(1000);
        }catch (InterruptedException e)
        {
    System.out.println("Interrupted");
        }
    System.out.println("]");
    }
}
class caller implements Runnable{
    String msg;
    callme target;
    Thread t;
    public caller(callme targ,String s){
       target=targ;
       msg=s;
       t=new Thread(this);
       t.start();
    }
    public void run(){
        synchronized(target){
        target.call(msg);
    }
    }
}
/**
 *
 * @author L NelSoN ManGanGchA
 */
public class Synchronization {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        callme target= new callme();
        caller ob1 = new caller(target,"hello");
        caller ob2= new caller(target, "apple");
        try{
            ob1.t.join();
            ob2.t.join();
        }catch(InterruptedException e)
        {
            System.out.println("INterrupted");
    }
    
}
}
