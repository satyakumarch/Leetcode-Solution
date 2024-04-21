https://leetcode.com/problems/valid-sudoku/
class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> Rset = new HashSet<>(); //to check repetition in rows
        HashSet<Character> Cset = new HashSet<>(); //to check repetition in columns

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='.') continue;
                else {
                    if(!Rset.add(board[i][j])) return false;  //if same elemets are added Rset.add return false;
                }
                }
            Rset = new HashSet<>();  //clearing the Rset after checking for one row.
            }
        

        for(int j=0;j<board.length;j++){
            for(int i=0;i<board.length;i++){
                if(board[i][j]=='.')continue;
                    else{
                    if(!Cset.add(board[i][j])) return false; //if same elemets are added Cset.add return false;
                    }
            }
            Cset = new HashSet<>();  //clearing the Cset after checking for one column.
        }
        
        //now the 3rd condition checking repetitions in 3x3 sub-boxes.
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                if(!check3(i,j,board)) return false;
            }
        }
        
        //if all conditions are validated we return true.
        return true;
        }
    
    //this function checks repetition in a 3x3 matrix
    public boolean check3(int i,int j,char[][] board){
        HashSet<Character> set3 = new HashSet<>();
        for(int m=i;m<3+i;m++){
            for(int n=j;n<3+j;n++){
                if(board[m][n]=='.') continue;
                else {
                    if(!set3.add(board[m][n])) return false;
                }
            }
        }
        return true;
    }
    }
