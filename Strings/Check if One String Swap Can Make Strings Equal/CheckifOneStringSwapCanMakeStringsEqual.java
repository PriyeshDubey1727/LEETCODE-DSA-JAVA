class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        HashMap<Character,Integer> freqs1 = new HashMap<>();
        HashMap<Character,Integer> freqs2 = new HashMap<>();
        if(s1.length()!=s2.length()){
            return false;
        }
        for(char x:s1.toCharArray()){
            freqs1.put(x, freqs1.getOrDefault(x,0)+1);
        }
        for(char y:s2.toCharArray()){
            freqs2.put(y, freqs2.getOrDefault(y,0)+1);
        }
        if(!freqs1.equals(freqs2)){
            return false;
        }
        else{
            int first = -1;
            int second = -1;
            int count = 0;
            for(int i = 0; i < s1.length(); i++){
                if(s1.charAt(i) != s2.charAt(i)){
                    count++;
                    if(first == -1){
                        first = i;
                    }
                    else{
                        second = i;
                    }
                }
            }
            if(count == 0){
                return true;
            }
            if(count != 2){
                return false;
            }

            char[] arr = s2.toCharArray();

            char temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
            s2 = new String(arr);
            return s1.equals(s2);
        }
    }
}
