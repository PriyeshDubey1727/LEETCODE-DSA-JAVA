class Solution {
    public int mirrorDistance(int n) {
        return Math.abs(n-reverse(n));
    }
    public static int reverse(int n){
        int revNumber = 0;
        while(n!=0){
            int digits = n%10;
            revNumber = revNumber*10+digits;
            n/=10;
        }
        return revNumber;
    }
}
