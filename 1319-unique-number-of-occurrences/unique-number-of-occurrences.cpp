class Solution {
public:
    bool uniqueOccurrences(vector<int>& arr) {
        unordered_map<int, int> mp;
       
        for(int a: arr){
            mp[a]++;
        }
         set<int>st;
        for(auto &a: mp){
            if(st.count(a.second)){
                return false;
            }
             st.insert(a.second);
        }

         return true;
    }
};