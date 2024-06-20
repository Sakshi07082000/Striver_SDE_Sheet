class Solution 
{
    public List<List<Integer>> subsetsWithDup(int[] nums) 
    {
        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        findsum(0, nums, current, answer);
        return answer;
    }
    
    void findsum(int index, int[] nums, List<Integer> current, List<List<Integer>> answer)
    {
        answer.add(new ArrayList<>(current));
        for(int i=index; i<nums.length; i++)
        {
            //check for duplicate elements
            //if ind=2 the i= 2 to end
            //if ind == i then first occurence and not dupe
            if(i!=index && nums[i]==nums[i-1])
                continue;
            current.add(nums[i]);
            findsum(i+1, nums, current, answer);
            current.remove(current.size()-1);
        }
    }
}