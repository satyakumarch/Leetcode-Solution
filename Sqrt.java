https://leetcode.com/problems/sqrtx/submissions/
class Solution {

    public int mySqrt(int x) {
        long l = 0, r = x;
        while(l < r){
            long mid = l + ((long) r - l + 1) / 2;
            if (mid * mid <= (long) x)
                l = mid;
            else
                r = mid - 1;
        }
        return (int) l;
    }

}
