class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        solve(n, 0, 0, ans, "");
        return ans;
    }
    static void solve(int n, int s, int e, List<String> ans, String ch){
        //Base Case
        if(s==n && e==n){
            ans.add(ch);
            return;
        }
        // for opening bracket 
        if(s<n){
            solve(n, s+1, e, ans, ch+'(');
        }
        // for closing bracket 
        if(e<s){
            solve(n, s, e+1, ans, ch+')');
        }
    }
}
