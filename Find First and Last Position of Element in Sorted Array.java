https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int []result = new int[2];
        result[0] = findstartingindex(nums,target);
        result[1] = findendingindex(nums,target);
        return result;
    }
    public int  findstartingindex(int[]nums,int target){
        int index = -1;
      int low = 0;
     int high = nums.length-1;
     while(low<=high){
        int midpoint = low + (high - low)/2 ;
        if(nums[midpoint]==target){
           index = midpoint;
        }
        if(nums[midpoint]>=target){
            high = midpoint -1;
        }
         else{
             low=midpoint+1;
         }
     }
        return index;
    }
    public int  findendingindex(int[]nums,int target){
     int index =-1; 
     int low = 0;
        int high = nums.length-1;
        while(low<=high){
             int midpoint = low + (high - low)/2;
             if(nums[midpoint]==target){
            index = midpoint;
        }       
            if(nums[midpoint]<=target){
                low = midpoint+1;
            }
            else{
                high = midpoint-1;
            }
        }
    return index;
    }
}
