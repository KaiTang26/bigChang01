package part6;

public class Main{

    public static void main(String[] args){

        TreeNode node_1 = new TreeNode(8);
        TreeNode node_2 = new TreeNode(3);
        TreeNode node_3 = new TreeNode(10);
        TreeNode node_4 = new TreeNode(1);
        TreeNode node_5 = new TreeNode(6);
        TreeNode node_6 = new TreeNode(4);
        TreeNode node_7 = new TreeNode(7);
        TreeNode node_8 = new TreeNode(13);
        TreeNode node_9 = new TreeNode(14);

         node_1.left = node_2;
         node_1.right = node_3;
         node_2.left = node_4;
         node_2.right = node_5;
         node_5.left = node_6;
         node_5.right = node_7;
         node_3.right = node_9;
         node_9.left = node_8;

         


    }

    public static void inorderPrint(TreeNode node){

        if(node == null){
            return;
        }

        
        inorderPrint(node.left);
        System.out.println(node.value);
        inorderPrint(node.right);



    }

    public static void preorderPrint(TreeNode node){

        if(node == null){
            return;
        }
        System.out.println(node.value);
        preorderPrint(node.left);
        preorderPrint(node.right);
    }
}

class TreeNode{
    public int value;
    public TreeNode left, right;
    
    public TreeNode(int value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

