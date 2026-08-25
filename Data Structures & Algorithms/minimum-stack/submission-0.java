class MinStack {
       record Pair(int first, int second) {};
        int mn= Integer.MAX_VALUE;
       Stack<Pair>st=  new Stack<>();
    public MinStack() {
       
            }
    
    public void push(int val) {
              if(st.isEmpty()){
                  st.push(new Pair(val, val));
              }
             else{
                   mn= Math.min(st.peek().second(), val);
                  st.push(new Pair(val, mn));
             }
          
    }
    
    public void pop() {
           
                 st.pop();
                  
    }
    
    public int top() {
           return st.peek().first();
    }
    
    public int getMin() {
        return st.peek().second();
    }
}
