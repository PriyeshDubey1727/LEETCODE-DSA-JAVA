class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int m = s.length();
        int[] ans  = new int[m];
        for(int k = 0;k<m;k++){
            int i = startPos[0];
            int j = startPos[1];
            int count = 0;
            for(int x = k;x<m;x++){
                char ch = s.charAt(x);
                int ni = i;
                int nj = j;
                if(ch=='R'){
                    nj++;
                }
                else if(ch=='L'){
                    nj--;
                }
                else if(ch=='U'){
                    ni--;
                }
                else if(ch=='D'){
                    ni++;
                }
                if(ni<0 || ni>=n || nj<0 || nj>=n){
                    break;
                }
                i = ni;
                j = nj;
                count++;
            }
            ans[k] = count;
        }
        return ans;
    }
}
