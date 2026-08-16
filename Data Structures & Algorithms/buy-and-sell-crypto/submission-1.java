class Solution {
    public int maxProfit(int[] prices) {
        int n= prices.length;
          if(n==1){
            return 0;
          }
        int ans=0;
         int min_so_far=prices[0];
        for(int i=1; i<n; i++){
           min_so_far = Math.min(min_so_far, prices[i]);
            ans= Math.max(ans, prices[i]- min_so_far);
        }
        return ans;
    }
}
