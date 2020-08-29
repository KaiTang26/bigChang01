package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TreeNode node_1 = new TreeNode(2);
        TreeNode node_2 = new TreeNode(1);
        TreeNode node_3 = new TreeNode(4);
        TreeNode node_4 = new TreeNode(3);

        node_1.left = node_2;
        node_1.right = node_3;
        node_3.left = node_4;

    }

    public TreeNode insertNode(TreeNode root, TreeNode node) {
        // write your code here

        if(root == null){
            return node;
        }

        if(node.val>root.val){
            root.right = insertNode(root.right, node);
        }else{
            root.left = insertNode(root.left, node);
        }

        return root;

    }


     public static TreeNode insertNode_2(TreeNode root, TreeNode node){

        TreeNode father = null;

        TreeNode curr = root;

        if(root==null){
            return node;
        }

        while(curr != null){
            father = curr;
            System.out.println(curr.val);
            if(node.val > curr.val){
                curr = curr.right;
            }else{
                curr = curr.left;
            }
        }

        if(node.val > father.val){
            father.right = node;
        }else{
            father.left = node;
        }

        return root;

    }


}



class TreeNode {
     public int val;
     public TreeNode left, right;
     public TreeNode(int val) {
          this.val = val;
         this.left = this.right = null;
     }
}