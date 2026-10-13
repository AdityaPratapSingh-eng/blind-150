class Solution {
public:
    long long maxAlternatingSum(vector<int>& nums) {
        int n= nums.size();
       long long ans=0;
        
        for(int i=0; i<n; i++){
            nums[i]= nums[i]*nums[i];
    }

    sort(nums.begin(), nums.end());

    int i=0, j=n-1;
    while(i<=j){
         if(i!=j){
          ans+= nums[j]- nums[i];
         }
         else{
              ans+= nums[i];
              break;
         }
        
        
         i++;
         j--;
    }
        return  ans;
    }
};