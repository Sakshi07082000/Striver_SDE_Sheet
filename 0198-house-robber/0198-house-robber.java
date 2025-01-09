//Memoization approach

class Solution {
    public int house_rob(int index, int[] nums, int[] dp) {
        if (index == 0)
            return nums[index];
        if (index < 0)
            return 0;
        if(dp[index] != -1)
            return dp[index];

        int pick = nums[index] + house_rob(index - 2, nums, dp);
        int notpick = 0 + house_rob(index - 1, nums, dp);

        return dp[index] = Math.max(pick, notpick);
    }

    public int rob(int[] nums) 
    {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return house_rob(nums.length - 1, nums, dp);
    }
}