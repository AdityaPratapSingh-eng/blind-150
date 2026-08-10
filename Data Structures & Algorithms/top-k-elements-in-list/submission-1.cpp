class Solution {
public: typedef pair<int, int> P;
    vector<int> topKFrequent(vector<int>& nums, int k) {
          unordered_map<int, int>mp;
          for(int i=0; i<nums.size(); i++){
              mp[nums[i]]++;
          }

          priority_queue<P, vector<P>, greater<P>>pq;

          for(auto &a: mp){
             int key= a.first;
              int val= a.second;

              pq.push({val, key});
              if(pq.size()>k){
                pq.pop();
              }
          }
        vector<int>ans;
          while(!pq.empty()){
                int element= pq.top().second;
                ans.push_back(element);
                pq.pop();
          }

          return ans;
    }
};
