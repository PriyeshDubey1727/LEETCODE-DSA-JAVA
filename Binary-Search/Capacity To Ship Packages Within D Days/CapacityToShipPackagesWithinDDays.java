class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0;
        int s = 0;
        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];
            s = Math.max(s, weights[i]);
        }
        int e = sum;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isValid(weights, days, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }
    static boolean isValid(int[] weights, int days, int capacity) {
        int sum = 0;
        int count = 1;
        for (int i = 0; i < weights.length; i++) {
            if (sum + weights[i] <= capacity) {
                sum += weights[i];
            } else {
                count++;
                sum = weights[i];
            }
        }
        return count <= days;
    }
}
