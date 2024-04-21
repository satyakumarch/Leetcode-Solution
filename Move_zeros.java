https://leetcode.com/problems/move-zeroes/
class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        for(int j = 0 ; j < nums.length ; j++){
            if(nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
        }
        for(int k = i ; k < nums.length; k++){
            nums[k] = 0;
        }
    }
}
approach 2;
class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length<2){
            return;
        }
        int left = 0; 
        int right = 1;
        while(right < nums.length){
            if(nums[left] != 0){
                left ++;
                right ++;
            }
            else if(nums[right] == 0){
                right ++ ;
            }
            else{
               int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp ;
            }
        }
    }
}
