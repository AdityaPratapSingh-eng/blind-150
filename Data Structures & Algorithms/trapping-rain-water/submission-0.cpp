class Solution {
public:
    int trap(vector<int>& height) {
        int n= height.size();
       vector<int>lmax(n,0);
        vector<int>rmax(n,0);
        
       int ans=0;
        for(int i=1;i<n; i++){
            lmax[i]= max(lmax[i-1], height[i-1]);
        }

        
        for(int i=n-2;i>=0; i--){
            rmax[i]= max(rmax[i+1], height[i+1]);
        }

        for(int idx=0; idx<n; idx++){
           int h= min(lmax[idx], rmax[idx])- height[idx];

           ans+= (h>0)?h: 0;
      }

       return ans;
    }
};
