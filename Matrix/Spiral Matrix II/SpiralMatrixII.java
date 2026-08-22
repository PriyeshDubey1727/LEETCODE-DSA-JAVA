class Solution {
    public int[][] generateMatrix(int n) {

        int srow = 0;
        int erow = n - 1;
        int scol = 0;
        int ecol = n - 1;
        int[][] result = new int[n][n];
        int value = 1;
        while (srow <= erow && scol <= ecol) {
            for (int i = scol; i <= ecol; i++) {
                result[srow][i] = value++;
            }
            srow++;
            for (int j = srow; j <= erow; j++) {
                result[j][ecol] = value++;
            }
            ecol--;
            if (srow <= erow) {
                for (int k = ecol; k >= scol; k--) {
                    result[erow][k] = value++;
                }
                erow--;
            }
            if (scol <= ecol) {
                for (int l = erow; l >= srow; l--) {
                    result[l][scol] = value++;
                }
                scol++;
            }
        }
        return result;
    }
}
