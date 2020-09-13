class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {

        return helper(root, sum);

    }

    public boolean helper (TreeNode node, int sum){

        if( node ==  null){
            return false;
        }


        sum = sum - node.val;

       if(node.left == null && node.right == null){

           return sum ==0;
       }

       return helper(node.left, sum) || helper(node.right, sum);

    }
}