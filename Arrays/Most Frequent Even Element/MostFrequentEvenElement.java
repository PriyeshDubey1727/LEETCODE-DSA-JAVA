class Solution {
    public int mostFrequentEven(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int x:nums){
            if(x%2==0){
                freq.put(x,freq.getOrDefault(x,0)+1);
            }
        }
        int ans = -1;
        int maxFreq = 0;
        for(int x:freq.keySet()){
            if(freq.get(x)>maxFreq){
                maxFreq = freq.get(x);
                ans = x;
            }
            else if(freq.get(x)==maxFreq && x<ans){
                ans = x;
            }
        }
        return ans;
    }
}
