import java.util.*;
import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int n = num.length;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append(num[i]);
        }
        BigInteger number = new BigInteger(sb.toString());
        BigInteger result = number.add(BigInteger.valueOf(k));
        String str = result.toString();
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){
            ans.add(str.charAt(i) - '0');
        }
        return ans;
    }
}
