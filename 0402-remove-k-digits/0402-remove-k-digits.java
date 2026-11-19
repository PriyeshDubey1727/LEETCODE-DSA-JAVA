class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        Deque<Integer> st = new ArrayDeque<>();
        for(char ch: num.toCharArray()){
            int digit = ch-'0';
            while(!st.isEmpty() && k>0 && st.peek()>digit){
                st.pop();
                k--;
            }
            st.push(digit);
        }
        while(!st.isEmpty() && k>0){
            st.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        int idx = 0;
        while(idx<sb.length() && sb.charAt(idx)=='0'){
            idx++;
        }
        String ans = sb.substring(idx);
        if(ans.length()==0){
            return "0";
        }
        return ans;
    }
}