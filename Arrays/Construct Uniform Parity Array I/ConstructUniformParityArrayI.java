class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        if(n==1){
            return true;
        }
        boolean isOdd = false;
        boolean isEven = false;
        for(int x:nums1){
            if(x%2==0){
                isEven = true;
            }
            else{
                isOdd = true;
            }
        }
        if(isEven && !isOdd){
            return true;
        }
        if(isOdd && !isEven){
            return true;
        }
        if(isOdd && isEven){
            return true;
        }
        return false;
    }
}
