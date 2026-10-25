class Solution {
    public int calculateScore(int a, int b) {
        int ac = 0;
        int bc = 0;
        while(a!=0){
            if(a%2==1){
                ac++;
            }
            a/=2;
        }
        while(b!=0){
            if(b%2==1){
                bc++;
            }
            b/=2;
        }
        if(ac>=bc){
            return ac*bc;
        }
        return bc/ac;
    }
}
