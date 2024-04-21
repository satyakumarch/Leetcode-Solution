https://leetcode.com/problems/product-of-array-except-self/
class Solution {
    public int[] productExceptSelf(int[] nums) {
      int [] left = new int[nums.length];
        left[0] = 1;
        for(int i = 1; i < left.length;i++)
        {
        left[i] = left[i-1]*nums[i-1];
        }
        int []right = new int[nums.length];
        int n = nums.length;
        right[n-1] =1;
        for(int i = n-2;i>=0;i--){
            right[i] = right[i+1]*nums[i+1];
        }
        for(int i = 0;i<right.length;i++){
            left[i] = left[i] *right[i];
        }
        return left;
    }
}


//another soluyion with O(1) space
 class Solution {
     public int[] productExceptSelf(int[] nums) {
         int[] left = new int[nums.length];
         left[0] = 1;
         for(int i = 1; i < nums.length; i++){
             left[i] = left[i - 1] * nums[i - 1];
         }
         int right = 1;
         for(int i = nums.length - 2; i >= 0; i--){
             right *= nums[i + 1];
             left[i] *= right;
         }
         return left;
     }
 }

