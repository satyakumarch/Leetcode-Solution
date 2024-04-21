https://leetcode.com/problems/single-number/
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);                          //Sort the array
        for(int i=0 ; i<nums.length-1; i+=2){       
            if(nums[i]!=nums[i+1])                  //Check pairwise values in array
                return nums[i];                     //if any pairwise values are different, then it is answer
        }
        return nums[nums.length - 1];       //if answer is largest value, then it will not be detected in above loop hence return it here
   }
}
//usedc by sorting method
