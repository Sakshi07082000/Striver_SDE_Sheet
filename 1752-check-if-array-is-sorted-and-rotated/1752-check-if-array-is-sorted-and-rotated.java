class Solution 
{
    public boolean check(int[] nums) 
    {
        int count= 0;   //this count no of rotations
        for(int i=0; i<nums.length-1; i++)
        {
            if(nums[i]>nums[i+1])   // checks if array proceeds in non-decreasing order
                count++;
        }
        if(nums[0]<nums[nums.length-1])  //check for rotation
            count++;
        if(count<=1)        
            return true;
        return false;
    }
}