import java.util.TreeSet;

class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        TreeSet<Long> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            long current = nums[i];
            long lower = current - valueDiff;
            long upper = current + valueDiff;
            Long value = set.ceiling(lower);
            if (value != null && value <= upper) {
                return true;
            }
            set.add(current);
            if (i >= indexDiff) {
                set.remove((long) nums[i - indexDiff]);
            }
        }
        return false;
    }
}
