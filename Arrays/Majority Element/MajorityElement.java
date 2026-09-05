class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return nums[n/2];
    }
}


// Another Approach for this problem is using Hashmap 

class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int x:nums){
            freq.put(x,freq.getOrDefault(x,0)+1);
        }
        int ans = -1;
        for(int x:freq.keySet()){
            if(freq.get(x)>n/2){
                ans = x;
            }
        }
        return ans;
    }
}
