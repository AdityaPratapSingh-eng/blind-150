class Solution {
public:
    int longestMonotonicSubarray(vector<int>& nums) {
        int n= nums.size();
          int ans=1;

          if(n==1)return ans;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[j]> nums[j-1]){
                    ans= max(ans, j-i+1);
                }
                else{
                  
                    break; 
                }
            }

        }
             

         for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[j]< nums[j-1]){
                      ans= max(ans, j-i+1);
                }
                else{
                   
                    break; 
                }
                
            }
            
        }
       
        return ans;
    }
};