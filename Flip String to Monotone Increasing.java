https://leetcode.com/problems/flip-string-to-monotone-increasing/
class Solution {
    public int minFlipsMonoIncr(String s) {
        int onecount = 0; 
        int zerotoone = 0;
        int i =0;
        while(i<s.length() && s.charAt(i) == '0'){
            i++;
        }
        for(;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '0'){
                zerotoone++; // flipping zero to one
            }
            else{
                onecount++;
            }
            if(zerotoone > onecount){
                zerotoone = onecount;
            }
        }
        return zerotoone;
    }
}
