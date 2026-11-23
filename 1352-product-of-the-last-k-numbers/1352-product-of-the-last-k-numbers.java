// class ProductOfNumbers {
//     Deque<Integer> st;
//     public ProductOfNumbers() {
//         st = new ArrayDeque<>();
//     }
    
//     public void add(int num) {
//         st.push(num);
//     }
    
//     public int getProduct(int k) {
//         int product = 1;
//         Deque<Integer> pst = new ArrayDeque<>();
//         while(k>0){
//             int x = st.pop();
//             product*=x;
//             pst.push(x);
//             k--;
//         }
//         while(!pst.isEmpty()){
//             st.push(pst.pop());
//         }
//         return (int)product;
//     }
// }



class ProductOfNumbers {
    Deque<Integer> st;
    ArrayList<Integer> arr;

    public ProductOfNumbers() {
        st = new ArrayDeque<>();
        arr = new ArrayList<>();
        st.push(1);
        arr.add(1);
    }

    public void add(int num) {
        if(num == 0) {
            st.clear();
            arr.clear();
            st.push(1);
            arr.add(1);
        }
        else {
            int product = st.peek() * num;
            st.push(product);
            arr.add(product);
        }
    }

    public int getProduct(int k) {
        int n = arr.size();
        if(k >= n) {
            return 0;
        }
        return arr.get(n - 1) / arr.get(n - k - 1);
    }
}


/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */