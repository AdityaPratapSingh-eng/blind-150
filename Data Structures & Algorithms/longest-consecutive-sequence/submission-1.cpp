class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        set<int>st(nums.begin(), nums.end());
             int ans=0;
        for(int i=0; i<nums.size(); i++){
            if(!st.count(nums[i]-1)){
                int len=1;
                while(st.count(nums[i]+ len)){
                    len++;
                }

                ans= max(ans, len);
              
            }
           
        }
        return ans;
    }
};
