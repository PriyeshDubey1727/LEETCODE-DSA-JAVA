class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int n = jewels.length();
        int m = stones.length();
        int[] freq1 = new int[128];
        int[] freq2 = new int[128];
        for(int i = 0;i<n;i++){
            char ch = jewels.charAt(i);
            freq1[ch]++;
        }
        for(int i = 0;i<m;i++){
            char ch = stones.charAt(i);
            freq2[ch]++;
        }
        int count = 0;
        for(int i = 0;i<128;i++){
            if(freq1[i]>0){
                count+=freq2[i];
            }
        }
        return count;
    }
}
