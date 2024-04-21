https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> list = new ArrayList<Boolean>();
        for(int i = 0;i<candies.length;i++){
            if(candies[i] >= max){
                max = candies[i];
            }
        }
        for(int i =0;i<candies.length;i++){
            if(candies[i] + extraCandies >= max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}
