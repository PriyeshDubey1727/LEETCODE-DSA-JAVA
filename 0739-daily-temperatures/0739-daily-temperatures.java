//Brute Force
// class Solution {
//     public int[] dailyTemperatures(int[] temperatures) {
//         int n = temperatures.length;
//         int[] ans = new int[n];
//         for(int i = 0;i<n;i++){
//             for(int j = i+1;j<n;j++){
//                 if(temperatures[i]<temperatures[j]){
//                     ans[i] = j-i;
//                     break;
//                 }
//             }
//         }
//         return ans;
//     }
// }

//Optimising the solution using Stack 
class Solution {
    public int[] dailyTemperatures(int[] temperatures){
        int n = temperatures.length;
        int[] ans = new int[n];
        Deque<Integer> st = new ArrayDeque<>();
        for(int i = 0;i<n;i++){
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
                int idx = st.pop();
                ans[idx] = i-idx;
            }
            st.push(i);
        }
        return ans;
    }
}