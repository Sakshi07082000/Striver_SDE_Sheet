class Solution 
{
    public List<List<Integer>> subsets(int[] nums) 
    {
        //here result will store all of the possible subsets
        List<Integer> result = new ArrayList<>(nums.length);
        
        //Since total no of subsets are 2^n and subset is a list of lists
        List<List<Integer>> subsets = new ArrayList<>((int)Math.pow(2, nums.length));
        
        findSubsets(0, nums, result, subsets);
        return subsets;
    }

    void findSubsets(int idx, int[] nums, List<Integer> result, List<List<Integer>> subsets) 
    {
        //when elements are finished add the subset found in every iteration to the final              //subset list return
        
        if(idx == nums.length) 
        {
            subsets.add(new ArrayList<>(result));
            return;
        }
        
        //adding 0th index element in result
        result.add(nums[idx]);
        findSubsets(idx+1, nums, result, subsets);
        
        //not adding 0th index element in result
        result.remove(result.size()-1);
        findSubsets(idx+1, nums, result, subsets);
    }
}