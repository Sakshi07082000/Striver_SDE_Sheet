class Solution 
{
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        List<Integer> ans = new ArrayList<Integer>();
        int m= matrix.length;              //no of rows
        int n=matrix[0].length;            //no of columns
        
        int top=0, left=0;
        int bottom=m-1, right=n-1;
        
        while(top<=bottom && left<=right)
            
        {
            for(int i=left; i<=right; i++)                      //For moving left to right
                ans.add(matrix[top][i]);                        //row is constant col changes
            top++;
        
            for(int i=top; i<=bottom; i++)                     //For moving top to bottom
                ans.add(matrix[i][right]);                    //col is constant row changes
            right--;
        
            if(top<=bottom)   //in case of single row mat
            {                //no right to left should happen
                for(int i=right; i>=left; i--)                   //For moving right to left
                    ans.add(matrix[bottom][i]);                 //row is constant col changes
                bottom--;
            }
         
            if(left<=right)  //in case of single row mat
            {               //no bottom to top should happen
                for(int i=bottom; i>=top; i--)                 //For moving bottom to top
                    ans.add(matrix[i][left]);                 //col is constant row changes
                left++;
            }
        }
        return ans;
    }
}