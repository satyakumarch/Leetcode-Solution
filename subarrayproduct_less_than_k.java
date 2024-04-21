https://leetcode.com/problems/subarray-product-less-than-k/
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
     if(k<=1){
         return 0;
     }
    int left =0;
    int right =0;
    int result =0;
    int product =1;
    while(right<nums.length){
        product *= nums[right];
        while(product>=k){
            product /= nums[left];
            left++;
        }
        result += right-left+1;
        right++;
    }
        return 
    }
}
