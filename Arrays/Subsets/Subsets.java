class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lst = new ArrayList<>();
        List<Integer> sb = new ArrayList<>();
        int i = 0;
        getSubsets(nums, i, lst, sb);
        return lst;
    }
    static void getSubsets(int[] nums, int i, List<List<Integer>> lst, List<Integer> sb){
        // Base Case
        if(i>=nums.length){
            lst.add(new ArrayList<>(sb));
            return;
        }
        //Processing Work
        int k = nums[i];
        //include
        sb.add(k);
        getSubsets(nums,i+1, lst,sb);  //recursive call
        //exclude 
        sb.remove(sb.size()-1);
        getSubsets(nums,i+1,lst,sb);  //recursive call
    }
}
