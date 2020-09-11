class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        return helper(p,q);

    }

    public boolean helper (TreeNode rootA, TreeNode rootB){

        if(rootA == null && rootB == null){
            return true;
        }


        if((rootA != null && rootB != null) && (rootA.val == rootB.val)){
            return helper(rootA.left, rootB.left) && helper(rootA.right, rootB.right);
        }

        return false;


    }
}