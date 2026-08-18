class Solution {
    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int n = price.length;
        int s = 0;
        int e = price[n - 1] - price[0];
        int ans = 0;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isValidAns(price, mid, k)) {
                ans = mid;
                s = mid + 1;
            } 
            else {
                e = mid - 1;
            }
        }
        return ans;
    }
    static boolean isValidAns(int[] price, int mid, int k) {
        int count = 1;
        int last = price[0];
        for (int i = 1; i < price.length; i++) {
            if (price[i] - last >= mid) {
                count++;
                last = price[i];
                if (count >= k) {
                    return true;
                }
            }
        }
        return false;
    }
}
