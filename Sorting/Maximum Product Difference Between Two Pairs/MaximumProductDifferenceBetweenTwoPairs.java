class Solution {
    public int maxProductDifference(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int c = nums[0];
        int d = nums[1];
        int b = nums[n-2];
        int a = nums[n-1];
        return (a * b) - (c * d);
    }
}
