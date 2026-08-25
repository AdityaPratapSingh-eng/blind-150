class MinStack {
      Stack<Long>st= new Stack<>();
      long mn= Long.MAX_VALUE;
    public MinStack() {
          
    }
    
    public void push(int val) {
           if(st.isEmpty()){
                st.push((long)val);
                mn= val;
           }
           else{
                if(val < mn){
                        st.push((2L*val- mn));
                        mn = val;
                }
                else{
                        st.push((long)val);
                       
                }
           }
    }
    
    public void pop() {
           if(st.peek() < mn){
                mn= 2L*mn- st.peek();
           }
           st.pop();
    }
    
    public int top() {
           if(st.peek()< mn){
                return (int)mn;
           }
           else{
                return st.peek().intValue();
           }
    }
    
    public int getMin() {
            return (int)mn;
    }
}
