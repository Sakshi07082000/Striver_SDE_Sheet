class Solution 
{
    public int minFallingPathSum(int[][] matrix) 
    {
        int min = Integer.MAX_VALUE;
        int row = matrix.length;
        int col = matrix[0].length;

        int[][] dp = new int[row][col];
        for(int[] r : dp)
            Arrays.fill(r, Integer.MAX_VALUE);

        //last row(row-1) is fixed but col can be 0, 1, 2,....
        for(int j = 0; j<col; j++)
        {
            int temp = minimum(row-1, j, matrix, dp);
            min = Math.min(min, temp);
        }
        return min;
    }

    public int minimum(int r, int c, int[][] matrix, int[][] dp)
    {
        if(r < 0 || c < 0 || c > matrix[0].length-1)
            //Integer.MAX_VALUE is giving wrong answer for negative values
            return (int) Math.pow(10, 9);

        if(r == 0)
            return matrix[r][c];
        
        if(dp[r][c] != Integer.MAX_VALUE)
            return dp[r][c];
        
        int up = matrix[r][c] + minimum(r-1, c, matrix, dp);
        int left = matrix[r][c] + minimum(r-1, c-1, matrix, dp);
        int right = matrix[r][c] + minimum(r-1, c+1, matrix, dp);

        dp[r][c] = Math.min(up, Math.min(left, right));

        return dp[r][c];
    }
}