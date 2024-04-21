https://leetcode.com/problems/next-permutation
//monu bhiya solution
class Solution {
    public void nextPermutation(int[] nums) {
            for(int i = nums.length-2;i>=0;i--){
                if(nums[i]<nums[i+1]){
                    p=i;
                    break;
                }
            }
        int q = 0;
        for(int i = nums.length-1;i>p;i--){
            if(nums[i]>nums[p]){
                q=i;
                break;
            }
        }
        if(p == 0  && q == 0){
            Range_reverse(nums,0,arr.length-1);
            return;
        }
        int temp = nums[p];
        nums[p] = nums[q];
        nums[q] = temp;
        Range_reverse(nums,p+1,nums.length-1);
public static void Range_reverse(int[] arr, int i, int j) {

		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

	}

}

        
        
        
        
        
        
class Solution {
    public void nextPermutation(int[] nums) {
        int mark = -1;
        //find first decreasing digit
        for(int i = nums.length-1;i>0;i--){
            if(nums[i] > nums[i-1]){
                mark = i-1;
                break;
            }
        }
        if(mark == -1){
            reverse(nums,0,nums.length-1);
            return;
        }
        int idx = nums.length-1;
        for(int i = nums.length-1;i>=mark+1;i--){
            if(nums[i]>nums[mark]){
                idx = i;
                break;
            }
        }
        swap(nums,mark,idx);
        reverse(nums,mark+1,nums.length-1);
        
    }
    private void swap(int[]nums,int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
    private void reverse(int []nums,int i , int j){
        while(i<j){
            swap(nums,i,j);
            i++;j--;
        }
    }
}
