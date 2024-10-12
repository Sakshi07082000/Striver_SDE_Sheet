//OPTIMAL SOLUTION using 'Two pointer approach'

class Solution 
{
    public List<List<Integer>> threeSum(int[] nums) 
    {
        //sort array in ascending order
        Arrays.sort(nums);
        List<List<Integer>> arr = new ArrayList<>();
        
        //i is fixed, left & right will move
        for(int i=0; i<nums.length-2; i++)
        {
            // check for duplicate elements for i
            //i has moves to i++, check if previous is same as current
            if (i > 0 && nums[i] == nums[i - 1]) 
                continue;
            
            int left = i+1;               //left is next to i
            int right = nums.length-1;   //right is the last array element 
            
            while(left < right)
            {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum==0)
                {
                    arr.add(Arrays.asList(nums[i], nums[left], nums[right]));
                
                    // check for duplicate elements for left
                    while (left < right && nums[left] == nums[left + 1])
                        left++;
                    
                    // check for duplicate elements for i
                    while (left < right && nums[right] == nums[right - 1]) 
                        right--;
        
                    left++;
                    right--;
                }
                
                else if(sum<0)
                    left++;
                
                else
                    right--;
            }
        }
        return arr;
    }
}