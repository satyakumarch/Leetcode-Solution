https://leetcode.com/problems/sort-colors/
class Solution {
    public void sortColors(int[] nums) {
        if(nums.length == 0 || nums.length == 1){
            return;
        }
        int i = 0;
        int j = nums.length-1;
        int index = 0;
        while(index<=j&& i<j){
            if( nums[index]== 0){
                nums[index] = nums[i];
                nums[i]=0;
                index++;
                i++;
            }
            else if(nums[index] == 2){
                nums[index] = nums[j];
                nums[j] =2;
                j--; 
            }
            else{
                index++;
            }
        }
    }
}
