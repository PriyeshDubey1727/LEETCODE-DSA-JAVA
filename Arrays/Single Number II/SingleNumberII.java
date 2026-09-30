//Brute Force Solution, it will have time complexity O(n^2) and space complexity O(1)
// class Solution {
//     public int singleNumber(int[] nums) {
//         int n = nums.length;
//         for(int i = 0;i<n;i++){
//             int count = 0;
//             for(int j = 0;j<n;j++){
//                 if(nums[i]==nums[j]){
//                     count++;
//                 }
//             }
//             if(count == 1){
//                 return nums[i];
//             }
//         }
//         return -1;
//     }
// }

//Using HashMap, it will have time complexity O(n) and space complexity O(n) as well
class Solution {
    public int singleNumber(int[] nums) {
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
