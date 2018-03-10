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
class Q{
    int n;
    boolean valueSet= false;
    synchronized  int get(){
        while(!valueSet)
            try{
                wait();
            }catch (InterruptedException e)
            {
                System.out.println("Interrupted exception caught");
            }
        System.out.println("got :"+n);
        valueSet=false;
        notify();
        return n;
    }
    synchronized void put(int n){
        while(valueSet)
        try{ 
            wait();
        } catch (InterruptedException e)
        {
            System.out.println("INterrupted exception caught");
        }
        this.n=n;
        valueSet =true;
        System.out.println("Put : "+ n);
        notify();
        
    }
}
class Producer implements Runnable{
    Q q;
    Producer(Q q){
        this.q=q;
        new Thread(this,"producer").start();
    }
    public void run(){
        int i=0;
        while(true){
            q.put(i++);
        }
    }
}
class consumer implements Runnable{
    Q q;
    consumer(Q q){
        this.q=q;
        new Thread(this,"Consumer").start();
    }
    public void run(){
        while (true){
            q.get();
        }
    }
}
public class interthread {
    public static void main(String[] args){
    Q q= new Q();
    new Producer(q);
    new consumer(q);
    
    System.out.println("Press Control-C to stop.");
    }
}
