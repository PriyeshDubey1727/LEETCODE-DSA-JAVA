class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}

// Another approach for the same problem is to use the HashMap and count the frequency of each the element of the array and if it freqeuncy is greater than or equal to 2 then we have to return true otherwise we have to simply return false
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int x:nums){
            freq.put(x,freq.getOrDefault(x,0)+1);
        }
        for(int x:freq.keySet()){
            if(freq.get(x)>=2){
                return true;
            }
        }
        return false;
    }
}
