https://leetcode.com/problems/valid-anagram  
class Solution {
    public boolean isAnagram(String s, String t) {
        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();
        if(t.length() != s.length()){
            return false;
        }
        for(int i = 0;i<s.length();i++){
            list1.add(s.charAt(i));
            list2.add(t.charAt(i));
        }
        
        Collections.sort(list1);
        Collections.sort(list2);
        for(int i = 0;i<list1.size();i++){
            if(list1.get(i) != list2.get(i)){
                return false;
            }
        }
        return true;
    }
} 

