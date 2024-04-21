https://leetcode.com/problems/find-the-town-judge
class Solution {
    public int findJudge(int n, int[][] trust) {
      //creating a array to store the indegree and outdegree or we can say we are counting eho trusts whom to store this info we are creating a array
      int []count = new int[n+1];
      //n+1 because it is from 1 to N not 0 to n;
      for(int i = 0;i<trust.length;i++){
            //now decrementing count for outdegree or trusting others 
            count[trust[i][0]]--;
            //now incrementing count for indegree or for getting trusted
            count[trust[i][1]]++;
      }
      for(int j = 0;j<=n;j++){
          //checking whichever indegree in count array matches n-1 for town judge condition we return the answer
          if(count[i] == n - 1){
            return i;
          }
      }
      return -1;
      //if noone is town judge
    }
}
