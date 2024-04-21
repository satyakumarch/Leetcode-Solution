class Solution {
    public double calculateTax(int[][] brackets, int income) {
        int prev = 0;
        double tax = 0;
        
        for(int [] bracket: brackets){
            int upper = bracket[0];
            int percent = bracket[1];
            
            if(income > upper){
                tax +=  (double)(upper - prev) * percent / 100;
                prev = upper;
            } else{
                tax += (double) (income - prev) * percent /100;
                break;
            }
            
        }
        return tax;        
    }
}
