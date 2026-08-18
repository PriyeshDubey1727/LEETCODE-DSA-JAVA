class Solution {
    public int maxDistance(int[] position, int k) {
        Arrays.sort(position);
        int n = position.length;
        int s = 1;
        int e = position[n-1]-position[0];
        int ans = -1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(isValidAns(position,k,mid)){
                ans = mid;
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return ans;
    }
    static boolean isValidAns(int[] position, int k, int mid){
        int ballCount = 1;
        int ballPosition = 0;
        for(int i = 1;i<position.length;i++){
            if(position[i]-position[ballPosition]>=mid){
                ballCount++;
                ballPosition = i;
                if(ballCount == k){
                    return true;
                }
            }
        }
        return false;
    }
}
