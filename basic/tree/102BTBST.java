import java.util.*;

public class Main {

    public static void main(String[] args) {

        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20);
        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);


        node1.right = node3;
        node1.left = node2;
        node3.left = node4;
        node3.right = node5;

        Solution sl = new Solution();

        sl.levelOrder(node1);
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

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> nodeQueue = new LinkedList<TreeNode>();

        List<List<Integer>> result = new ArrayList<List<Integer>>();

        nodeQueue.add(root);

        while(nodeQueue.size()>0){

            int queueSize = nodeQueue.size();

            List<Integer> levels = new ArrayList<Integer>();

            for(int i=0; i<queueSize; i++){
                TreeNode ele = nodeQueue.remove();
                if(ele !=null){

                    levels.add(ele.val);
                    if(ele.left!=null){
                        nodeQueue.add(ele.left);
                    }

                    if(ele.right!=null){
                        nodeQueue.add(ele.right);
                    }
                }
            }


            if(levels.size()>0){
                result.add(levels);

            }


        }

        return result;
    }
}