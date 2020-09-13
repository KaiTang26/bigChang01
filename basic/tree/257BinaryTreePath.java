class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        //List<String> result = new ArrayList<String>();

        Set<String> result = new HashSet<String>();

        String path = "";

        helper(root, path, result);

        return new ArrayList<String>(result);

    }

    public void helper(TreeNode node, String a, Set<String> b){

        if(node == null){
            return;
        }

        String path;

        if(a.equals("")){
            path = Integer.toString(node.val);
        }else{
            path = a+"->"+node.val;
        }

        if(node.right == null && node.left == null){
            b.add(path);
            return;
        }



        helper(node.left, path, b);
        helper(node.right, path, b);
    }
}