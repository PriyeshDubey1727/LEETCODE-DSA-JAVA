import java.util.Deque;
import java.util.ArrayDeque;
class Solution {
    public boolean isValid(String s) {
        //Create the Stack first
        Deque<Character> st = new ArrayDeque<>();
        int n = s.length();
        //Traverse the String s from left to right
        for(int i = 0;i<n;i++){
            char ch = s.charAt(i);
            //If the current character is a or b then push it onto the stack 
            if(ch=='a' || ch=='b'){
                st.push(ch);
            }
            else if(ch=='c'){
                //size of stack should be greater than 2
                if(st.size()<2){
                    return false;
                }
                //stack top should be b first 
                if(st.peek()!='b'){
                    return false;
                }
                st.pop();
                //stack top should be a after b
                if(st.peek()!='a'){
                    return false;
                }
                st.pop();
            }
        }  
        //if stack is empty then return true else false
        return st.isEmpty(); 
    }
}
