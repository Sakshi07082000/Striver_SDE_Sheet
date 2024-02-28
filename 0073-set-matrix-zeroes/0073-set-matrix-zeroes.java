class Solution 
{
    public void setZeroes(int[][] matrix) 
    {
        int row=matrix.length; 
        int col=matrix[0].length;   //here its assumed that all columns of equal length
        
        int d1[]=new int[row];
        int d2[]=new int[col];
        
        // row and column array is initialized to -1
        Arrays.fill(d1,-1);
        Arrays.fill(d2,-1);
        
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(matrix[i][j]==0)
                    
             // at whichever place there is a zero in matrix there is                                       a zero in row and col array  
                    d1[i]=d2[j]=0; 
            }
        }
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                // modify the matrix according to the 0s in row and col array
                
                if(d1[i]==0 || d2[j]==0)
                    matrix[i][j]=0;
            }
        }    
    }
}