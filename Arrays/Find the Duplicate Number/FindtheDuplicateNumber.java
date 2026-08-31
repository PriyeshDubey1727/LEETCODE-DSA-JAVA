class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> ans = new HashMap<>();
        for(int x:nums){
            ans.put(x,ans.getOrDefault(x,0)+1);
        }
        for(int x:ans.keySet()){
            if(ans.get(x)>1){
                return x;
            }
        }
        return -1;
    }
}
