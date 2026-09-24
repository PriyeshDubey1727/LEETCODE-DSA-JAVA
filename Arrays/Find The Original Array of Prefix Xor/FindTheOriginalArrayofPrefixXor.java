// Time complexity = O(n) and Space Complexity = O(n)

// class Solution {
//     public int[] findArray(int[] pref) {
//         int n = pref.length;
//         int[] prefixXor = new int[n];
//         prefixXor[0] = pref[0];
//         for(int i = 1;i<n;i++){
//             prefixXor[i] = pref[i-1]^pref[i];
//         }
//         return prefixXor;
//     }
// }

//  Time Complexity = O(n) and Space Complexity = O(1)

class Solution {
    public int[] findArray(int[] pref){
        int n = pref.length;
        for(int i = n-1;i>0;i--){
            pref[i] = pref[i-1]^pref[i];
        }
        return pref;
    }
}
