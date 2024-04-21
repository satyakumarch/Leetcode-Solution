https://leetcode.com/problems/diagonal-traverse/
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix.length ==0){
            return new int[0];
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int r = 0;
        int c = 0;
        int result[] = new int[m*n];
        for(int i = 0;i<result.length;i++){
            result[i] = matrix[r][c];
            if((r+c)%2==0){
                if(c == n-1){
                    r++;
                }
                else if(r == 0){
                    c++;
                }
                else{
                    c++;
                    r--;
                }
            }
            else{
                if(r == m-1){
                    c++;
                }
                else if(c ==0){
                 r++;   
                }
                else{
                    r++;
                    c--;
                }
            }
        }
        return result;
    }
}
