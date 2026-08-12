class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int m = image[0].length;
        int[][] ans = new int[n][m];
        for(int i = 0;i<n;i++){
            int r = 0;
            int j = m-1;
            while(r<j){
                int temp = image[i][r];
                image[i][r] = image[i][j];
                image[i][j] = temp;
                r++;
                j--;
            }
        }
        for(int k = 0;k<n;k++){
            for(int l = 0;l<m;l++){
                if(image[k][l]==0){
                    ans[k][l] = 1;
                }
                else{
                    ans[k][l] = 0;
                }
            }
        }
        return ans;
    }
}
