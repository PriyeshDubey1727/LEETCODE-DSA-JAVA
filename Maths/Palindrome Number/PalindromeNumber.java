// class Solution {
//     static int revNumber(int x){
//         int revNumber = 0;
//         while(x!=0){
//             int digits = x%10;
//             revNumber = revNumber*10+digits;
//             x/=10;
//         }
//         return revNumber;
//     }
//     public boolean isPalindrome(int x) {
//         int originalNumber = x;
//         int revNumber = revNumber(x);
//         if(x<0){
//             return false;
//         }
//         if(originalNumber==revNumber){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
// }

class Solution {
    public boolean isPalindrome(int x){
        int originalNumber = x;
        int revNumber = revNumber(x);
        if(x<0){
            return false;
        }
        if(originalNumber == revNumber){
            return true;
        }
        else{
            return false;
        }
    }
    static int revNumber(int x){
        long revNumber = 0;
        while(x!=0){
            int digits = x%10;
            revNumber = revNumber*10+digits;
            x/=10;
        }
        return (int)revNumber;
    }
}
