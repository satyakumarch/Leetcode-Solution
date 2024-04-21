class Solution {
    public boolean evaluateTree(TreeNode root) {
        boolean res = false;
        if(root.left == null && root.right == null){
           if(root.val == 1){
               return true;
           }
            if(root.val == 0){
                return false;
            }
        }
        if(root.val == 2){
            res = evaluateTree(root.left)||evaluateTree(root.right);
        }
        else if(root.val == 3){
                  res = evaluateTree(root.left)&&evaluateTree(root.right);
        }
        return res;
    }
}
