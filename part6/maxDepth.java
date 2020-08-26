package part6;

public class maxDepth {

    public static int maxDepth(TreeNode root) {
        // write your code here

        if(root == null){
            return 0;
        }

        return Math.max(maxDepth(root.right), maxDepth(root.left))+1;
    }
    
}