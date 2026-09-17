class Solution {
    public String convertToBase7(int num) {
        if(num==0){
            return "0";
        }
        boolean negative = num<0;
        num = Math.abs(num);
        String ans = "";
        while(num!=0){
            int remainder = num%7;
            ans = remainder+ans;
            num/=7;
        }
        if(negative){
            ans = "-"+ans;
        }
        return ans;
    }
}
