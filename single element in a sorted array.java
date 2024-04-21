https://leetcode.com/problems/single-element-in-a-sorted-array/
class Solution {
    public int singleNonDuplicate(int[] nums) {
        for(int i = 0;i<nums.length-1;i+=2){
            if(nums[i] != nums[i+1]){
                return nums[i];
            }
            if(nums[nums.length-2] != nums[nums.length-1]){
                return nums[nums.length-1];
            }
        }
        return 1;
    }
}
