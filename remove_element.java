https://leetcode.com/problems/remove-element/submissions/
class Solution {
    public int removeElement(int[] nums, int val) {
        int pointer1 = 0;
        for(int j = 0;j<nums.length;j++){
            if(nums[j]!= val){
                nums[pointer1] = nums[j];
                pointer1++;
            }
        }
      return pointer1;
    }
}
the above is approach 1
  
the below is the second approach

        int i = 0;
        int n = nums.length;
        while(i<n){
            if(nums[i]==val){
                nums[i] = nums[n-1];//resducing the size of array by 1
                n--;
            }
            else{
                i++;
            }
        }
        return n;
    }
}
