class Solution {
public:
    long long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
            long long total=0;
             if(cost1 + cost2 <= costBoth){
                  return ((long long )cost1*need1+ (long long )cost2*need2);
             }

             else{
                  int both= min(need1, need2);
                  total+= (long long )costBoth * both;

                  need1-= both;
                  need2-= both;
                if(need1 >0){
                   total+= (long long )min(costBoth, cost1) * need1;
                }
                else if(need2 >0){
                        total+= (long long )min(costBoth, cost2) * need2;
                }
             }
             return total;
    }
};