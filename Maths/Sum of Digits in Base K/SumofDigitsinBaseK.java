class Solution {
    public int sumBase(int n, int k) {
        //n ko kisi base k mein convert karne ke liye we have to divide n by k and then notedown the remainder and divide quotient repeatedly that left and after that we have to iterate it from the bottom to top 
        //aur jaise hi uski conversion ho jaaye humko uski digits sum nikalni hai 
        int sum = 0;
        while(n!=0){
            int remainder = n%k;
            sum+=remainder;
            n/=k;
        }
        return sum;
    }
}
