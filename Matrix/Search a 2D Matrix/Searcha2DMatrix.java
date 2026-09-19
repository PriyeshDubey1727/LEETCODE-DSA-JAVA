// BRUTE FORCE 
// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         int n = matrix.length;
//         int m = matrix[0].length;
//         for(int i = 0;i<n;i++){
//             for(int j = 0;j<m;j++){
//                 if(matrix[i][j]==target){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }


// Using BINARY SEARCH 
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int s = 0;
        int e = n*m-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            int row = mid/m;
            int col = mid%m;
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]<target){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return false;
    }
}
