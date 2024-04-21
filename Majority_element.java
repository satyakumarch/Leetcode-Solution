https://leetcode.com/problems/majority-element/
// Sorting
public int majorityElement1(int[] nums) {
    Arrays.sort(nums);
    return nums[nums.length/2];
}

// hash map
class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        HashMap<Integer,Integer> map = new HashMap<Integer , Integer>();
        for(int i :nums){
            if(map.containsKey(i) && map.get(i) + 1 > nums.length /2){
                return i;
            }
            else{
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }
        return 0;
    }
}
// moore voting algorithm
class Solution {
    public int majorityElement(int[] nums) {
        int count =0;
        int element = 0;
        for(int i = 0;i<nums.length;i++){
            if(count == 0){
                element = nums[i];
            }
            if(nums[i] == element){
                count++;
            }
            else{
                count--;
            }
        }
    return element;
    }
}
