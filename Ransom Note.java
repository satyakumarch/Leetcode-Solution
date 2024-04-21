     class Solution {
    public boolean canConstruct(String r, String m) {
        int[] alph = new int[26];
        for (int i = 0; i < m.length(); i++) {
            alph[m.charAt(i) - 'a']++;
        }
        for (int i = 0; i < r.length(); i++) {
            alph[r.charAt(i) - 'a']--;
        }
        for (int n : alph) {
            if (n < 0) return false;
        }
        return true;
    }
}
