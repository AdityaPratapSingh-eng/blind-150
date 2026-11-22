class Solution {
public:
    bool checkString(string s) {
        int n= s.size();
        if(n==1)return true;
        int aidx=-1;
        bool flag= true;
        int bidx=n;
        for(int i=n-1; i>=0; i--){
              if(s[i]=='a' && flag){
                  aidx=i;
                  flag= false;
              }
              else if(s[i]=='b'){
                bidx= i;
              }
        }

        return bidx> aidx;
    }
};