//Memoization Approach

class Solution 
{
    public int minimumTotal(List<List<Integer>> triangle) 
    {
        int r = triangle.size();
        //int c = triangle.get(0).size(); gives runtime error
        int c = triangle.get(triangle.size()-1).size();
        int[][] dp = new int[r][c];

        for(int[] row: dp)
            Arrays.fill(row, -1);

        //no fix ending point, therefore, starting from top(0,0)
        return minimum(0, 0, triangle, dp);
    }
    
    private int minimum(int r, int c, List<List<Integer>> triangle, int[][] dp) 
    {
        //if reached last row then that element should be taken
        if (r == triangle.size()-1)
            return triangle.get(r).get(c);
        
        if(dp[r][c] != -1)
            return dp[r][c];
        
        //pick the element and call recursion
        int down = triangle.get(r).get(c) + minimum(r+1, c, triangle, dp);
        int diagonal = triangle.get(r).get(c) + minimum(r+1, c+1, triangle, dp);

        dp[r][c] = Math.min(down, diagonal);

        return dp[r][c];
    }
}