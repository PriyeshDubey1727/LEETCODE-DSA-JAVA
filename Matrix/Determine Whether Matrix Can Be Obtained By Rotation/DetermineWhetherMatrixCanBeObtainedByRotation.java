class Solution { 
    public boolean findRotation(int[][] mat, int[][] target) { 
        int n = mat.length; 
        for(int k = 0;k<4;k++){
            boolean same = true;
            for(int i = 0;i<n;i++){ 
                for(int j = 0;j<n;j++){ 
                    if(mat[i][j] != target[i][j]){
                        same = false;
                        break;
                    }
                }
                if(!same){
                    break;
                }
            }
            if(same){
                return true;
            }
            for(int i = 0;i<n;i++){ 
                for(int j = i+1;j<n;j++){ 
                    int temp = mat[i][j]; 
                    mat[i][j] = mat[j][i]; 
                    mat[j][i] = temp; 
                } 
            } 
            for(int i = 0;i<n;i++){ 
                int l = 0; 
                int r = n-1; 
                while(l<r){ 
                    int temp = mat[i][l]; 
                    mat[i][l] = mat[i][r]; 
                    mat[i][r] = temp; 
                    l++; 
                    r--; 
                } 
            } 
        }
        return false;
    } 
}
