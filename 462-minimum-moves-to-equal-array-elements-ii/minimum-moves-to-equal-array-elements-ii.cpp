class Solution {
public:
    int minMoves2(vector<int>& nums) {
        int n= nums.size();

        int sum=0;
       
         sort(nums.begin(), nums.end());
           int med=0;
         if(n%2==0){
           med= (nums[n/2]+ nums[n/2 -1])/2;
         }
         else{
            med= nums[n/2];
         }
       for(int a: nums){
        sum+= abs(med- a);
       }
          return sum;
    }
};