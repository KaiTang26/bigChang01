class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {

        List<List<Integer>> pathSum = new ArrayList<List<Integer>>();

        List<Integer> path = new ArrayList<Integer>();

        helper(root, sum, path, pathSum);

        return pathSum;
    }

    public void helper (TreeNode node, int sum, List<Integer> path, List<List<Integer>> pathSum){


        if(node == null){
            return;
        }

        sum = sum - node.val;

        List<Integer> newPath = new ArrayList<>(path);

        newPath.add(node.val);

        if(node.right ==null && node.left == null){
            if(sum==0){
                pathSum.add(newPath);
            }
        }

        helper(node.right, sum, newPath, pathSum);
        helper(node.left, sum, newPath, pathSum);

    }
}