class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;
        Set<Integer> ans = new HashSet<>();
        for(int i = 0;i<n;i++){
            ans.add(nums[i]);
        }
        int p = k;
        while(ans.contains(p)){
            p+=k;
        }
        return p;
    }
}
