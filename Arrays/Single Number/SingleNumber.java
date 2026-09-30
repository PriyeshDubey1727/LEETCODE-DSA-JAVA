//solution using Bitwise XOR approach 
// class Solution {
//     public int singleNumber(int[] nums) {
//         int n = nums.length;
//         int singleNumber = 0;
//         for(int i  = 0;i<n;i++){
//             singleNumber^=nums[i];
//         }
//         return singleNumber;
//     }
// }


// Solution using HashMap approach or frequency count approach
class Solution {
    public int singleNumber(int[] nums){
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int x:nums){
            freq.put(x,freq.getOrDefault(x,0)+1);
        }
        for(int x:freq.keySet()){
            if(freq.get(x)==1){
                return x;
            }
        }
        return -1;
    }
}
