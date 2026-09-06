class Solution {
    public int countDigits(int num) {
        int original = num;
        int val = original;
        int count = 0;
        while(val!=0){
            int digits = val%10;
            if(original%digits==0){
                count++;
            }
            val/=10;
        }
        return count;
    }
}
