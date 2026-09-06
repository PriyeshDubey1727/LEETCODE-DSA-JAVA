class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        int[] nums = new int[right-left+1];
        int n = nums.length;
        for(int i = 0;i<n;i++){
            nums[i] = left+i;
        }
        for(int i = 0;i<n;i++){
            int original = nums[i];
            int num = original;
            boolean isSelfDividing = true;
            while(num!=0){
                int digits = num%10;
                if(digits==0 || original%digits!=0){
                    isSelfDividing = false;
                    break;
                }
                num/=10;
            }
            if(isSelfDividing){
                ans.add(original);
            }
        }
        return ans;
    }
}
