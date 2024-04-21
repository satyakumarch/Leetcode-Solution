https://leetcode.com/problems/rotate-array/

class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length; // this will decrement k so we do not iteratecontinuouslu
        //now  we apply reversal algorithm ;
        //first step is reversing the whole array 
        reverse(nums,0,nums.length-1);
        //second step is to reverse the array upto till k elements 
        reverse(nums,0,k-1)l;
        //third step is to reverse elements after n-k elements or we say reverse the whoe aarray after k elements 
        reverse(nums,k,nums.length-1);
    }
    //now we create the reverse  function
    public void reverse(int[]nums,int start,int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

//monu bhaiya soluiton

class Solution {
    public void rotate(int[] nums, int k) {

        
        int n=nums.length;
        k=k%n;
        int m=n;
        n=n-k;
       
        m1(nums,0,n/2,n);
        n=m;
        m1(nums,n-k,(n-k+n-1)/2+1,n);
        m1(nums,0,n/2,n);
        
    }
    public void m1(int[] nums,int u,int v,int n)
    {   
        int k=1;
        for(int i=u;i<v;i++)
        {
            Reverse(nums,i,n-k);
            k=k+1;
        }  
    }
    
    
    public static void Reverse( int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
