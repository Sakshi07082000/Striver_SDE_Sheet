//Binary search approach

class Solution 
{
    public int singleNonDuplicate(int[] nums) 
    {
        if(nums.length == 1)                  //if only one element return that element
            return nums[0];
        if(nums[0]!=nums[1])                 //check to remove edge case, for first element
            return nums[0];
        if(nums[nums.length-1]!=nums[nums.length-2])   //remkove edge case for last element
            return nums[nums.length-1];
        
        int low=1, high=nums.length-2;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1])   //check if middle element is single
                return nums[mid];
            
            //check for even odd pairs and eliminate the side having it
            
            if((mid%2==1 && nums[mid-1]==nums[mid]) || (mid%2==0 && nums[mid]==nums[mid+1]))
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}