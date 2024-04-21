// https://leetcode.com/problems/merge-sorted-array/

// we have applied two pointer approach  in this problem for time complexity O(N) 
//brute force approach for this question will be merging the two arrayts with a temp array and then sorting it O(n1 + n2) Time and O(n1 + n2) Extra Space
class solution{
  public void merge(int [] nums1 , int m , int [] nums2,int n ){
    int p1 = m -1;
    int p2 = n-1;
    int i = m + n - 1;
    while(p2>=0){
      if(p1>=0 && nums1[p1] > nums2[p2]){
        nums1[i--] = nums1[p1--];
      }
      else{
        nums1[i--] = nums2[p2--];
      }
    }
  }
}
