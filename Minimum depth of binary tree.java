class Solution {
    public int minDepth(TreeNode root) {
        if(root == null){
		//base condition
            return 0;
        } 
        int left = minDepth(root.left)+1;
		//left recursive call now it will traverse until the left is null and count increment also
        int right = minDepth(root.right)+1;
		//right recursive call now it will traverse until the right is null and count increment also
        if(root.left == null){   //this will solve the edge cases in which the tree is only one sided
            return right;
        }
        if(root.right == null){  //this will solve the edge cases in which the tree is only one sided
            return left;
        }
        int depth = Math.min(left,right);
		//calculating the work question asked by getting the minimum and returning it
        return depth;
    }
}
