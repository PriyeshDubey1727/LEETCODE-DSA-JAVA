class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int i = low; i <= high; i++){
            String s = String.valueOf(i);
            if(s.length() % 2 != 0){
                continue;
            }
            int sum1 = 0;
            int sum2 = 0;
            int half = s.length() / 2;
            for(int j = 0; j < half; j++){
                sum1 += s.charAt(j) - '0';
            }
            for(int k = half; k < s.length(); k++){
                sum2 += s.charAt(k) - '0';
            }
            if(sum1 == sum2){
                count++;
            }
        }
        return count;
    }
}
