class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer,Integer> ans = new HashMap<>();
        for(int x : nums){
            ans.put(x,ans.getOrDefault(x,0)+1);
        }
        int xor = 0;
        for(int x:ans.keySet()){
            if(ans.get(x)==2){
                xor^=x;
            }
        }
        return xor;
    }
}
