class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        if(!isValid(board))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean isValid(char board[][])
    {
        return rowValid(board)&&colValid(board)&&subMatrices(board);
    }
    public boolean rowValid(char board[][])
    {
        for(int i=0;i<9;i++)
        {
            boolean seen[]=new boolean[10];
            for(int j=0;j<9;j++)
            {
                char ch=board[i][j];
                if(ch== '.')
                {
                    continue;
                }
                int num=ch-'0';
                if(num<0||num>9||seen[num])
                {
                    return false;
                }
                seen[num]=true;
            }
        }
        return true;
    }
    public boolean colValid(char board[][])
    {
        for(int j=0;j<9;j++)
        {
            boolean seen[]=new boolean[10];
            for(int i=0;i<9;i++)
            {
                char ch=board[i][j];
                if(ch=='.')
                {
                    continue;
                }
                int num=ch-'0';
                if(num<0||num>9||seen[num])
                {
                    return false;
                }
                seen[num]=true;
            }
        }
        return true;
    }
    public boolean subMatrices(char board[][])
    {
        for(int i=0;i<9;i=i+3)
        {
            for(int j=0;j<9;j=j+3)
            {
                if(!(validSub(board,i,j)))
                {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean validSub(char board[][],int startRow,int startCol)
    {
         boolean seen[]=new boolean[10];
        for(int i=startRow;i<startRow+3;i++)
        {
           
            for(int j=startCol;j<startCol+3;j++)
            {
                char ch=board[i][j];
                if(ch=='.')
                {
                    continue;
                }
                int num=ch-'0';
                if(num<0||num>9||seen[num])
                {
                    return false;
                }
                seen[num]=true;
            }
        }
        return true;
    }
}
