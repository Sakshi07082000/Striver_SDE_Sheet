// Brute force approach

class Solution 
{
    public List<Integer> majorityElement(int[] nums) 
    {
        List<Integer> list = new ArrayList<Integer>(); 
        
        for (int i = 0; i < nums.length; i++) 
        {
            // for[2,2] o/p must be [2] and not [2,2]
            // therefore, checking if en element already present in list
            //only 0th index is checked, as soon as list index 1 size becomes 2 and break
            if (list.size() == 0 || list.get(0) != nums[i]) 
            {
                int count = 0;
                for (int j = i; j < nums.length; j++) 
                {
                    if (nums[i] == nums[j]) 
                        count++;
                }
                if (count > (nums.length / 3))
                    list.add(nums[i]);
            }
            if (list.size() == 2) 
                break;
        }
        return list;
    }
}