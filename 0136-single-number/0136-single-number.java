class Solution {
    public int singleNumber(int[] nums) 
    {   
        for(int i=0; i<nums.length; i++)
        {
            int count=0;            //if possible don't declare variable globally
            int num=nums[i];
            
            for(int j=0; j<nums.length; j++)
            {
                if(nums[j]==num)
                    count++;
            }
            if(count==1)
                return num;
        }
        return -1;
    }
}