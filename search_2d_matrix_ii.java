https://leetcode.com/problems/search-a-2d-matrix-ii/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int r = 0;
        int c = columns-1;
        while(r<rows && c>=0){
            if(matrix[r][c] == target){
                return true;
            }
            else if(matrix[r][c]<target){
                r++;
            }
            else{
                c--;
            }
        }
        return false;
    }
}
