class Solution {
    public int numberOfMatches(int n) {
        int matchCount = 0;
        int matchPlayed = 0;
        while(n!=1){
            if(n%2==0){
                matchPlayed = n/2;
                n/=2;
            }
            else{
                matchPlayed = (n-1)/2;
                n = (n-1)/2 + 1;
            }
            matchCount += matchPlayed;
        }
        return matchCount;
    }
}

// Another way to solve this problem 
class Solution {
  public int numberOfMatches(int n) {
    return n-1;
  }
}
