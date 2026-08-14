class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
         int n= nums.size();
       sort(nums.begin(), nums.end());
             vector<vector<int>>ans;
             set<tuple<int, int, int>>st;
         for(int idx=0; idx<n-2; idx++){
             int i= idx+1;
              int j= n-1;
              while(i<j){
                 if(nums[idx]+ nums[i]+ nums[j]>0){
                    j--;
                 }
                 else if(nums[idx]+ nums[i]+ nums[j]<0){
                    i++;
                 }
                 else{ 
                    if(!st.count({nums[idx], nums[i], nums[j]})){
                         ans.push_back({nums[idx], nums[i], nums[j]});
                         st.insert({nums[idx], nums[i], nums[j]});
                    }
                   
                    i++; 
                    j--;
                 }
              }
         }
         return ans;
    }
};
