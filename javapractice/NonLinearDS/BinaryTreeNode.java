/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice.NonLinearDS;

/**
 *
 * @author L NelSoN ManGanGchA
 */
public class BinaryTreeNode {
        private int data;
        private BinaryTreeNode left;
        private BinaryTreeNode right;
        BinaryTreeNode(int d){
            this.data = d;
            left = null;
            right = null;
        }
        
        public void setData(int data){
            this.data = data;
        }
        
        public void setLeft(BinaryTreeNode left){
            this.left = left;
        }
        public void setRight(BinaryTreeNode right){
            this.right = right;
        }
        
        public BinaryTreeNode getLeft(){
            return left;
        }
        
        public BinaryTreeNode getRight(){
            return right;
        }
        
        public int getData(){
            return data;
        }
        
}
