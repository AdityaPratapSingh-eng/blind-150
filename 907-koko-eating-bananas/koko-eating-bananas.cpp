class Solution {
public:

         bool solve(int mid, vector<int>&piles, int h){
            int time=0;
                for(int i=0; i<piles.size(); i++){
                     if(piles[i]<=mid){
                         time++;
                     }
                     else {
                        time+= (piles[i]/mid + ((piles[i]%mid==0)?0: 1));
                     }

                      if(time >h){
                        return false;
                      }
                }

                return true;
         }
    int minEatingSpeed(vector<int>& piles, int h) {
           int n= piles.size();
          sort(piles.begin(), piles.end());
           int low=1;
           int high= piles[n-1];
         int ans=-1;
           while(low<=high){
                int mid= low+ (high- low)/2;

                if(solve(mid, piles, h)){
                     ans= mid;
                     high= mid-1;
                }

                else{
                    low= mid+1;
                }
           }
           return ans;
    }
};