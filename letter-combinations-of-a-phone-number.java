https://leetcode.com/problems/letter-combinations-of-a-phone-number/
class Solution {
    static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public List<String> letterCombinations(String str) {
      List<String> list = new ArrayList<>();
      if (str.length()==0) return list;
		printKeyPaid(str, "",list);
        return list;
    }
    public static void printKeyPaid(String ques, String ans,List<String> list) {// 12
		if (ques.length() == 0) {
            list.add(ans);
			return;
		}

		char ch = ques.charAt(0);// '1'--> 49
		String pressString = key[ch - 48];// ch-->49

		for (int i = 0; i < pressString.length(); i++) {
			printKeyPaid(ques.substring(1), ans + pressString.charAt(i),list);
	}
}
}
