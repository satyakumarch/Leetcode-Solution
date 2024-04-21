class Solution {
    public int rob(int[] nums) {
	//if size of array is 1 the simply return 0th index
      if(nums.length<2){
         return nums[0];
      } 
	  //creating a dp array
      int []dp = new int[nums.length];
	  //saving value in dp array
      dp[0] = nums[0];
	  //inserting the value which is maximum 
      dp[1] = Math.max(nums[0],nums[1]);
      for(int i = 2;i<nums.length;i++){
	  //the core idea or formula
          dp[i] = Math.max(dp[i-2]+nums[i],dp[i-1]);
		 // this step defines the two cases if an element is selected then the previous element cannot be selected and 
		 //if an element is not selected then the previous element can be selected.
      }
	  //returning the last element in the dp array
      return dp[nums.length-1];
    }
}
