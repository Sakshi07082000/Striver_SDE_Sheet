//Brute force approach

class Solution 
{
    public int findPeakElement(int[] nums) 
    {
        if(nums.length==1)             //if array contains one element
            return 0;
        
        for(int i=0; i<nums.length; i++)
        {
            if(i==0)                   //check for first element
            {
                if(nums[i]>nums[i+1])
                    return i;
            }
            else if(i==nums.length-1)  //check for last element
            {
                if(nums[i]>nums[i-1])
                    return i;
            }
            else if(nums[i-1]<nums[i] && nums[i]>nums[i+1])
                return i;
        }
        return 0;
    }
}