import java.util.Deque;
import java.util.ArrayDeque;
class Solution {
    public int minSwaps(String s) {
        //creating an empty stack
        Deque<Character> st = new ArrayDeque<>();
        //length of the string 
        int n = s.length();
        int ans = minBracket(st,s,n);
        return ans;
    }
    public static int minBracket(Deque<Character> st, String s, int n){
        //if the length of the string is odd then return -1, here it will act like a redundant code
        if(n%2!=0){
            return -1;
        }
        //now im proceeding towards the cancellation logic 
        for(int i =0;i<n;i++){
            char ch = s.charAt(i);
            //if pair formed then remove it from the stack
            if(ch==']' && !st.isEmpty() && st.peek()=='['){
                st.pop();
            }
            //if not then push it into the stack ]
            else{
                st.push(ch);
            }
        } 
        // now fetching out the details of those element which doesnt form any kind of pair 
        int open = 0;
        int close = 0;
        // now checking iniside the stack 
        while(!st.isEmpty()){
            //if stacks top element is { then increase the count of open by 1
            if(st.peek()=='['){
                open++;
            }
            //if stacks top element is } then increase the count of close by 1
            else{
                close++;
            }
            //now pop each element of the stack 
            st.pop();
        }
        //now the reversals required is 
        return (open + 1) / 2;
    }
}
