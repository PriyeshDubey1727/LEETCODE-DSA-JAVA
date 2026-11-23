class CustomStack {
    Deque<Integer> st;
    int n;
    public CustomStack(int maxSize) {
        st = new ArrayDeque<>();
        n = maxSize;
    }
    
    public void push(int x) {
        if(st.size()<n){
            st.push(x);
        }
    }
    
    public int pop() {
        if(st.isEmpty()){
            return -1;
        }
        return st.pop();
    }
    
    public void increment(int k, int val) {
        Deque<Integer> pst = new ArrayDeque<>();
        while(!st.isEmpty()){
            pst.push(st.pop());
        }
        int count = 0;
        while(!pst.isEmpty()){
            int x = pst.pop();
            if(count<k){
                x+=val;
            }
            st.push(x);
            count++;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */