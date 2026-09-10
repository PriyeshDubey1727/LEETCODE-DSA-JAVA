class Solution {
    public int distinctAverages(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int left = 0;
        int right = n-1;
        HashSet<Integer> set = new HashSet<>();
        while(left<right){
            int max = nums[right];
            int min = nums[left];
            int average = max + min;
            set.add(average);
            right--;
            left++;
        }
        return set.size();
    }
}
