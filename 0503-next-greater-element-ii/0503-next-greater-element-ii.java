import java.util.*;
import java.util.Deque;
import java.util.ArrayDeque;
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Deque<Integer> st = new ArrayDeque<>();
        for(int i = 0;i<n;i++){
            ans[i] = -1;
        }
        for(int i = 0;i<2*n;i++){
            int index = i%n;
            while(!st.isEmpty() && nums[st.peek()]<nums[index]){
                int idx = st.pop();
                ans[idx] = nums[index];
            }
            if(i<n){
                st.push(index);
            }
        }
        return ans;
    }
}