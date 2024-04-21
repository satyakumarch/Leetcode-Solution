https://leetcode.com/problems/k-diff-pairs-in-an-array
class Solution {
    public int findPairs(int[] nums, int k) {
      
      BRUTE FORCE APPROACH
      
        Set<Integer> uniquePairSet = new HashSet();
     for(int i=0;i<nums.length;i++){
         for(int j =i+1;j<nums.length;j++ ){
             if(Math.abs(nums[j] - nums[i]) == k){
                 uniquePairSet.add( Math.min(nums[i],nums[j])); 
             }
         }
     }
        return uniquePairSet.size();
      
      BINARY SEARCH APPROACH OLOGN
        
        
        class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums); // sorted the array
        Set<Integer> set = new HashSet<>(); // Declare the HashSet to only consider unique one's
        int n = nums.length; // length of the array
        for(int i = 0; i < nums.length - 1; i++){
            // searching for binary index for the no from the i + 1 index to n 
            // and check if we are getting nums[i] + k, where nums[i] is our 'x'
            if(Arrays.binarySearch(nums, i + 1, n, nums[i] + k) > 0){
                set.add(nums[i]);
            }
        }
        return set.size();
    }
}
      
      
    }
}
