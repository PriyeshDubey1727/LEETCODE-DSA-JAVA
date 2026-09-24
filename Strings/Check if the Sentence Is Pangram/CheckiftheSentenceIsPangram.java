class Solution {
    public boolean checkIfPangram(String sentence) {
        HashMap<Character,Integer> freq = new HashMap<>();
        for(char ch = 'a';ch<='z';ch++){
            freq.put(ch,0);
        }
        for(char ch:sentence.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        for(char ch = 'a';ch<='z';ch++){
            if(freq.get(ch)==0){
                return false;
            }
        }
        return true;
    }
}
