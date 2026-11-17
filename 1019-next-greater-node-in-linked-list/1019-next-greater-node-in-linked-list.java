/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> lst = new ArrayList<>();
        ListNode temp = head;
        while(temp != null) {
            lst.add(temp.val);
            temp = temp.next;
        }
        int n = lst.size();
        int[] ans = new int[n];
        Deque<Integer> st = new ArrayDeque<>(); 
        for(int i = 0;i<n;i++){
            while(!st.isEmpty() && lst.get(st.peek())<lst.get(i)){
                int idx = st.pop();
                ans[idx] = lst.get(i);
            }
            st.push(i);
        }
        return ans;
    }
}