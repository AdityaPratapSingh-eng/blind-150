class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string, vector<string>>mp;

        for(string s: strs){
            string org= s;
             sort(s.begin(), s.end());
             mp[s].push_back(org);
        }
        vector<vector<string>>ans;
        for(auto & a: mp){
            ans.push_back(a.second);
        }

        return ans;
    }
};
