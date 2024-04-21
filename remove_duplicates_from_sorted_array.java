https://leetcode.com/problems/remove-duplicates-from-sorted-array/
class Solution {
    public int removeDuplicates(int[] nums) {
        int insertIndex = 1;
        for(int i = 1;i<nums.length;i++){
            //we skip to the next index if we see a duplicate element
            if(nums[i-1] != nums[i]){
                // storing the unique element at insertindex and incerementing the insert index by 1.
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }
        return insertIndex;
    }
}
