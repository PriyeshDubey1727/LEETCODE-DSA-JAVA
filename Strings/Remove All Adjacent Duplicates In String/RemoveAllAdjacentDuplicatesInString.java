class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for(int i = 0;i<n;i++){
            char ch = s.charAt(i);
            //comparing ans ke rightmost character ko current character se
            if(sb.length()>0 && ch==sb.charAt(sb.length()-1)){
                sb.deleteCharAt(sb.length()-1);
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
