class Solution {
    public String frequencySort(String s) {
        int n = s.length();
        int[] freq = new int[128];
        for(int i = 0;i<n;i++){
            char ch = s.charAt(i);
            freq[ch]++;
        }
        StringBuilder ans = new StringBuilder();
        for(int f = n;f>=1;f--){
            for(int ch = 0;ch<128;ch++){
                if(freq[ch]==f){
                    for(int i = 0;i<f;i++){
                        ans.append((char)ch);
                    }
                }
            }
        }
        return ans.toString();
    }
}
