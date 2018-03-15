/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomHashMap;
import java.util.*;
/**
 *
 * @author L NelSoN ManGanGchA
 */
class HashMap{
    private int size;
    private int capacity;
    private double fillRatio=0.75;
    Set<Integer> keySet = new HashSet();
    MapEntry[] entries;
    
    class MapEntry{
        
        private Integer key;
        private Integer value;
        //private int hash = hashCode();
        MapEntry(Integer K,Integer V){
            this.key = K;
            this.value = V;
        }
        
        
        public Integer getValue(){
            return value;
        }
        
        public Integer setValue(Integer V){
            Integer oldValue = getValue();
            if(oldValue != null)
                this.value = V;
            return oldValue;
        }

        //@Override
        public Integer getKey() {
            return this.key;
        }
        
        MapEntry next=null;
        
        
        
    }
    
    HashMap(){
        capacity = 16;
        entries = new MapEntry[capacity];
        size = 0;
    }
    
    
    private void rehash(){
            
       int newCapacity = 2*capacity;
       if((double)size/capacity < 0.2)
                newCapacity = capacity/2;
       
       MapEntry[] newEntries = new MapEntry[newCapacity];
           Iterator itr = keySet.iterator();
            while(itr.hasNext())
            {
                Integer key = (Integer) itr.next();
                int index = hashCode(key) & (capacity-1);
                int newIndex = hashCode(key) & (newCapacity-1);
                if(newEntries[newIndex]!= null){
                    MapEntry entry = newEntries[newIndex];
                    while(entry.next!=null)
                        entry = entry.next;
                    entry.next= new MapEntry(key,entry.getValue());
                }
                else
                    newEntries[newIndex]= new MapEntry(key,get(key));
            }
            entries = Arrays.copyOf(newEntries, newCapacity);
            capacity = newCapacity;
           
    }
    public int size() {
        return size;
    }

    
    public boolean isEmpty() {
        return size==0;
    }
    public int hashCode(Integer key){
            return key.intValue()%capacity;
        }

    public boolean containsKey(Integer key) {
        int hashCode = hashCode(key);
        int index = hashCode & (capacity-1);
        MapEntry entry = entries[index];
        if(entry != null)
        {
            if(entry.getKey() == key)
                return true;
            else
            {
                while(entry.next!=null)
                {
                    entry = entry.next;
                    if(entry.getKey()==key)
                        return true;
                }
            }
        }
        return false;
    }

    
    //public boolean containsValue(Integer value) {
        
    //}

    
    public Integer get(Integer key) {
        int index = hashCode(key) & (capacity-1);
        
        
            MapEntry entry = entries[index];
            if(entry != null)
                
            {
                if(entry.getKey()== key)
                    return entry.getValue();
                else
                {
                    while(entry.next!=null)
                    {
                        entry = entry.next;
                        if(entry.getKey()== key)
                        {
                            return entry.getValue();
                        }
                    }
                }
            }
            
            return null;
            
                        
    }

    public Integer put(Integer key, Integer value) {
        int index = hashCode(key) & (capacity-1);
        keySet.add(key);
        MapEntry entry = entries[index],newEntry = new MapEntry(key,value);
        if(entry == null)
        {
            entries[index] = newEntry;
            size++;
            if((double)size/capacity > fillRatio)
                rehash();
            return value;
        }
        while(entry.next!=null){
            entry = entry.next;
            if(entry.getKey()==key)
                break;
                
        }
        
        
        if(entry.getKey()== key)
            return entry.setValue(value);
        size++;
        if((double)size/capacity > fillRatio)
                rehash();
        entry.next = newEntry;
        
        return value;
    }

    
    public Integer remove(Integer key) {
        int hashCode = hashCode(key);
        int index = hashCode & (capacity-1);
        MapEntry entry = entries[index];
        MapEntry prev = null;
        if(entry!= null)
        {
            if(entry.getKey() == key)
            {
                Integer val = entry.getValue();
                entries[index]=entry.next;
                size--;
                if((double)size/capacity < 0.2)
                    rehash();
                return val;
            }
            else
            {
                while(entry.next!=null)
                {
                    prev = entry;
                    entry = entry.next;
                    if(entry.getKey()==key)
                    {
                        Integer val = entry.getValue();
                        prev.next =entry.next;
                        size--;
                        if((double)size/capacity < 0.2)
                            rehash();
                        return val;
                    }
                }
            }
        }
        return null;       
        
    }

    /*@Override
    public void putAll(Map<? extends Integer, ? extends Integer> m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Set<Integer> keySet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<Integer> values() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Set<Entry<Integer, Integer>> entrySet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    */
}
public class CustomHashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap map = new HashMap();
        map.put(1,2);
        map.put(5,7);
        map.put(7,9);
        map.put(21,5);
        map.put(37,10);
        
        System.out.println(map.size());
         System.out.println(map.remove(37));
        System.out.println(map.get(97));
        System.out.println(map.get(5));
    }
    
}
