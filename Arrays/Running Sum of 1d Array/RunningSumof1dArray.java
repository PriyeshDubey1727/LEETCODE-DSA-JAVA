// class Solution {
//     public int[] runningSum(int[] nums) {
//         int n = nums.length;
//         int sum = 0;
//         int[] runningSum = new int[n];
//         for(int i = 0;i<n;i++){
//             sum+=nums[i];
//             runningSum[i]=sum;
//         }
//         return runningSum;
//     }
// }

class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = nums[0];
        for(int i = 1;i<n;i++){
            prefixSum[i] = prefixSum[i-1]+nums[i];
        }
        return prefixSum;
    }
}
