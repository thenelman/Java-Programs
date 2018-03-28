/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice.NonLinearDS;
import java.lang.*;
import java.util.*;
/**
 *
 * @author L NelSoN ManGanGchA
 */
public class VerticalSumBT{

    /**
     * @param args the command line arguments
     */
    static void verticalSum(BinaryTreeNode node){
        if(node == null)
            return;
        
        HashMap<Integer,Integer> map = new HashMap();
        verticalSumUtil(node,0,map);
        
        if(!map.isEmpty())
            System.out.println(map.entrySet());
    }
    
    static void verticalSumUtil(BinaryTreeNode node,int HD,HashMap<Integer,Integer> mp){
        if(node == null)
            return;
        verticalSumUtil(node.getLeft(),HD-1,mp);
        int prevSum = (mp.get(HD)== null)?0:mp.get(HD);
        mp.put(HD, prevSum + node.getData());
        verticalSumUtil(node.getRight(),HD+1,mp);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*BinaryTreeNode root = new BinaryTreeNode(1);
        root.setLeft(new BinaryTreeNode(2));
        root.setRight(new BinaryTreeNode(3));
        root.getLeft().setLeft(new BinaryTreeNode(4));
        root.getLeft().setRight(new BinaryTreeNode(5));
        root.getRight().setLeft(new BinaryTreeNode(6));
        root.getRight().setRight(new BinaryTreeNode(7));
        BinaryTree t = new BinaryTree(root);
                */
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.setLeft(new BinaryTreeNode(2));
        root.setRight(new BinaryTreeNode(3));
        root.getLeft().setRight(new BinaryTreeNode(4));
        root.getLeft().getRight().setRight (new BinaryTreeNode(5));
        root.getLeft().getRight().getRight().setRight(new BinaryTreeNode(6));
        BinaryTree t = new BinaryTree(root);
        System.out.println("Following are the values of" + 
                           " vertical sums with the positions" +
                        " of the columns with respect to root ");
        verticalSum(t.getRoot());
        System.out.println();
        VerticalOrderTraversal vt = new VerticalOrderTraversal();
        
        vt.VerticalOrderTraversal(t.getRoot());
        System.out.println();
        
        TopViewOfTree tt = new TopViewOfTree();
        tt.printTopViewOfTree(t.getRoot());
        System.out.println();
        top_view(root);
        
    }
    static void top_view(BinaryTreeNode root) {
        if (root != null) {
             printLeft(root.getLeft());
            System.out.print(root.getData() + " ");
            printRight(root.getRight());
        }
    }

    static void printLeft(BinaryTreeNode n) {
        if (n != null) {
            printLeft(n.getLeft());
            System.out.print(n.getData() + " ");
        }
    }

    static void printRight(BinaryTreeNode n) {
        if (n != null) {
            System.out.print(n.getData() + " ");
            printRight(n.getRight());
        }
    }
    
}
