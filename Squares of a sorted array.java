https://leetcode.com/problems/squares-of-a-sorted-array/
// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         for(int i =0;i<nums.length;i++){
//             nums[i] = nums[i]*nums[i];
//         }
//         Arrays.sort(nums);
//         return nums;
//     }
// }
class Solution {
    public  int[] sortedSquares(int[] nums) {
        int length = nums.length;
        if (length == 0) return new int[0];
        
        int[] result = new int[length];
        int l = 0, r = length - 1;
        for (int i = length - 1; i >= 0; i--) {
            int start = nums[l] * nums[l];
            int end = nums[r] * nums[r];
            if (start > end) {
                result[i] = start;
                l++;
            } else {
                result[i] = end;
                r--;
            }
        }
        return result;
    }
}
