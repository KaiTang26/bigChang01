class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();

        postOrder(root, result);

        return result;

    }

    public void postOrder(TreeNode root, List<Integer> result){

        if(root==null){
            return;
        }
        postOrder(root.left, result);

        postOrder(root.right, result);

        result.add(root.val);

    }
}