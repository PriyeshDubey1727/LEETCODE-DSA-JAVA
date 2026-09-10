class Solution {
    public double minimumAverage(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int left = 0;
        int right = n-1;
        double minAverage = Integer.MAX_VALUE;
        while(left<right){
            int maxElement = nums[right];
            int minElement = nums[left];
            double average = (minElement+maxElement)/2.0;
            minAverage = Math.min(minAverage,average);
            left++;
            right--;
        }
        return minAverage;
    }
}
