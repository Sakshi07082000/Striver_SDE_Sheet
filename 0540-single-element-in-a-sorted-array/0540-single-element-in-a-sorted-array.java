//Brute force approach

class Solution 
{
    public int singleNonDuplicate(int[] nums) 
    {
        int single=0;
        if(nums.length == 1)                  //if only one element return that element
        {
            return nums[0];
        }
        for(int i=0; i<nums.length; i++)
        {
            if(i==0)                         //first element compared with its next element
            {
                if(nums[i]!=nums[i+1])
                    return nums[i];
            }
            else if(i==nums.length-1)       //last element compared with its prev element
            {
                if(nums[i]!=nums[i-1])
                    return nums[i];
            }
            else                          //middle elements compared with both next and prev
            {
                if(nums[i]!=nums[i+1] && nums[i-1]!=nums[i])
                    return nums[i];
            }
        }
        return -1;
    }
}