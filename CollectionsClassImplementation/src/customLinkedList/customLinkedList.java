/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customLinkedList;
import java.util.*;
import java.util.Iterator;
/**
 *
 * @author L NelSoN ManGanGchA
 */
class Node{
        Integer data;
        Node next;
        Node previous;
        Node(Integer e){
            this.data = e;
            next = null;
            previous = null;
        }
        
    }

class LinkedList {
    private Node head,tail;
    private int size;
    LinkedList(){
        this.head = null;
        this.tail = null;
        this.size =0;
    }
    public int size(){
        return this.size;
    }
    
    public boolean isEmpty(){
        return (head==null?true:false);
    }
    
    
    
    public boolean addFirst(Integer e){
        Node container = new Node(e);
        boolean flag = false;
        if(head==null)
        {
            head = container;
            tail = container;
            size++;
            flag = true;
            return flag;
        }
        
        container.next=head;
        head.previous = container;
        head = container;
        size++;
        flag = true;
        return flag;
        
    }
    private void createNewList(Integer e){
        Node container = new Node(e);
        head = container;
        tail = container;
        size++;
    }
    
    public boolean addLast(Integer e){
        Node container = new Node(e);
        boolean flag = false;
        
        if(isEmpty()){
            createNewList(e);
            flag = true;
            return flag;
        }
        
        tail.next = container;
        container.previous = tail;
        tail = container;
        size++;
        flag = true;
        return flag;
    }
    
    public boolean add(Integer e){
        return addLast(e);
    }
    
    private void checkIndexRange(int ind){
        if(ind < 0 || ind >=size)
            throw new IndexOutOfBoundsException(outOfBoundsMsg(ind));
    }
    private String outOfBoundsMsg(int index) {
            return "Index: "+index+", Size: "+this.size;
        }
    
    class LinkedListIterator implements Iterator<Node>{
        private Node nextNode;
        private Node currNode = null;
        
        LinkedListIterator(){
            nextNode = head;
        }

        @Override
        public boolean hasNext() {
            return nextNode != null;
        }

        @Override
        public Node next() {
            currNode = nextNode;
            nextNode = nextNode.next;
            return currNode;
        }  
    }
    public LinkedListIterator iterator(){
        return new LinkedListIterator();
    }
    public boolean add(int index, Integer e){
        checkIndexRange(index);
        boolean flag = false;
        int count = 0;
        if(index == 0)
            return addFirst(e);
        else if(index == size)
            return addLast(e);
        Node temp =  new Node(e);
        Node curr = null;
        LinkedListIterator itr = iterator();
        while(count < index && itr.hasNext()) //middle index
        {
            curr = itr.next();
            count++;
        }
        
        temp.next = curr.next;
        curr.next.previous = temp;
        curr.next = temp;
        temp.previous = curr;
        flag = true;
        size++;
        return flag;     
    }
    public boolean contains(Integer e){
        if(isEmpty())
            return false;
        LinkedListIterator itr = iterator();
        while(itr.hasNext()){
            if(itr.next().data.equals(e))
                return true;
        }
        return false;
    }
    
    public int IndexOf(Integer e){
        int index = 0;
        if(contains(e)){
        LinkedListIterator itr = iterator();
        while(itr.hasNext()){
            if(itr.next().data.equals(e))
                return index;
            index++;
            }
        }
        
        return -1;
    }
    
    public String toString(){
        String str="List: ";
        LinkedListIterator itr = iterator();
        while(itr.hasNext())
            str += (itr.next().data+" ");
        return str;
    }
}
public class customLinkedList {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList list = new LinkedList();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for(int i =0;i<n;i++)
            list.add(scan.nextInt());
        
        System.out.println(list);
        int index = scan.nextInt();
        int  value = scan.nextInt();
        list.add(index,value);
        System.out.println(list+" size:"+list.size());
        System.out.println(list.IndexOf(3));
        scan.close();
    }
    
}
