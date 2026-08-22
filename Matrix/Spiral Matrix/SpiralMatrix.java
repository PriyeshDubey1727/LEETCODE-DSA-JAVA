class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int srow = 0;
        int erow = n-1;
        int scol = 0;
        int ecol = m-1;
        List<Integer> result = new ArrayList<>();
        while(srow<=erow && scol<=ecol){
            for(int i = scol;i<=ecol;i++){
                result.add(matrix[srow][i]);
            }
            srow++;
            for(int j = srow;j<=erow;j++){
                result.add(matrix[j][ecol]);
            }
            ecol--;
            if(srow<=erow){
                for(int k = ecol;k>=scol;k--){
                    result.add(matrix[erow][k]);
                }
                erow--;
            }
            if(scol<=ecol){
                for(int l = erow;l>=srow;l--){
                    result.add(matrix[l][scol]);
                }
                scol++;
            }
        }
        return result;
    }
}
