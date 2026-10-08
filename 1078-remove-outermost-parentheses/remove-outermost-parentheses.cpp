class Solution {
public:
    string removeOuterParentheses(string s) {
        int n= s.size();
       int open=0;
       int close=0;
        int prev=0;
             string ans="";
        for(int i=0; i<n; i++){
               if(s[i]=='('){
                   open++;
               }
               else if(s[i]==')'){
                close++;
               }

               if(open==close){
                ans+= s.substr(prev+1, i- prev-1);

                prev= i+1;
               }
        }
        return ans;
    }
};