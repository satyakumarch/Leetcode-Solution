https://leetcode.com/problems/maximum-sum-circular-subarray/
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
       int nonCircularSum = kadaneMaxSum(nums);
       int totalSum =0;
       for(int  i =0 ;i<nums.length;i++){
           totalSum+=nums[i];
           nums[i] = -nums[i];
       }
        int circularSum = totalSum + kadaneMaxSum(nums);
        if(circularSum ==0 ){
            return nonCircularSum;
        }
        return Math.max(circularSum,nonCircularSum);
    }
    int kadaneMaxSum(int[] nums){
        int currentSum = nums[0];
        int overallSum = nums[0];
        for(int i =1;i<nums.length;i++){
            if(currentSum>=0){
                currentSum+=nums[i];
            }
            else{
                currentSum = nums[i];
            }
            if(currentSum>overallSum){
                overallSum = currentSum;
            }  
        }
      return overallSum;
    }
}
