class Solution {
    public int minAddToMakeValid(String s) {
        int n = s.length();
        int open = 0;
        int need = 0;
        for(int i = 0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='('){
                open++;
            }
            if(ch==')'){
                if(open>0){
                    open--;
                }
                else{
                    need++;
                }
            }
        }
        return open+need;
    }
}
