class TextEditor {
    Deque<Character> st;
    Deque<Character> lst;
    public TextEditor() {
        st = new ArrayDeque<>();
        lst = new ArrayDeque<>();
    }
    
    public void addText(String text) {
        for(int i = 0;i<text.length();i++){
            st.push(text.charAt(i));
        }
    }
    
    public int deleteText(int k) {
        int count = 0;
        while(!st.isEmpty() && k>0){
            st.pop();
            k--;
            count++;
        }
        return count;
    }
    
    public String cursorLeft(int k) {
        while(!st.isEmpty() && k>0){
            char ch = st.pop();
            lst.push(ch);
            k--;
        }
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(char ch : st){
            if(count==10){
                break;
            }
            sb.append(ch);
            count++;
        }
        return sb.reverse().toString();
    }
    
    public String cursorRight(int k) {
        while(!lst.isEmpty() && k>0){
            char ch = lst.pop();
            st.push(ch);
            k--;
        }
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(char ch:st){
            if(count==10){
                break;
            }
            sb.append(ch);
            count++;
        }
        return sb.reverse().toString();
    }
}

/**
 * Your TextEditor object will be instantiated and called as such:
 * TextEditor obj = new TextEditor();
 * obj.addText(text);
 * int param_2 = obj.deleteText(k);
 * String param_3 = obj.cursorLeft(k);
 * String param_4 = obj.cursorRight(k);
 */