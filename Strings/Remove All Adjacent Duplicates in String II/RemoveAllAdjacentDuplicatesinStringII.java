class Solution {
    public String removeDuplicates(String s, int k) {
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        int[] count = new int[n];
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int index = ans.length();
            if (index > 0 && ch == ans.charAt(index - 1)) {
                count[index] = count[index - 1] + 1;
            } 
            else {
                count[index] = 1;
            }
            ans.append(ch);
            if (count[index] == k) {
                ans.delete(ans.length() - k, ans.length());
            }
        }
        return ans.toString();
    }
}
