https://leetcode.com/problems/missing-number/
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = n * (n + 1) / 2;
        int sum = 0;
        for(int i =0;i<nums.length;i++) {
            sum += nums[i];
        }
        return total - sum;
        
        BINARY SEARCH APPROACH
            
            
    // Arrays.sort(nums);
    // int left = 0, right = nums.length;
    // while(left<right){
    //    int mid = (left + right)/2;
    //     if(nums[mid]>mid) {
    //         right = mid;
    //     }
    //     else {
    //         left = mid+1;
    //     }
    // }
    // return left;
    }
}

