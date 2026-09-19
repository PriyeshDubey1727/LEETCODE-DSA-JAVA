// USING BRUTE FORCE
// class Solution {
//     public int reverse(int x) {
//         int revNumber = 0;
//         while (x != 0) {
//             int digit = x % 10;
//             if (revNumber > Integer.MAX_VALUE / 10 || 
//                 (revNumber == Integer.MAX_VALUE / 10 && digit > 7)) {
//                 return 0;
//             }
//             if (revNumber < Integer.MIN_VALUE / 10 || 
//                 (revNumber == Integer.MIN_VALUE / 10 && digit < -8)) {
//                 return 0;
//             }
//             revNumber = revNumber * 10 + digit;
//             x /= 10;
//         }
//         return revNumber;
//     }
// }


// USING ALMOST SAME APPROACH BUT while maintaing overflow condition 
class Solution {
    public int reverse(int x){
        int num = x;
        long revNumber = 0;
        while(num!=0){
            int digit = num%10;
            revNumber = revNumber*10+digit;
            num/=10;
        }
        if(revNumber>Integer.MAX_VALUE || revNumber<Integer.MIN_VALUE){
            return 0;
        }
        return (int)revNumber;
    }
}
