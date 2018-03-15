/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomArrayDeque;
import java.util.*;
/**
 *
 * @author L NelSoN ManGanGchA
 */


class ArrayDeque{
    private Integer[] elementData;
    private int capacity = 16;
    private int lastIndex;
    
    ArrayDeque(){
        elementData = new Integer[16];
        lastIndex = -1; 
    }
    
    void ensureCapacity(int minCapacity){
        int newCapacity;
        if(minCapacity > capacity){
            newCapacity = (size()*3)/2+1;
            
            if(newCapacity < minCapacity)
               newCapacity = minCapacity;
            
            elementData = Arrays.copyOf(elementData, newCapacity);
            capacity = newCapacity;
        }
    }
    
    public int size(){
        return this.lastIndex+1;
    }
    public boolean isEmpty(){
        return (lastIndex == -1);
    }
    public boolean addFirst(Integer e){
        ensureCapacity(size()+1);
        boolean flag = false;
        System.arraycopy(elementData, 0, elementData, 1, size());
        elementData[0] = e;
        lastIndex++;
        flag = true;
        return flag;
    }
    
    public boolean addLast(Integer e){
        ensureCapacity(size()+1);
        boolean flag = false;
        elementData[++lastIndex]=e;
        flag = true;
        return flag;
    }
    
    public boolean add(Integer e){
        return addLast(e);
    }
    
    public void push(Integer e){
        ensureCapacity(size()+1);
        addFirst(e);
    }
    
    public Integer pop(){
        Integer e = elementData[0];
        System.arraycopy(elementData, 1, elementData, 0, size()-1);
        lastIndex--;
        return e;
    }
    
    public Integer peekFirst(){
        return elementData[0];
    }
    
    public Integer peekLast(){
        return elementData[lastIndex];
    }
    
    public Integer remove(Integer e){
        int i;
        Integer val = null;
        for(i = 0;i<size();i++)
        {
            if(Objects.equals(elementData[i], e)){
              val = elementData[i];
              break;
            }
                
        }
        System.arraycopy(elementData, i+1, elementData, i, size() - i);
        lastIndex--;
        return val;
    }
    
    public Integer removeLast(){
        Integer val = remove(elementData[lastIndex]);
        return val;
    }
    
    public Integer removeFirst(){
        Integer val = remove(elementData[0]);
        return val;
    }
    
    class ArrayDequeIterator implements Iterator<Integer>{
        int currIndex = -1;
        int nextIndex;
        ArrayDequeIterator(){
            nextIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return (nextIndex!=size());
        }

        @Override
        public Integer next() {
            currIndex = nextIndex;
            nextIndex++;
            return elementData[currIndex];
        }
    }
    
    public ArrayDequeIterator iterator(){
        return new ArrayDequeIterator();
    }
    
    @Override
    public String toString(){
        String str ="Array :";
        ArrayDequeIterator itr = iterator();
        while(itr.hasNext())
            str+=(itr.next()+" ");
        
        return str;
    }
    
    
}
public class customArrayDeque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayDeque ad = new ArrayDeque();
        System.out.println(ad.size());
        ad.add(1);
        System.out.println(ad.size());
        ad.add(2);
        System.out.println(ad.size());
        ad.add(3);
        System.out.println(ad.size());
        ad.add(4);
        System.out.println(ad.size());
        ad.add(5);
        System.out.println(ad.size());
        ad.add(6);
        System.out.println(ad.size());
        System.out.println(ad);
        System.out.println(ad.pop());
        ad.push(25);
        System.out.println(ad.size());
        System.out.println(ad);
    }
    
}
