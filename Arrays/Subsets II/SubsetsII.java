class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> lst = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        List<Integer> sb = new ArrayList<>();
        Arrays.sort(nums);
        int i = 0;
        getUniqueSubsets(nums,i,set,sb);
        lst.addAll(set);
        return lst;
    }
    static void getUniqueSubsets(int[] nums, int i, Set<List<Integer>> set, List<Integer> sb){
        //Base Case
        if(i>=nums.length){
            set.add(new ArrayList<>(sb));
            return;
        }
        //Processing Work
        int k = nums[i];
        //include
        sb.add(k);
        //recursive call for include 
        getUniqueSubsets(nums, i+1, set, sb);
        //exclude
        sb.remove(sb.size()-1);
        //recursive call for exclude
        getUniqueSubsets(nums, i+1, set, sb);
    }
}b
