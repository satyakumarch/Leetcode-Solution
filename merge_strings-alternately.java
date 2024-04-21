https://leetcode.com/problems/merge-strings-alternately/
class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans = "";
        int p = 0;
        int q = 0;
        if(word1.length() == 0){
            return word2;
        }
        if(word2.length() == 0){
            return word1;
        }
        if(word1.length() == 0 && word2.length() == 0){
            return "";
        }
        while(p<word1.length() || q<word2.length()){
           if(p<word1.length() && q<word2.length()){
           ans = ans+word1.charAt(p)+word2.charAt(q);
            p++;
            q++;
        }
            else if(p<word1.length()){
                ans = ans+word1.charAt(p);
                p++;
            }
            else{
                ans = ans+word2.charAt(q);
                q++;
            }
    }
        return ans;
    }
}
