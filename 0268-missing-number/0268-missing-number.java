class Solution 
{
    public int missingNumber(int[] nums) 
    {
        Arrays.sort(nums);
        int i=0;
        for(; i<nums.length; i++)
        {
            if(nums[i]!=i)
                break;                
        }
        return i;
    }
}



//Optimal approach using sum of n natural numbers

class Solution 
{
    public int missingNumber(int[] nums) 
    {
        int n=nums.length;
        int sum=n*(n+1)/2;
        int sum1=0;
        for(int i=0; i<n; i++)
        {
            sum1=sum1+nums[i];
        }
        int missno= sum-sum1;
        return missno;
    }
}
