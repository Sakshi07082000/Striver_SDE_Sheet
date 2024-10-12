class Solution 
{
    public List<List<Integer>> fourSum(int[] nums, int target) 
    {
        Arrays.sort(nums);
        List<List<Integer>> arr = new ArrayList<>();
        
        //i & j are fixed, left & right will move
        for(int i=0; i<nums.length-3; i++)
        {
            // check for duplicate elements for i
            //i has moved to i++, check if previous is same as current
            if (i > 0 && nums[i] == nums[i - 1]) 
                continue;
                
            for(int j=i+1; j<nums.length-2; j++)
            {
                // check for duplicate elements for i
                //j has moved to j++, check if previous is same as current
                if (j > i+1 && nums[j] == nums[j - 1]) 
                    continue;
                
                int left = j+1;               //left is next to j
                int right = nums.length-1;   //right is the last array element 
            
                while(left < right)
                {
                    //remember to add 'long', else wrong answer
                    long sum = (long)nums[i] + (long)nums[j] + (long)nums[left] + (long)nums[right];
                
                    if(sum == target)
                    {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[left]);
                        temp.add(nums[right]);
                        arr.add(temp);
                        
                        //arr.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                
                        // check for duplicate elements for left
                        while (left < right && nums[left] == nums[left + 1])
                            left++;
                    
                        // check for duplicate elements for i
                        while (left < right && nums[right] == nums[right - 1]) 
                            right--;
        
                        left++;
                        right--;
                    }
                
                    else if(sum < target)
                        left++;

                    else
                        right--;
                }
            }
        }
        return arr;
    }
}