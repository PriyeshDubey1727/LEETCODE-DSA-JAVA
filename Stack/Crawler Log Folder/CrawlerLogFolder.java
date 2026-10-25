class Solution {
    public int minOperations(String[] logs) {
        int n = logs.length;
        int operations = 0;
        Deque<Integer> st  = new ArrayDeque<>();
        for(int i = 0;i<n;i++){
            if(logs[i].equals("../")){
                if (!st.isEmpty()) {
                    st.pop();
                }
            }
            else if(logs[i].equals("./")){
                continue;
            }
            else{
                st.push(1);
            }
        }
        return st.size();
    }
}
