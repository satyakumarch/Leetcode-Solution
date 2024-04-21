class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int a = 0;
        int b= 0;
        int cnt = 0;
        while(a<g.length && b<s.length){
            if(s[b]>= g[a]){
                cnt++;
                a++;
            }
            b++;
        }
        return cnt;
    }
}
