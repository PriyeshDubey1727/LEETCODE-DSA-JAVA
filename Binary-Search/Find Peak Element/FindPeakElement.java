class Solution {
    public int findPeakElement(int[] arr) {
        int n = arr.length;
        int s = 0;
        int e = n-2;
        int ans = -1;
        if (n == 1) {
            return 0;
        }
        if (arr[n - 1] > arr[n - 2]) {
            return n - 1;
        }
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]<arr[mid+1]){
                s = mid+1;
            }
            else{
                ans = mid;
                e = mid-1;
            }
        }
        return ans;
    }
}
