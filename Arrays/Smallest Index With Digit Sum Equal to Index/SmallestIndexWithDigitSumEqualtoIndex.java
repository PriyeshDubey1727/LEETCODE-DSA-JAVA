// In this i have seperately handle the elements of single digit and more than one digit 
// class Solution {
//     public int smallestIndex(int[] nums) {
//         int n = nums.length;
//         for(int i = 0;i<n;i++){
//             int k = nums[i];
//             if(k<10){
//                 if(k==i){
//                     return i;
//                 }
//                 continue;
//             }
//             int sum = 0;
//             while(k>=10){
//                 int digits = k%10;
//                 sum = sum+digits;
//                 k/=10;
//             }
//             sum = sum + k;
//             if(sum==i){
//                 return i;
//             }
//         }
//         return -1;
//     }
// }


//in this code i have tried to solve it at single place 
class Solution {
    public int smallestIndex(int[] nums){
        int n = nums.length;
        for(int i = 0;i<n;i++){
            int k = nums[i];
            int sum = 0;
            while(k>0){
                int digits = k%10;
                sum = sum + digits;
                k/=10;
            }
            if(sum==i){
                return i;
            }
        }
        return -1;
    }
}
