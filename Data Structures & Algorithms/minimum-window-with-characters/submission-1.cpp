class Solution {
public:
    string minWindow(string s, string t) {
        int n= s.size();
     
         int j=0;
         int ansS=INT_MAX;
         int i=0;
          unordered_map<char, int>mp;
             for(char ch : t){
            mp[ch]++;
             }
             int start=0;
            int req= t.size();
            
            while(j<n){
                    if(mp[s[j]]>0){
                        req--;
                    }
                    mp[s[j]]--;
                    j++;

                 while(req==0){
                      int len= j-i;
                      if(len < ansS){
                        ansS= len;
                        start=i;
                      }
                     mp[s[i]]++;
                      if(mp[s[i]]>0){
                        req++;
                      }
                        
                     
                         i++;
                 } 
            }
          if(ansS==INT_MAX)return "";

          return s.substr(start, ansS);
    }
    
};
