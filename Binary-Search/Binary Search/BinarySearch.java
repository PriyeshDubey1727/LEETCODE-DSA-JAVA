class Solution {
    public int search(int[] arr, int target) {
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int mid = (start+end)/2;
        while(start<=end){
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
            mid = (start+end)/2;
        }
        return -1;
    }
}
