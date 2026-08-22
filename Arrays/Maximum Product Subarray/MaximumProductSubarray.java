class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int product = nums[i];
            int tempMax = Math.max(product,Math.max(maxProduct * product, minProduct * product));
            minProduct = Math.min(product,Math.min(maxProduct * product, minProduct * product));
            maxProduct = tempMax;
            result = Math.max(result, maxProduct);
        }
        return result;
    }
}
