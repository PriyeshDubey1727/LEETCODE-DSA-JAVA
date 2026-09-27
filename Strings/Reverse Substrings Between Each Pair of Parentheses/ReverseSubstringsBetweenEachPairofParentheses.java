import java.util.Deque;
import java.util.ArrayDeque;
class Solution {
    public String reverseParentheses(String s) {
        Deque<String> st = new ArrayDeque<>();
        int n = s.length();
        StringBuilder current = new StringBuilder();
        for(int i = 0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='('){
                st.push(current.toString());
                current = new StringBuilder();
            }
            else if(ch==')'){
                current.reverse();
                String previous = st.pop();
                current = new StringBuilder(previous+current);
            }
            else{
                current.append(ch);
            }
        }
        return current.toString();
    }
}
