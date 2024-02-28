class Solution 
{
    public List<List<Integer>> generate(int numRows) 
    {

    //2D array list to store pascle triangle
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();

    //1D array list to store separate rows of triangle
        List<Integer> row, num= null;

        for(int i=0; i<numRows; i++)
        {
            row = new ArrayList<Integer>();

            for(int j=0; j<=i; j++)
               {
                    if(j==0 || j==i)
                    row.add(1);

                    else
                    row.add(num.get(j-1) + num.get(j));
               } 

               // row to num so that we know the wlwments of prev row
                num=row;
                triangle.add(row);
        }    
         return triangle;          
    }
}