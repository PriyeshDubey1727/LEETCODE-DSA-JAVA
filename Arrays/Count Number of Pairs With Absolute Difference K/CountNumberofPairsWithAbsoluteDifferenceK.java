import java.util.Arrays;

class Solution {
    public int countKDifference(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int diff = nums[j] - nums[i];
                if (diff == k) {
                    count++;
                }
                else if(diff>k){
                    break;
                }
            }
        }
        return count;
    }
}
