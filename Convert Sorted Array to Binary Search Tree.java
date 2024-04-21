https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
class Solution{
public TreeNode sortedArrayToBST(int[] num) {
    if (num.length == 0) {
        return null;
    }
   TreeNode head = helper(num,0,num.length);
   return head;
}
public TreeNode helper(int[] num, int low, int high) {
  if(low>high){
    return null;
  }
  int mid  = low + (high - low)/2;
  TreeNode node  = new TreeNode(nums[mid]);
  node.left  =  helper(num,low,mid-1);
  node.right = helper(num,mid+1,high);
  return node;
  }
}
