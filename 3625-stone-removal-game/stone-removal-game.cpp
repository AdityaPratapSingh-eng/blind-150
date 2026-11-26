class Solution {
public:
    bool canAliceWin(int n) {
        int prev=10;
        int candidate =1;
        while(n){
            switch(candidate){
                case 1:
                  if(n>=prev){
                     n-= prev;
                     candidate=2;
                     prev= prev-1;
                  }
                  else{
                       return false;
                  }
                  break;

                  case 2:
                  if(n>=prev){
                     n-= prev;
                      candidate=1;
                     prev= prev-1;
                  }
                  else{
                    return true;
                  }
                  break;
            }
        }
        return (candidate==1)? false: true;
    }
};