class Solution {
public:
    bool checkInclusion(string s1, string s2) {
      int n= s2.size();
      int k= s1.size();
       vector<int>mp(26, 0);
       vector<int>mps(26,0);
       for(int id=0; id<k; id++){
           mps[s1[id]- 'a']++;
       }
         int i=0; 
    
         for(int j=0; j<n; j++){

          mp[s2[j]- 'a']++;

              if(j-i+1 >k){
              mp[s2[i]- 'a']--;
                     i++;
              }
               if(j-i+1==k){
                  if(mps==mp)return true;
               }
         }

         return false;
    }
};
