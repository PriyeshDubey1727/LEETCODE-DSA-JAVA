class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int x:arr){
            freq.put(x,freq.getOrDefault(x,0)+1);
        }
        HashSet<Integer> set = new HashSet<>();
        for(int x:freq.keySet()){
            int frequency = freq.get(x);
            if(set.contains(frequency)){
                return false;
            }
            set.add(frequency);
        }
        return true;
    }
}
