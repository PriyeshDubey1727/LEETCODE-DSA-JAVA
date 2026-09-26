class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ans = new int[2];
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num:nums){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        int k = 0;
        for(int x:freq.keySet()){
            if(freq.get(x)==2){
                ans[k] = x;
                k++;
            }
        }
        return ans;
    }
}
