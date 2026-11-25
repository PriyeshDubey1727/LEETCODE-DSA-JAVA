class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        //Observation:-
        // mass = mass of the planet
        // asteroids[i] =  mass of the ith asteroid
        // mass>=asteroid[i] = destroyed, also the planet gains the mass of the asteroid means mass+=asteroid[i]
        // otherwise destroyed
        // if all the asteroids destroyed = true
        // else false

        //Observation to Logic 
        int n = asteroids.length;
        Arrays.sort(asteroids);
        long cM = mass;
        for(int i = 0;i<n;i++){
            int current = asteroids[i];
            if(cM>=current){
                cM = cM+current;
            }
            else{
                return false;
            }
        }
        return true;
    }
}