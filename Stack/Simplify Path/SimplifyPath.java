import java.util.Deque;
import java.util.ArrayDeque;
class Solution {
    public String simplifyPath(String path) {
        Deque<String> st = new ArrayDeque<>();
        String[] arr = path.split("/");
        int n = arr.length;
        for(int i = 0;i<n;i++){
            if(arr[i].equals(".")){
                continue;
            }
            if(arr[i].equals("")){
                continue;
            }
            if(arr[i].equals("..") && st.isEmpty()){
                continue;
            }
            if(arr[i].equals("..") && !st.isEmpty()){
                st.pop();
                continue;
            }
            st.push(arr[i]);
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append('/').append(st.removeLast());
        }
        if(sb.length()==0){
            return "/";
        }
        return sb.toString();
    }
}
