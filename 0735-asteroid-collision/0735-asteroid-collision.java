class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        //What i have noticed till yet is:-
        // indices = represents the relative position in space
        // value = represents its size
        // sign = represents the direction 
        // +ve = right 
        // -ve = left 
        // speed = same for all the asteroid
        // if meeting possible : 
        //            -smaller will explode 
        //            -same size = both will explode 
        // same direction = then no movement

        //now time for the observation to making logic:-

        Deque<Integer> st = new ArrayDeque<>();
        int n = asteroids.length;
        for(int i = 0;i<n;i++){
            int current = asteroids[i];
            boolean alive = true;

            //whether collision is possible 
            while(!st.isEmpty() && st.peek()>0 && current<0){
                if(Math.abs(st.peek())<Math.abs(current)){
                    st.pop();
                }
                else if(Math.abs(st.peek()) == Math.abs(current)){
                    st.pop();
                    alive = false;
                    break;
                }
                else {
                    alive = false;
                    break;
                }
            }
            if(alive){
                st.push(current);
            }
        }
        int[] ans = new int[st.size()];
        for(int i = ans.length-1;i>=0;i--){
            ans[i] = st.pop();
        }
        return ans;
    }
}