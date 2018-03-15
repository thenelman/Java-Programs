/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomHashSet;
import java.lang.reflect.Array;
import java.util.*;
/**
 *
 * @author L NelSoN ManGanGchA
 */
class HashSet{
    private HashMap map;
    private static final Object PRESENT = new Object();
    
    HashSet(){
        map = new HashMap();
    }
    
    HashSet(int capacity){
        map = new HashMap(capacity);
    }
    //@Override
    public int size() {
        return map.size();
    }

    //@Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    public boolean contains(Integer o) {
        return map.containsKey(o);
    }

    //@Override
    public Iterator<Integer> iterator() {
        return map.keySet().iterator();
    }

    //@Override
    public Object[] toArray() {
        Object [] elements = new Object[map.size()];
        int i = 0;
        Iterator<Integer> itr = iterator();
        while(itr.hasNext())
            elements[i++]=itr.next();
        return elements;
    }

    //@Override
    public <T> T[] toArray(T[] a) {
        Iterator itr = iterator();
        int index =0;
        while(itr.hasNext() && index < a.length)
        {
            a[index++] = (T)itr.next();
        }
        if(a.length > size())
            a[size()]=null;
        return a;
    }

    //@Override
    public boolean add(Integer e) {
        boolean flag = false;
        if(map.containsKey(e))
            return flag;
        map.put(e, PRESENT);
        return true;
    }

    //@Override
    public boolean remove(Object o) {
        boolean flag = false;
        if(!map.containsKey(o))
            return flag;
        map.remove(o);
        return true;
    }

    //@Override
    public boolean containsAll(Collection<?> c) {
        Iterator itr = c.iterator();
        boolean flag = true;
        while(itr.hasNext()){
            if(!map.containsKey(itr.next()))
                return false;
        }
        return flag;
    }

    //@Override
    public boolean addAll(Collection<? extends Integer> c) {
        Iterator itr = c.iterator();
        while(itr.hasNext()){
            add((Integer)itr.next());
        }
        return true;
    }

    //@Override
    public boolean retainAll(Collection<?> c) {
        Iterator itr = iterator();
        boolean flag = false,flag2;
        while(itr.hasNext()){
            Object curr = itr.next();
            if(!c.contains(curr))
            {
                flag2 = remove(curr);
                flag = flag|flag2;
            }
             
        }
        
        return flag;
        
    }

    //@Override
    public boolean removeAll(Collection<?> c) {
        Iterator itr = c.iterator();
        boolean flag = false;
        while(itr.hasNext()){
            Object item = itr.next();
            if(map.containsKey(item))
                flag = flag|remove(item);
        }
        return flag;
    }

    //@Override
    public void clear() {
        map.clear();
    }
    
    @Override
    public String toString(){
        String str = "";
        Iterator itr= iterator();
        while(itr.hasNext())
            str+=(itr.next()+" ");
        return str;
    }
    
}
public class CustomHashSet{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashSet naya = new HashSet();
        naya.add(1);
        naya.add(50);
        naya.add(30);
        naya.add(15);
        naya.add(8);
        
        System.out.println(naya.size());
    }
    
}
