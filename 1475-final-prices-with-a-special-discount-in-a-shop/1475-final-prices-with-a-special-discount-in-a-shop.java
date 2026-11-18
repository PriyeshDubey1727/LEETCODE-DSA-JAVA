class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] ans = prices.clone();
        Deque<int[]> st = new ArrayDeque<>();
        for(int i = 0;i<n;i++){
            while(!st.isEmpty() && st.peek()[0]>=prices[i]){
                int idx = st.pop()[1];
                ans[idx] = prices[idx]-prices[i];
            }
            st.push(new int[]{prices[i],i});
        }
        return ans;
    }
}