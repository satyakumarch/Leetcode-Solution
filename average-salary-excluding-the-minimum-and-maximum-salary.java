https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int average = 0;
        int cnt=0;
        int n = salary.length;
        for(int i =1;i<n-1;i++){
           average = average + salary[i];
            cnt++;
        }
        double answer = (double)(average)/(double)(cnt);
        return (double)answer;
    }
}
