class Solution {

    public int search(int[] nums, int target) {
        int n = nums.length;
        int pivot = findPivot(nums);
        if (target >= nums[pivot] && target <= nums[n - 1]) {
            return binarySearch(nums, pivot, n - 1, target);
        }
        else {
            return binarySearch(nums, 0, pivot - 1, target);
        }
    }
    public int findPivot(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] > nums[e]) {
                s = mid + 1;
            } 
            else {
                e = mid;
            }
        }
        return s;
    }
    public int binarySearch(int[] nums, int s, int e, int target) {
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                s = mid + 1;
            } 
            else {
                e = mid - 1;
            }
        }
        return -1;
    }
}
