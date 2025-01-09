//Space optimization approach

class Solution {

    public int rob(int[] nums) 
    {
        int prev1 = nums[0];
        int prev2 = 0;

        for(int i=1; i<nums.length; i++)
        {
            int pick = nums[i] + prev2;
                
            int notpick = 0 + prev1;

            int max = Math.max(pick, notpick);
            prev2 = prev1;
            prev1 = max;           
        }
        return prev1;
    }
}