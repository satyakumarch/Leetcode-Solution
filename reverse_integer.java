https://leetcode.com/problems/reverse-integer
class Solution {
    public int reverse(int x) {
        boolean negative = false;
        if(x < 0){
            negative = true;
            x *=-1;
        }
    long reverse  = 0;
    long pop;
        while(x!=0){
            pop = x%10;
            reverse = (reverse * 10) + pop;
            x/=10;
        }
         if(reverse > Integer.MAX_VALUE){
            return 0;
        }
        if(reverse< Integer.MIN_VALUE){
            return 0;
        }
        return negative?(int)(-1 * reverse): (int)reverse;
    }
}
