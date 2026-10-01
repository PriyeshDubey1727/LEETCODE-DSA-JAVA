// Using HashMap, Time Complexity = O(n) and Space Complexity = O(1)
// import java.util.HashMap;
// class Solution {
//     public char findTheDifference(String s, String t) {
//         HashMap<Character,Integer> freq1 = new HashMap<>();
//         HashMap<Character,Integer> freq2 = new HashMap<>();
//         for(char x:s.toCharArray()){
//             freq1.put(x,freq1.getOrDefault(x,0)+1);
//         }
//         for(char y:t.toCharArray()){
//             freq2.put(y,freq2.getOrDefault(y,0)+1);
//         }
//         for(char x:freq2.keySet()){
//             if(!freq1.containsKey(x) || freq2.get(x)>freq1.get(x)){
//                 return x;
//             }
//         }
//         return ' ';
//     }
// }

// BY using XOR , Time complexity = O(n) and Space Complexity = O(1)
class Solution {
    public char findTheDifference(String s, String t){
        char ans = 0;
        for(char ch:s.toCharArray()){
            ans^=ch;
        }
        for(char ph:t.toCharArray()){
            ans^=ph;
        }
        return ans;
    }
}
