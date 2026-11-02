import java.util.Deque;
import java.util.ArrayDeque;
class Solution {
    public boolean canBeValid(String s, String locked) {
        int n = s.length();
        if (n % 2 != 0) {
            return false;
        }
        Deque<Integer> open = new ArrayDeque<>();
        Deque<Integer> unlocked = new ArrayDeque<>();
        StringBuilder modified = new StringBuilder(s);
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            char lh = locked.charAt(i);
            if (lh == '0') {
                unlocked.push(i);
            }
            else if (ch == '(') {
                open.push(i);
            }
            else {
                if (!open.isEmpty()) {
                    open.pop();
                }
                else if (!unlocked.isEmpty()) {
                    int index = unlocked.pop();
                    modified.setCharAt(index, '(');
                }
                else {
                    return false;
                }
            }
        }
        while (!open.isEmpty()) {
            if (unlocked.isEmpty()) {
                return false;
            }
            int openIndex = open.pop();
            int unlockedIndex = unlocked.pop();
            if (openIndex > unlockedIndex) {
                return false;
            }
            modified.setCharAt(unlockedIndex, ')');
        }
        int count = unlocked.size();
        for (int i = 0; i < count; i++) {
            int index = unlocked.pop();
            if (i < count / 2) {
                modified.setCharAt(index, ')');
            }
            else {
                modified.setCharAt(index, '(');
            }
        }
        Deque<Character> st = new ArrayDeque<>();
        return validParenthesis(st, modified.toString(), n);
    }

    public static boolean validParenthesis(Deque<Character> st, String s, int n) {
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } 
            else {
                if (st.isEmpty()) {
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }
}
