class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] ch1 = word1.toCharArray();
        char[] ch2 = word2.toCharArray();
        int n = ch1.length;
        int m = ch2.length;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i<n || i<m){
            if(i<n){
                sb.append(ch1[i]);
            }
            if(i<m){
                sb.append(ch2[i]);
            }
            i++;
        }
        return sb.toString();
    }
}
