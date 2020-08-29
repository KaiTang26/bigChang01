public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: True if the binary tree is BST, or false
     */
    public boolean isValidBST(TreeNode root) {
        // write your code here
        return testBST(root).isBST;
    }
    
    public ReturnType testBST(TreeNode root){

        if(root == null){

            return new ReturnType(true, Long.MIN_VALUE, Long.MAX_VALUE);
        }

        ReturnType left = testBST(root.left);

        ReturnType right = testBST(root.right);

        if(left.isBST && right.isBST && left.Max < root.val && right.Min > root.val ){
            long max = Math.max(root.val, Math.max(right.Max, left.Max));
            long min = Math.min(root.val, Math.min(right.Min, left.Min));
            return new ReturnType(true, max, min);
        }else{
            return new ReturnType(false, -1, -1);
        }


    }
}

class ReturnType{

    public boolean isBST;
    public long Max;
    public long Min;

    public ReturnType(boolean isBST, long Max, long Min){
        this.isBST = isBST;
        this.Max = Max;
        this.Min = Min;

    }

}