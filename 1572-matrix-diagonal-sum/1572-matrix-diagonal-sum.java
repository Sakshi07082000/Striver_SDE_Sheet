class Solution 
{
    public int diagonalSum(int[][] mat) 
    {
        int sum=0; 
        
        for(int i=0; i<mat.length; i++)
        {
            for(int j=0; j<mat.length; j++)
            {
                if(i == j)
                    sum = sum + mat[i][j];      
            }
        }
        System.out.println(sum);
        
        int j=mat.length-1;
        for(int i=0; i<mat.length; i++)
        {
            while( j >=0)
            {
                if(i==j)
                {
                    j--;
                    break;
                }   
                else
                {
                    sum = sum + mat[i][j];
                    j--;
                    break;
                }
                
            }
        }
        
        return sum;
    }
}