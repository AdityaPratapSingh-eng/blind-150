class Solution {

         public boolean solve(int[] piles, int mid, int h){
                    int time=0;

                    for(int i=0; i<piles.length; i++){
                        time+= Math.ceil((double)piles[i]/ mid);
                    }

                    if(time<=h){
                        return true;
                    }

                    return false;
         }
    public int minEatingSpeed(int[] piles, int h) {
           int low=1;
           int high= piles[0];

           for(int i=1; i<piles.length; i++){
             
              high= Math.max(high, piles[i]);
           }
               int ans =Integer.MAX_VALUE;
           while(low<= high){
               int mid= low + (high- low)/2;

               if(solve(piles, mid, h)){
                     ans= Math.min(ans, mid);
                    high= mid-1;
               }
               else{
                        low= mid+1;
               }
              
           }

           return ans;
    }
}
