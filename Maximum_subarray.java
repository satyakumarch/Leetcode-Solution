// https://leetcode.com/problems/maximum-subarray/

// BRUTE FORCE SOLUTION O(N^2)
class solution{
    public int maxSubArray(int []nums){
  int max = Integer.MIN_VALUE;
    for(int i = 0;I<nums.length;i++){
      int sum = 0;
      for(int j = i;j<nums.length;j++){
        sum += arr[j];
        if(sum > max){
          max  = sum;
        }
      }
      return max;
    }
  }
  
  // OPTIMISED SOLUTION BY KADANE'S ALGORITHM O(N)
  
  class Solution {
    public int maxSubArray(int[] nums) {
       int cursum = 0;
       int maxsum = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            cursum  = cursum + nums[i];
            if(cursum > maxsum){
                maxsum = cursum;
            }
            if(cursum<0){
                cursum = 0;
            }
        }
        return maxsum;
    }
}
  
