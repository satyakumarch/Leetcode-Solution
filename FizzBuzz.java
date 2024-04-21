https://leetcode.com/problems/fizz-buzz/
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> output = new ArrayList();
        int fizz =0;
        int buzz =0;
        for(int i =1;i<=n;i++){
            fizz++;
            buzz++;
            if(fizz==3 && buzz==5){
                fizz = 0;
                buzz = 0;
                output.add("FizzBuzz");
            }
            else if(fizz == 3){
                fizz = 0;
                output.add("Fizz");
            }
            else if(buzz == 5){
                buzz = 0;
                output.add("Buzz");
            }
            else{
                output.add(Integer.toString(i));
            }
        }
        return output; 
    }
}
