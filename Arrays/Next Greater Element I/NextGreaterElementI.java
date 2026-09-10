class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] ans = new int[n];
        for(int i = 0;i<n;i++){
            int index = -1;
            for(int j = 0;j<m;j++){
                if(nums1[i]==nums2[j]){
                    index = j;
                    break;
                }
            }
            ans[i] = -1;
            for(int j = index+1;j<m;j++){
                if(nums1[i]<nums2[j]){
                    ans[i] = nums2[j];
                    break;
                }
            }
        }
        return ans;
    }
}
