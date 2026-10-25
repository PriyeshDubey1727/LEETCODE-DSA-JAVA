class Solution {
    int n;
    int m;
    public int closedIsland(int[][] grid) {
        n = grid.length;
        m = grid[0].length;
        int count = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j]==0){
                    if(dfs(grid,i,j)){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    private boolean dfs(int[][] grid, int i, int j){
        if(i<0 || i>=n || j<0 || j>=m){
            return false;
        }
        if(grid[i][j]==1){
            return true;
        }
        grid[i][j] = 1;
        boolean up = dfs(grid,i-1,j);
        boolean down = dfs(grid,i+1,j);
        boolean left = dfs(grid,i,j-1);
        boolean right = dfs(grid,i,j+1);

        return up && down && left && right;
    }
}
