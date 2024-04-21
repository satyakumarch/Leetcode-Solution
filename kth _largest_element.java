class Solution{
  public static int kelement(int[] nums,int k){
      final int n = nums.length;
    Arrays.sort(nums);
    return nums[n -k];
  }
}
