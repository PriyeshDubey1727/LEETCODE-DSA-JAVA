class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] prevIndex = new int[n];
        int[] nextIndex = new int[n];
        prevSmallerIndex(heights,prevIndex);
        nextSmallerIndex(heights,nextIndex);
        int maxArea = -1;
        for(int i = 0;i<n;i++){
            int height = heights[i];
            int width = nextIndex[i] - prevIndex[i] - 1;
            int area = height * width;
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }
    public static void prevSmallerIndex(int[] heights, int[] prevIndex){
        Deque<Integer> st = new ArrayDeque<>();
        for(int i = 0;i<heights.length;i++){
            int curr = i;
            while(!st.isEmpty() && heights[st.peek()]>=heights[curr]){
                st.pop();
            }
            if(st.isEmpty()){
                prevIndex[i] = -1;
            }
            else{
                prevIndex[i] = st.peek();
            }
            st.push(curr);
        }

    }
    public static void nextSmallerIndex(int[] heights, int[] nextIndex){
        Deque<Integer> st = new ArrayDeque<>();
        int n = heights.length;
        for(int i = n-1;i>=0;i--){
            int curr = i;
            while(!st.isEmpty() && heights[st.peek()]>=heights[curr]){
                st.pop();
            }
            if(st.isEmpty()){
                nextIndex[i] = n;
            }
            else{
                nextIndex[i] = st.peek();
            }
            st.push(curr);
        }
    }
}