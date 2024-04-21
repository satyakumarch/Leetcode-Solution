class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if(s.length() == 0){
            return 0;
        }
        boolean sign  = true;
        long ans =0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(i == 0){
            if(ch == '-'){
                sign = false;
                continue;
            }else if(ch == '+'){
                sign = true;
                continue;
            }else{
                sign = true;
            }
            }
            if(ch >= '0' && ch <= '9'){
                int dig = ch - '0';
                ans = ans * 10 + dig;
        if(sign == false){
            long check = -ans;
        if(check<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }}else{
            long check = ans;
            if(check>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
            }
        
        }
            }
            else{
                break;
            }
        }
        if(sign == false){      
            ans = -ans;
        }
        return (int)ans;
    }
}
