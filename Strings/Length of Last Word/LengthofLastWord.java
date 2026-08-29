class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length()-1;
        while(i>=0){
            while(i>=0 && s.charAt(i)==' '){
                i--;
            }
            if(i<0){
                break;
            }
            int j = i;
            while(j>=0 && s.charAt(j)!=' '){
                j--;
            }
            return s.substring(j + 1, i + 1).length();
        }
        return 0;
    }
}
