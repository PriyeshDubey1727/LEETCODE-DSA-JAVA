class Solution {
    public String removeDigit(String number, char digit) {
        int n = number.length();
        Deque<Integer> st = new ArrayDeque<>();
        int k = 1;
        for(int i = 0;i<n;i++){
            int dig = number.charAt(i)-'0';
            while(!st.isEmpty() && k>0 && st.peek() == digit-'0' && st.peek()<dig){
                st.pop();
                k--;
            }
            st.push(dig);
        }
        Deque<Integer> lt = new ArrayDeque<>();
        while(!st.isEmpty()) {
            int curr = st.pop();
            if(k>0 && curr==digit-'0'){
                k--;
            }
            else{
                lt.push(curr);
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!lt.isEmpty()){
            sb.append(lt.pop());
        }
        return sb.toString();
    }
}