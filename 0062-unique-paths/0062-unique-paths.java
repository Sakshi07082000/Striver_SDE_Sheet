//Recursive code without memoization

//class Solution{
//    public int countPaths(int i, int j, int m, int n){
//        if(i==(m-1) && j==(n-1))
//            return 1;
//        if(i>=m || j>=n)
//            return 0;
//        else
//            return (countPaths(i+1, j, m, n) + countPaths(i, j+1, m, n));
//    public int uniquePaths(int m, int n){
//        return countPaths(0,0, m, n);}}



//Recursive solution with memoization
//Without memoization java gives TLE

class Solution 
{
    public int countPaths(int i, int j, int m, int n, int dp[][]) //dp is initialized to all 0
    {
        if(i==(m-1) && j==(n-1))
            return 1;
        if(i>=m || j>=n)
            return 0;
        
        // value of the state ((1,1) etc) already visited will have an upated value
        // if value anything but 0 no need to make another recursive call
        // else update dp
        if(dp[i][j] != 0)   
            return dp[i][j];
        else
            dp[i][j] = countPaths(i+1, j, m, n, dp) + countPaths(i, j+1, m, n, dp);
        return dp[i][j];
    }
    
    public int uniquePaths(int m, int n) 
    {
        int dp[][]= new int[m][n];
        return countPaths(0,0, m, n, dp);
    }
}