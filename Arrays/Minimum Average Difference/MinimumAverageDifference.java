class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        long[] prefixSum = new long[n];
        long[] suffixSum = new long[n];
        prefixSum[0] = nums[0];
        for(int i = 1;i<n;i++){
            prefixSum[i] = prefixSum[i-1]+nums[i];
        }
        suffixSum[n-1] = nums[n-1];
        for(int i = n-2;i>=0;i--){
            suffixSum[i] = suffixSum[i+1]+nums[i];
        }
        int ans = 0;
        long minDifference = Long.MAX_VALUE;
        for(int i = 0;i<n;i++){
            long leftAverage = prefixSum[i]/(i+1);
            long rightAverage = 0;
            if(i!=n-1){
                rightAverage = suffixSum[i+1]/(n-i-1);
            }
            long difference = Math.abs(leftAverage-rightAverage);
            if(difference<minDifference){
                minDifference = difference;
                ans = i;
            }
        }
        return ans;
    }
}
