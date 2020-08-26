package part6;

public class sumofleave {

    public static  int leafSum(TreeNode node){

        if(node == null){
            return 0;
        }

        if(node.left == null && node.right == null){
            return node.value;
        }

        return leafSum(node.right) + leafSum(node.left);
    }


    public static int leftLeafSum(TreeNode node){

        if(node == null){
            return 0;
        }

        if(node.left != null && node.left.left == null && node.left.right == null){
            return node.left.value+leftLeafSum(node.right);
        }

        return leftLeafSum(node.left)+leftLeafSum(node.right);
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