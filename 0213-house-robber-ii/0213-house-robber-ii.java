class Solution 
{
    //same house robber 1
    public int rob_house(ArrayList<Integer> nums) 
    {
        int prev1 = nums.get(0);
        int prev2 = 0;

        for(int i=1; i<nums.size(); i++)
        {
            int pick = nums.get(i) + prev2;                
            int notpick = 0 + prev1;

            int max = Math.max(pick, notpick);
            prev2 = prev1;
            prev1 = max;           
        }
        return prev1;
    }

    public int rob(int[] nums)
    {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        if(nums.length == 1)
            return nums[0];

        for(int i=0; i<nums.length; i++)
        {
            //adding all of nums except 0th element
            if(i != 0)
                list1.add(nums[i]);
            //adding all of nums except (n-1)th element
            if(i != nums.length-1)
                list2.add(nums[i]);
        }
        //pass both list1 & list2 to rob_house
        //both will return a value
        //return max value
        return Math.max(rob_house(list1), rob_house(list2));
    }
}