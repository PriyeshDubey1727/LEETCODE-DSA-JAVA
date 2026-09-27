class Solution {
    public boolean canTransform(int[] source, int[] target) {
        int n = source.length;
        int m = target.length;
        long sum1 = 0;
        for(int i = 0;i<n;i++){
            sum1 += source[i];
        }
        long sum2 = 0;
        for(int k = 0;k<m;k++){
            sum2 += target[k];
        }
        if(sum1==sum2){
            return true;
        }
        return false;
    }
}
