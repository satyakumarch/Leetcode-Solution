// https://leetcode.com/problems/contains-duplicate/
//above is the link for this problem
public boolean containsDuplicate_bruteforce(int[] nums) {
   if (nums == null || nums.length == 0) return false;
   
   int l = nums.length;
   for (int i=0; i<l; i++) {
      for (int j=i+1; j<l; j++) {
         if (nums[i] == nums[j]) {
            return true;
         }
      }
   }
   return false;
}
