class Solution {
public:
    bool checkInclusion(string s1, string s2) {
      int n= s2.size();
      int k= s1.size();
         sort(s1.begin(), s1.end());
         int i=0; 
         string temp="";
         for(int j=0; j<n; j++){
              if(j-i+1 >k){
                     i++;
              }
           string temp=    s2.substr(i, j-i+1);
           sort(temp.begin(), temp.end());

           if(temp== s1)return true;
         }

         return false;
    }
};
