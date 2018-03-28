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

public class BinaryTree{
        private BinaryTreeNode root;
        
        BinaryTree(){
            this.root = null;
        }
        
        BinaryTree(BinaryTreeNode rootNode)
        {
            this.root = rootNode;
        }

        public BinaryTreeNode getRoot(){
            return root;
        }
        public BinaryTreeNode setRoot(BinaryTreeNode n){
            this.root = n;
            return root;
        }    
    }
