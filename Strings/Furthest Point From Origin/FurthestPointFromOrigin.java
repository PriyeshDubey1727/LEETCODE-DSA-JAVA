class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int n = moves.length();
        int distance = 0;
        int blank = 0;
        for(int i = 0;i<n;i++){
            char ch = moves.charAt(i);
            if(ch=='L'){
                distance--;
            }
            else if(ch=='R'){
                distance++;
            }
            else{
                blank++;
            }
        }
        return Math.abs(distance)+blank;
    }
}
