class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int minDistance = Integer.MAX_VALUE;
        int ans = -1;
        for(int i = 0;i<drones.length;i++){
            int x = drones[i][0];
            int y = drones[i][1];
            int r = drones[i][2];
            int distance = Math.abs(x-target[0])+Math.abs(y-target[1]);
            if(distance<=r){
                if(distance<minDistance){
                    minDistance = distance;
                    ans = i;
                }
            }
        }
        return ans;
    }
}
