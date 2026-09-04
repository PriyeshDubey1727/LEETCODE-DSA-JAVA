class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i = 0;i<n;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        for(int x:freq.keySet()){
            if(freq.get(x)>n/3){
                ans.add(x);
            }
        }
        return ans;
    }
}
