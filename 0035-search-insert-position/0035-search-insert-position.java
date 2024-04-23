class Solution 
{
    public int searchInsert(int[] nums, int target) 
    {
        int start = 0;
        int end = nums.length-1;
        int ans = nums.length;
        
        if (target<nums[0])
            return 0;
        
        while (start<=end) 
        {
            int mid = (start + end) / 2;
            
            if (nums[mid] >= target)     //lower bound binary search where target is
                                        //less than or equal to mid
            {
                ans = mid;
                end = mid-1;
            }
            else 
                start = mid+1;
        }
        return ans;
    }
}