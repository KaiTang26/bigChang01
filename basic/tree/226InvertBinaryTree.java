class Solution {
    public TreeNode invertTree(TreeNode root) {

        helper(root);


        return root;

    }

    public void helper (TreeNode node){

        if(node == null){
            return;
        }

        helper(node.left);
        helper(node.right);
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;



    }
}