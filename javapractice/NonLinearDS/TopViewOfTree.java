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

public class TopViewOfTree {
    class qItem{
        private BinaryTreeNode node;
        private int HD;
        qItem(BinaryTreeNode node,int hd){
            this.node = node;
            this.HD = hd;
        }
    
         public BinaryTreeNode getNode(){
            return node;
        }
    
        public int getHD(){
            return HD;
        }
    }
    

    public void printTopViewOfTree(BinaryTreeNode root){
        if(root==null){
            return;
        }
        
        Queue<qItem> queue = new ArrayDeque();
        TreeSet<Integer> set = new TreeSet();
        
        queue.add(new qItem(root,0));
        
        while(!queue.isEmpty()){
            qItem temp = queue.remove();
            int hd = temp.getHD();
            BinaryTreeNode n = temp.getNode();
            
            if(!set.contains(hd)){
                set.add(hd);
                System.out.print(n.getData()+" ");
            }
            if(n.getLeft()!=null)
                queue.add(new qItem(n.getLeft(),hd-1));
            if(n.getRight()!=null)
                queue.add(new qItem(n.getRight(),hd+1));
        }
    }
}
    