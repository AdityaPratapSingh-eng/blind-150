class Solution {
public:
    int minInsertions(string s) {
        int n= s.size();
          int i=0;
          int  ans=0;
          int open=0;
        while(i<n){
             if(s[i]=='('){
                open++;
                i++;
             }
             else{

                if(i+1 < n && s[i+1]==')'){
                     i+=2;
                }
                else{
                    ans++;
                    i++;
                }

                if(open>0){
                    open--;
                }
                else
                {
                    ans++;
                }
             }
            
        }

            return ans+ 2*open;
    }
};