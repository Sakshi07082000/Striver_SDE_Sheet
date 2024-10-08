class Solution 
{
    public List<List<String>> solveNQueens(int n) 
    {
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
                board[i][j] = '.';
        List<List<String>> ans = new ArrayList<List<String>>();
        nqueen(0, board, ans);
        return ans;
    }
    
    //CHECKING if Q can be placed or not
    static boolean validate(char board[][], int row, int col)
    {
        //upper diagonal check, therefore, both row,col decreases
        int store_row = row;
        int store_col = col;
        while(row >= 0 && col >= 0)
        {
            if(board[row][col] == 'Q')
                return false;
            row--;
            col--;
        }
        
        //check column, therefore, only col decreases
        row = store_row;
        col = store_col;
        while(col >= 0)
        {
            if(board[row][col] == 'Q')
                return false;
            col--;
        }
        
        //lower diagonal, therefore row will increase and col will dec
        row = store_row;
        col = store_col;
        while(row < board.length && col >= 0)
        {
            if(board[row][col] == 'Q')
                return false;
            row++;
            col--;
        }
        return true;
    }
    
    static void nqueen(int col, char board[][], List<List<String>> ans)
    {
        //BASE CASE. When reached end of col all the restltant board to res
        if(col == board.length)
        {
            ans.add(convert(board));
            return;
        }
        for(int row = 0; row < board.length; row++)
        {
            if(validate(board, row, col))
            {
                board[row][col] = 'Q';
                nqueen(col+1, board, ans);
                //back tracking to remove the wrongly placed queen
                board[row][col] = '.';
            }
        }
    }         
    
    //CONVERTS a 2D matrix into list of string
    //SINCE answer should be returned as a list of list of Strings
    static List<String> convert(char[][] board) 
    {
        List<String> res = new LinkedList<>();
        for (int i = 0; i < board.length; i++) 
        {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
}