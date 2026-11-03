class Solution {
public:
    int minMoves(vector<int>& nums) {
        int mx=nums[0];
        for(int i=1; i<nums.size(); i++){
            if(nums[i]>mx){
                mx= nums[i];
            }
        }
        int sum=0;
        for(int i=0; i<nums.size(); i++){
            sum+= mx- nums[i];
        }
        return sum;
    }
};