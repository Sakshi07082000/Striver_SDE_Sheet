class Solution 
{
    public int minPathSum(int[][] grid) 
    {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for (int row[] : dp)
            Arrays.fill(row, -1);

        return pathsum(m-1, n-1, grid, dp);    
    }

    public int pathsum(int m, int n, int[][] grid, int[][] dp)
    {
        if(grid == null)
            return 0;
        if(m==0 && n==0)
            return grid[m][n];
        //as soon at it moves out of boundry return a max value so its not considered
        if(m<0 || n<0)
            //return Integer.MAX_VALUE; is giving wrong answer
            return (int) Math.pow(10, 9);
        if(dp[m][n] != -1)
            return dp[m][n];

        int up=0, left=0;
        up = grid[m][n] + pathsum(m-1, n, grid, dp);
        left = grid[m][n] + pathsum(m, n-1, grid, dp);
        dp[m][n] = Math.min(up, left);

        return dp[m][n];
    }
}