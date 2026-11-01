class Solution {
public:
    int minMoves(vector<int>& nums) {
          int mn= *min_element(nums.begin(), nums.end());
           int steps=0;
          
          for(int a: nums){
               steps+= (a- mn);
          }
          return steps;
    }
};