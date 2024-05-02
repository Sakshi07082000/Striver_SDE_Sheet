//Brute force approach

class Solution 
{
    public int singleNonDuplicate(int[] nums) 
    {
        int single=0;
        if(nums.length == 1)
        {
            return nums[0];
        }
        for(int i=0; i<nums.length; i++)
        {
            if(i==0)
            {
                if(nums[i]!=nums[i+1])
                    return nums[i];
            }
            else if(i==nums.length-1)
            {
                if(nums[i]!=nums[i-1])
                    return nums[i];
            }
            else
            {
                if(nums[i]!=nums[i+1] && nums[i-1]!=nums[i])
                    return nums[i];
            }
        }
        return -1;
    }
}