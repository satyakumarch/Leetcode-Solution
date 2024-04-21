// https://leetcode.com/problems/contains-duplicate/
// link for  problem
// BRUTE FORCE SOLUTION
class Solution {
    public boolean containsDuplicate(int[] nums) {
        for(int i =0;i<nums.length-1;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
//OPTIMISED SOLUTION 1 (USING HASHSET DATASET)
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            if(map.contains(nums[i]))return true;    map.add(nums[i]);
            }
        
        return false;
    }
}
// OPTIMISED SOLUTION 2 (USING SORTING ARRAYS METHOD)
class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Arrays.sort(nums);
        
        for(int i =0;i<nums.length-1 ;i++){
            if(nums[i] == nums[i+1]) return true;
        }
        return false;
    }
}
