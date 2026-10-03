class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int maxLength = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }
            else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }
                else{
                    int length = i-st.peek();
                    maxLength = Math.max(length,maxLength);
                }
            }
        }
        return maxLength;
    }
}
