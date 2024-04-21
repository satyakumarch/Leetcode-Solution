https://leetcode.com/problems/invert-binary-tree/
class Solution {
    public TreeNode invertTree(TreeNode root) {
      if(root == null)
      {
        return null;
      }
      TreeNode left  = invertTree(root.left);
      TreeNode right = invertTree(root.right);
      
      root.left = right;
      root.right = left;
       
      return root;
    }
}
//anoither solution
TreeNode tmp = root.left;
root.left = root.right;
root.right = tmp;
invertTree(root.left);
invertTree(root.right);
return root;
}
}
