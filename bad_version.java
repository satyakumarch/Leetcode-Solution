https://leetcode.com/problems/first-bad-version


/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
      int low = 0;
      int high = n;
      while(low<high){
        int  midpoint= low + (high - low )/2;
        if(isBadVersion(midpoint)){
          high = midpoint ;
        }
        else{
          low  = midpoint + 1; 
        }
      }
      return high ; 
    }
}
