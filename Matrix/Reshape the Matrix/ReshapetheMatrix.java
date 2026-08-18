class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length;
        int m = mat[0].length;
        if(n*m!=r*c){
            return mat;
        }
        int[][] ans = new int[r][c];
        int p = 0;
        int q = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                ans[p][q] = mat[i][j];
                q++;
                if(q==c){
                    q = 0;
                    p++;
                }
            }
        }
        return ans;
    }
}
