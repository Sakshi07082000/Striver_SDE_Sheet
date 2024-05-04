//Optimal approach(matrix sorted as 1,4,7,11,15 -> 19,22,24,30 and so on... )

class Solution 
{
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        int m =matrix.length, n= matrix[0].length;
        int row=0, col=n-1;   //start from first row last col, i.e, element 15
        
        while(row<m && col>=0)
        {
            if(matrix[row][col] == target)
                return true;
            if(matrix[row][col] > target)
                col--;
            else
                row++;
        }
        return false;
    }
}