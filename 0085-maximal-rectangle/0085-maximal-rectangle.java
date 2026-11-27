import java.util.*;
class Solution {
    public int[] previousSmaller(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        Deque<Integer> st = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && height[st.peek()] >= height[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                left[i] = -1;
            }
            else {
                left[i] = st.peek();
            }
            st.push(i);
        }
        return left;
    }

    public int[] nextSmaller(int[] height) {
        int n = height.length;
        int[] right = new int[n];
        Deque<Integer> st = new ArrayDeque<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && height[st.peek()] >= height[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                right[i] = n;
            }
            else {
                right[i] = st.peek();
            }
            st.push(i);
        }
        return right;
    }

    public int getMaxArea(int[] height) {
        int n = height.length;
        int[] left = previousSmaller(height);
        int[] right = nextSmaller(height);
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = right[i] - left[i] - 1;
            int area = height[i] * width;
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] height = new int[m];
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == '1') {
                    height[j]++;
                } 
                else {
                    height[j] = 0;
                }
            }
            maxArea = Math.max(maxArea, getMaxArea(height));
        }
        return maxArea;
    }
}