class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        boolean isEven = false;
        boolean isOdd = false;
        int minOdd = Integer.MAX_VALUE;
        for(int x:nums1){
            if(x%2==0){
                isEven = true;
            }
            else{
                isOdd = true;
                if(x<minOdd){
                    minOdd = x;
                }
            }
        }
        if(isEven && !isOdd){
            return true;
        }
        if(isOdd && !isEven){
            return true;
        }
        if(isOdd && isEven){
            for(int x:nums1){
                if(x%2==0){
                    if(x<minOdd){
                        return false;
                    }
                }
            }
            return true;
        }
        return true;
    }
}
