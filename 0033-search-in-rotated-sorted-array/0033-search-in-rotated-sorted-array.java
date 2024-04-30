class Solution 
{
    public int search(int[] nums, int target) 
    {
        int low=0, high=nums.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
             if(nums[mid]==target)
                 return mid;
            
            //Left sorted
            if(nums[low]<= nums[mid])
            {
                if(nums[low]<=target && target<=nums[mid])   //traget is btw low & mid, ie, on left side
                    high = mid-1;                           //eliminate right
                
                else
                    low = mid+1;                           //else eliminate left
            }
            
            //Right sorted
            else
            {
                if(nums[mid]<=target && target<=nums[high])   //traget is btw mid & high, ie, on rightt side
                    low = mid+1;                               //else eliminate left
                
                else
                    high = mid-1;                           //eliminate right
            }
        }
        return -1;
    }
}