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
class A{
    synchronized void foo(B b){
        String name=Thread.currentThread().getName();
        System.out.println(name+ "entered A.foo");
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("A interrupted");
        }
        System.out.println( name+ "Trying to call B.last()");
        b.last();
    }
    synchronized void last(){
        System.out.println("Inside A.last");
    }
}
class B{
    synchronized void bar(A a){
        String name= Thread.currentThread().getName();
        System.out.println(name+ "Entered B.bar()");
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e)
        {
            System.out.println("B interrupted");
        }
        System.out.println(name +"trying to call a.last()");
        a.last();
    }
     synchronized void last(){
         System.out.println("Inside A.last");
     }
    
}
class deadlock implements Runnable {
    A a=new A();
    B b=new B();
     deadlock(){
         Thread.currentThread().setName("main thread");
         Thread t=new Thread(this,"racing thread");
         t.start();
         a.foo(b);
         System.out.println("back in main thread");
     }
     public void run(){
         b.bar(a);
         System.out.println("Back in other thread");
     }
     public static void main(String[] args){
      new deadlock();   
     }
    
}
