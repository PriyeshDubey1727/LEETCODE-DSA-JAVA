class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int x : nums) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>(freq.keySet());
        list.sort((a, b) -> {
            if (!freq.get(a).equals(freq.get(b))) {
                return freq.get(a) - freq.get(b);
            }
            return b - a;
        });
        int index = 0;
        for (int x : list) {
            for (int i = 0; i < freq.get(x); i++) {
                nums[index++] = x;
            }
        }
        return nums;
    }
}
