class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        int s = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            s = Math.max(s, nums[i]);
        }
        int e = sum;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isValid(nums, k, mid)) {
                ans = mid;
                e = mid - 1;
            } 
            else {
                s = mid + 1;
            }
        }
        return ans;
    }
    static boolean isValid(int[] nums, int k, int mid) {
        int sum = 0;
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            if (sum + nums[i] <= mid) {
                sum += nums[i];
            } 
            else {
                count++;
                sum = nums[i];
            }
        }
        return count <= k;
    }
}
