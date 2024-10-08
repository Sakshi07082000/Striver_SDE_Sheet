class Solution 
{
    public void solveSudoku(char[][] board) 
    {
        solve(board);
    }
    
    public static boolean solve(char board[][])
    {
        for(int i=0; i<9; i++)
        {
            for(int j=0; j<9; j++)
            {
                //check if any box in board is empty
                if(board[i][j] == '.')
                {
                    for(char ch = '1'; ch <= '9'; ch++)
                    {
                        //if empty, check which digit can fit
                        if(validation(board, i, j, ch))
                        {
                            board[i][j] = ch;
                            
                            if(solve(board))
                                return true;
                            else
                                board[i][j] = '.';
                        }    
                    }
                     //false is returned to if(solve(board)) function call
                    return false;
                }
            }
        }
        //when everything is filled then finally return true
        return true;
    }
    
    public static boolean validation(char board[][], int row, int col, char ch)
    {
        for(int i=0; i<9; i++)
        {
            //check for row
            if(board[i][col] == ch)
                return false;
            
            //check for column
            if(board[row][i] == ch)
                return false;
            
            //check for 3x3 box
            if(board[3*(row/3) + (i/3)][3*(col/3) +i%3] == ch)
                return false;
        }
        return true;
    }    
}