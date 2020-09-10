import java.util.*;

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
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<Integer>();

        preOrder(root, result);

        return result;

    }

    public void preOrder(TreeNode root, List<Integer> result){

        if(root==null){
            return;
        }


        result.add(root.val);
        preOrder(root.left, result);
        preOrder(root.right, result);

    }
}