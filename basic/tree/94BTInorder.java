public class Main {

    public static void main(String[] args) {

        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);

        node1.right = node2;
        node2.left = node3;
    }

}
class TreeNode{
    int val;
    TreeNode right;
    TreeNode left;

    TreeNode(int val){
        this.val = val;
        this.right = null;
        this.left = null;
    }
}

// preOrder: root, left, right

class Solution {
    

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();

        inOrder(root, result);

        return result;

    }

    public void inOrder(TreeNode root, List<Integer> result){

        if(root==null){
            return;
        }
        inOrder(root.left, result);
        result.add(root.val);
        inOrder(root.right, result);

    }
}