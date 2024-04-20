class Solution 
{
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        List<Integer> ans = new ArrayList<Integer>();
        int m= matrix.length;              //no of rows
        int n=matrix[0].length;           //no of columns
        
        int top=0, left=0;
        int bottom=m-1, right=n-1;
        
        while(top<=bottom && left<=right)
            
        {for(int i=left; i<=right; i++)        //For moving left to right
            ans.add(matrix[top][i]);
        top++;
        
        for(int i=top; i<=bottom; i++)        //For moving top to bottom
            ans.add(matrix[i][right]);
        right--;
        
        if(top<=bottom)
        {for(int i=right; i>=left; i--)       //For moving right to left
            ans.add(matrix[bottom][i]);
        bottom--;
        }
         
        if(left<=right)  
        {for(int i=bottom; i>=top; i--)       //For moving bottom to top
            ans.add(matrix[i][left]);
        left++;
        }}
        return ans;
    }
}