class Solution {
    public int[] decode(int[] encoded) {
        int n = encoded.length+1;
        int[] perm = new int[n];
        int x = 0;
        for(int i = 1;i<=n;i++){
            x^=i;
        }
        for(int i = 1;i<encoded.length;i+=2){
            x^=encoded[i];
        }
        perm[0] = x;
        for(int i = 0;i<encoded.length;i++){
            perm[i+1] = perm[i]^encoded[i];
        }
        return perm;
    }
}
