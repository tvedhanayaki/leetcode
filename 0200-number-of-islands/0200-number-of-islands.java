class Solution 
{
    public void solve(char[][] grid,int n,int m,int row,int col)
    {
        if(row==-1 || col==-1 || row==n || col==m || grid[row][col]=='0')
        {
           return;
        }
        else 
        {
           grid[row][col] = '0'; 
           solve(grid,n,m,row-1,col); 
            solve(grid,n,m,row+1,col); 
             solve(grid,n,m,row,col-1); 
              solve(grid,n,m,row,col+1); 

        }
    }
    public int numIslands(char[][] grid)
    {
         int n,m; 
         n = grid.length; 
         m = grid[0].length; 
         int row,col,count=0; 
         for(row=0;row<=n-1;row++)
         {
            for(col=0;col<=m-1;col++)
            {
                if(grid[row][col]=='1')
                { 
                     count++;
                    solve(grid,n,m,row,col);
                }
            }
         } 
         return count;
    }
}