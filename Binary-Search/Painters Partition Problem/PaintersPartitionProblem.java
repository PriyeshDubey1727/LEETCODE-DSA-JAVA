class Solution {
    public int minTime(int[] arr, int k) {
        // code here
        int n = arr.length;
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum+=arr[i];
        }
        int s = 0;
        int e = sum;
        int ans = -1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(isValid(arr,mid,k)){
                ans = mid;
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return ans;
    }
    static boolean isValid(int[] arr, int mid, int k){
        int painterCount = 1;
        int paintedLength = 0;
        for(int i = 0;i<arr.length;i++){
            if(paintedLength+arr[i]<=mid){
                paintedLength = paintedLength+arr[i];
            }
            else{
                painterCount++;
                if(painterCount>k || arr[i]>mid){
                    return false;
                }
                else{
                    paintedLength = arr[i];
                }
            }
        }
        return true;
    }
}
