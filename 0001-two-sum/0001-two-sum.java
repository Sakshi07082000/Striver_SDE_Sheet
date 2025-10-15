class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        //map stored key value pairs
        //since we need to return intex, therefor, numbers in array is key and index is value
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            int diff = target - nums[i];
            if(map.containsKey(diff))
                //map.get will return the value(index) associated with the key(array numbers)
                return new int[]{map.get(diff), i};
            
            //pushing array elements into map along with its index value
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}