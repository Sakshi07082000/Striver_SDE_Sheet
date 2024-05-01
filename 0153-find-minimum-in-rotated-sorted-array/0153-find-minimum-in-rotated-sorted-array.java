//Binary search approach

class Solution 
{
    public int findMin(int[] nums) 
    {
        int minval = Integer.MAX_VALUE;
        int low=0, high=nums.length-1;
        
        while(low<=high)
        {
            int mid= (low+high)/2;
            if(nums[low] <= nums[mid])
            {
                minval = Math.min(minval, nums[low]);
                low = mid+1;
            }
            else
            {
                high = mid-1;
                minval = Math.min(minval, nums[mid]);
            }
        }
        return minval;
    }
}