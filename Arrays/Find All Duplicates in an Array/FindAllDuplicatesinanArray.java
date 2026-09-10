// class Solution {
//     public List<Integer> findDuplicates(int[] nums) {
//         List<Integer> ans = new ArrayList<>();
//         HashMap<Integer,Integer> freq = new HashMap<>();
//         for(int x:nums){
//             freq.put(x,freq.getOrDefault(x,0)+1);
//         }
//         for(int x:freq.keySet()){
//             if(freq.get(x)==2){
//                 ans.add(x);
//             }
//         }
//         return ans;
//     }
// }

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for(int x : nums) {
            int index = Math.abs(x) - 1;
            if(nums[index] < 0) {
                ans.add(Math.abs(x));
            } 
            else {
                nums[index] = -nums[index];
            }
        }
        return ans;
    }
}
