class BrowserHistory {
    Deque<String> st;
    Deque<String> lst;
    public BrowserHistory(String homepage) {
        st = new ArrayDeque<>();
        lst = new ArrayDeque<>();
        st.push(homepage);
    }
    
    public void visit(String url) {
        while(!lst.isEmpty()){
            lst.pop();
        }
        st.push(url);
    }
    
    public String back(int steps) {
        while(steps>0 && st.size()>1){
            String x = st.pop();
            lst.push(x);
            steps--;
        }
        return st.peek();
    }
    
    public String forward(int steps) {
        while(steps>0 && !lst.isEmpty()){
            String x = lst.pop();
            st.push(x);
            steps--;
        }
        return st.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */