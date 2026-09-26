class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        int n = s.length();
        HashMap<String,String> key = new HashMap<>();
        for(List<String> pair:knowledge){
            key.put(pair.get(0),pair.get(1));
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i<n){
            if(s.charAt(i)=='('){
                int j = i+1;
                while(s.charAt(j)!=')'){
                    j++;
                }
                String r = s.substring(i+1,j);
                sb.append(key.getOrDefault(r, "?"));
                i = j+1;
            }
            else{
                sb.append(s.charAt(i));
                i++;
            }
        }
        return sb.toString();
    }
}
