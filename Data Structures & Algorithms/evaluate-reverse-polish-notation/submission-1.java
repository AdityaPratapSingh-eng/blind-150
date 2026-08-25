class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>st= new Stack<>();
         int n= tokens.length;

         for(String t: tokens){
           if (!t.equals("+") && 
    !t.equals("-") && 
    !t.equals("*") && 
    !t.equals("/")) {

    st.push(Integer.parseInt(t));
}
            else{
                int a= st.peek();
                st.pop();
                int b= st.peek();
                st.pop();
                if(t.equals("+")){
                    st.push(a+b);
                }
                else if(t.equals("-")){
                    st.push(b-a);
                }
                 else if(t.equals("*")){
                    st.push(b*a);
                }
                 else {
                    st.push(b/a);
                }
            }
         }

         return st.peek();
    }
}
