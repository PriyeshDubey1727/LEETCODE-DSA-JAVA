class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n = pushed.length;
        int m = popped.length;
        if(n!=m){
            return false;
        }
        int j = 0;
        Deque<Integer> st = new ArrayDeque<>();
        for(int i = 0;i<n;i++){
            st.push(pushed[i]);
            while(!st.isEmpty() && j<m && st.peek()==popped[j]){
                st.pop();
                j++;
            }
        }
        return st.isEmpty();
    }
}
