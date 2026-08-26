class Solution {
     record Pair(int first, int second){};
    public int[] dailyTemperatures(int[] temperatures) {
         Stack<Pair>st= new Stack<>();
         int []ans= new int[temperatures.length];
         for(int i=0; i<temperatures.length; i++){
               if(st.isEmpty()){
               st.push(new Pair(temperatures[i], i));
               }
               else{
                    while(!st.isEmpty()  &&  st.peek().first() < temperatures[i]){
                         ans[st.peek().second()]= i-st.peek().second();
                         st.pop();
                    }
                     st.push(new Pair(temperatures[i], i));
               }
         }
         return ans;
    }
}
