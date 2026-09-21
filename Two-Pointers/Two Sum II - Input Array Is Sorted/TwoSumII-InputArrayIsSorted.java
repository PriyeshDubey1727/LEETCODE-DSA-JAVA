// BRUTE FORCE
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int n = nums.length;
//         for(int i=0;i<n-1;i++){
//             for(int j = i+1;j<n;j++){
//                 if(nums[i]+nums[j]==target){
//                     return new int[]{i+1,j+1};
//                 }
//             }
//         }
//         return new int[]{};
//     }
// }

//BINARY SEARCH
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int n = nums.length;
//         for(int i = 0;i<n;i++){
//             int need = target-nums[i];
//             int s = i+1;
//             int e = n-1;
//             while(s<=e){
//                 int m = s+(e-s)/2;
//                 if(nums[m]==need){
//                     return new int[]{i+1,m+1};
//                 }
//                 else if(nums[m]<need){
//                     s = m+1;
//                 }
//                 else{
//                     e = m-1;
//                 }
//             }
//         }
//         return new int[]{};
//     }
// }

//TWO POINTERS
class Solution{
    public int[] twoSum(int[] nums, int target){
        int n = nums.length;
        int i = 0;
        int j = n-1;
        while(i<j){
            int sum = nums[i]+nums[j];
            if(sum == target){
                return new int[]{i+1,j+1};
            }
            else if(sum<target){
                i++;
            }
            else{
                j--;
            }
        }
        return new int[]{};
    }
} 
