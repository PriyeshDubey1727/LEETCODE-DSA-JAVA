class Solution {
    public int findLucky(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int x:arr){
            freq.put(x,freq.getOrDefault(x,0)+1);
        }
        int ans = -1;
        for(int x:freq.keySet()){
            if(freq.get(x)==x){
                ans = Math.max(ans, x);
            }
        }
        return ans;
    }
}
