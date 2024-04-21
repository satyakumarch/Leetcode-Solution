https://leetcode.com/problems/special-positions-in-a-binary-matrix/
class Solution {
    public int numSpecial(int[][] mat) {
        int count = 0;
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[0].length;j++){
                boolean flag = false;
                if(mat[i][j] == 1){
                    flag  = true;
                    // count++;
                    for(int k = 0;k<mat.length;k++){
                        if(k != i && mat[k][j] == 1) {
                         flag = false;                            
                        }
                    }
                    for(int k = 0;k<mat[0].length;k++){
                        if(k != j && mat[i][k] == 1){
                            flag = false;
                        }
                    }
                    if(flag == true){
                        count++;
                    }
                }               
            }
        }
        return count;
    }
}
