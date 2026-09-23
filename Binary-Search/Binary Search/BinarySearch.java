// BINARY SEARCH IMPLEMENTATION
// class Solution {
//     public int search(int[] arr, int target){
//         int n = arr.length;
//         int s = 0;
//         int e = n-1;
//         while(s<=e){
//             int m = s+(e-s)/2;
//             if(arr[m]==target){
//                 return m;
//             }
//             else if(arr[m]<target){
//                 s = m+1;
//             }
//             else{
//                 e = m-1;
//             }
//         }
//         return -1;
//     }
// }

 Time Complexity = O(logn);
 Space Complexity = O(1);



// RECURSIVE BINARY SEARCH IMPLEMENTATION
class Solution {
    public int search(int[] arr, int target){
        int n = arr.length;
        int s = 0;
        int e = n-1;
        return binarySearch(arr,target, s , e);
    }
    static int binarySearch(int[] arr, int target, int s, int e){
        //base case
        if(s>e){
            return -1;
        }
        //processing work 
        int mid = s+(e-s)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]<target){
            s = mid+1;
        }
        else{
            e = mid-1;
        }
        //recursive call
        return binarySearch(arr, target, s, e);
    }
}
