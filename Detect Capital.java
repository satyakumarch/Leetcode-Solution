https://leetcode.com/problems/detect-capital/
class Solution {
    public boolean detectCapitalUse(String word) {
        int caps = 0;
        for(int i = 0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                caps++;
            }
        }
        if(caps == word.length() || caps == 0){
            return true;
        }
        if(caps == 1 && Character.isUpperCase(word.charAt(0))){
            return true;   
        }
        return false;
    }
}
