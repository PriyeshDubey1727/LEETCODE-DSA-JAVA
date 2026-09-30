// Using HashMap approach, time complexity O(n) ans space complexity O(n)
class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ans = new int[2];
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int x:nums){
            freq.put(x,freq.getOrDefault(x,0)+1);
        }
        int i = 0;
        for(int x:freq.keySet()){
            if(freq.get(x)==1){
                ans[i++] = x;
            }
        }
        return ans;
    }
}

