class Solution {
public:   
       string solve(string &s){
            int ans=0;

            for(char c: s){
                ans+= (c - '0');
            }
            return to_string(ans);
       }
    string digitSum(string s, int k) {
        while(s.size()>k){
            string temp= "";
               int i;
            for(i=0; i+k<s.size(); i+=k){
                string t= s.substr(i, k);
               temp+=solve(t);
            }
            if(i!=s.size()){
                string x= s.substr(i, (s.size()- i));
                temp+= solve(x);
            }
           
            s= temp;
        }

        return s;
    }
};