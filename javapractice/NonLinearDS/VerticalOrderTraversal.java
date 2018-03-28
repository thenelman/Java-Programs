/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice.NonLinearDS;
import java.util.*;
/**
 *
 * @author L NelSoN ManGanGchA
 */
public class VerticalOrderTraversal {
    public void VerticalOrderTraversal(BinaryTreeNode root){
        if(root == null)
            return;
        TreeMap<Integer,List<Integer>> map = new TreeMap();
        
        verticalOrderTraversalUtil(root,0,map);
        
        if(!map.isEmpty()){
           Set<Integer> set = map.keySet();
            Iterator<Integer> itr= set.iterator();
            while(itr.hasNext()){
                List l = map.get(itr.next());
                System.out.println(l);
            }
                
        }
    }
    
    public void verticalOrderTraversalUtil(BinaryTreeNode node,int HD,TreeMap<Integer,List<Integer>> map){
        if(node == null)
            return;
        
        verticalOrderTraversalUtil(node.getLeft(),HD-1,map);
        if(map.containsKey(HD))
        {
            List l = map.get(HD);
            l.add(node.getData());
            map.put(HD,l);
        }
        else{
            List<Integer> l = new ArrayList();
            l.add(node.getData());
            map.put(HD, l);
        }
        
        verticalOrderTraversalUtil(node.getRight(),HD+1,map);
    }
    
}
