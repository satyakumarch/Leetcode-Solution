https://leetcode.com/problems/find-the-duplicate-number
class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int len = nums.length;
        for(int  i = 0; i<len;i++){
            if(!set.add(nums[i])){
                return nums[i];
            }
        }
        return len;
    }
}
class Solution {
    public int findDuplicate(int[] nums) {
      int len = nums.length;
        int low = 1;
        int high = len - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            int cnt = 0;
            for (int i = 0; i < len; i++) {
                if (nums[i] <= mid) {
                    cnt++;
                }
            }

            if (cnt <= mid) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
       
    }
}
