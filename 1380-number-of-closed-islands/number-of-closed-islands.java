class Solution {
    int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};
    public int closedIsland(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int count=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0){
                    if(dfs(grid,i,j)) count++;
                }
            }
        }

        return count;
    }

    boolean dfs(int[][] grid,int r,int c){
        int m=grid.length;
        int n=grid[0].length;

        if(r<0||r>=m||c<0||c>=n)
            return false;

        if(grid[r][c]==1)
            return true;

        grid[r][c]=1;

        boolean closed=true;

        for(int[] d:dir){
            if(!dfs(grid,r+d[0],c+d[1]))
                closed=false;
        }

        return closed;

    }
}