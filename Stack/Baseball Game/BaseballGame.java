class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> st = new ArrayDeque<>();
        int n = operations.length;
        int x = 0;
        for(int i = 0;i<n;i++){
            if(operations[i].equals("+")){
                int first = st.pop();
                int second = st.peek();
                st.push(first);
                st.push(first+second);
            }
            else if(operations[i].equals("D")){
                st.push(st.peek()*2);
            }
            else if(operations[i].equals("C")){
                st.pop();
            }
            else{
                st.push(Integer.parseInt(operations[i]));
            }
        }
        while(!st.isEmpty()){
            x+=st.pop();
        }
        return x;
    }
}
