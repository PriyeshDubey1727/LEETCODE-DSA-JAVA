class NeighborSum {
    int[][] grid;
    int n;
    public NeighborSum(int[][] grid) {
        this.grid = grid;
        this.n = grid.length;
    }
    public int adjacentSum(int value) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == value) {
                    // Top
                    if (i > 0) {
                        sum += grid[i - 1][j];
                    }
                    // Down
                    if (i < n - 1) {
                        sum += grid[i + 1][j];
                    }
                    // Left
                    if (j > 0) {
                        sum += grid[i][j - 1];
                    }
                    // Right
                    if (j < n - 1) {
                        sum += grid[i][j + 1];
                    }
                    return sum;
                }
            }
        }
        return sum;
    }

    public int diagonalSum(int value) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == value) {
                    // Top-left
                    if (i > 0 && j > 0) {
                        sum += grid[i - 1][j - 1];
                    }
                    // Top-right
                    if (i > 0 && j < n - 1) {
                        sum += grid[i - 1][j + 1];
                    }
                    // Bottom-left
                    if (i < n - 1 && j > 0) {
                        sum += grid[i + 1][j - 1];
                    }
                    // Bottom-right
                    if (i < n - 1 && j < n - 1) {
                        sum += grid[i + 1][j + 1];
                    }
                    return sum;
                }
            }
        }
        return sum;
    }
}

/**
 * Your NeighborSum object will be instantiated and called as such:
 * NeighborSum obj = new NeighborSum(grid);
 * int param_1 = obj.adjacentSum(value);
 * int param_2 = obj.diagonalSum(value);
 */
