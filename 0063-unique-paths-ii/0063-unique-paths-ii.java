//Memoization Approach
class Solution 
{
    public int uniquePathsWithObstacles(int[][] obstacleGrid) 
    {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        return Paths(m-1, n-1, obstacleGrid, dp);     
    }
    public int Paths(int m, int n, int[][] obstacleGrid, int dp[][])
    {
        //when obstacleGrid is null or [[1]]
        if (obstacleGrid == null || obstacleGrid[0][0] == 1) 
            return 0;
        if(m==0 && n==0)
            return 1;
        if(m>=0 && n>=0 && obstacleGrid[m][n] == 1)
            return 0;
        if(m<0 || n<0)
            return 0;
        if(dp[m][n] != 0)
            return dp[m][n];
        
        dp[m][n] = Paths(m-1, n, obstacleGrid, dp) + Paths(m, n-1, obstacleGrid, dp);

        return dp[m][n];
    }
}