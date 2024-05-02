//Binary search approach

class Solution 
{
    public int findPeakElement(int[] nums) 
    {
        if(nums.length==1 || nums[0]>nums[1])     //check for single or first element
            return 0;
        if(nums[nums.length-1]>nums[nums.length-2])  //check for last element
            return nums.length-1;
        
        int low=1, high=nums.length-2;
        while(low<=high)
        {
            int mid = (low+high)/2;
            
            //check if mid is peak
            if(nums[mid-1]<nums[mid] && nums[mid]>nums[mid+1]) 
                return mid;
            
            //check if mid is on dec or inc curve, in inc curve eliminate left
            else if(nums[mid]>nums[mid+1])
                high = mid-1;
            else 
                //eliminate right since mid in dec curve
                low = mid+1;
        }
        return -1;
    }
}