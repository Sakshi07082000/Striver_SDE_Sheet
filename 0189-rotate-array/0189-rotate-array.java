//Brute force approach by using a temp array

class Solution 
{
    public void rotate(int[] nums, int k) 
    {
        int j=0, n=nums.length;
        int temp[]=new int[n];
        
        if(n==0)
            return;
        if((k=k%n)>n)
            return;
        for(int i=n-k; i<n; i++)
        {
            temp[j++]=nums[i];     //copy last k elements to temp
        }     
        for(int i=0; i<=n-k-1; i++)
        {
            temp[j++]=nums[i];     //copy remaining elements 
        }
        for(int i=0; i<n; i++)
        {
            nums[i]=temp[i];
        }
    }
}