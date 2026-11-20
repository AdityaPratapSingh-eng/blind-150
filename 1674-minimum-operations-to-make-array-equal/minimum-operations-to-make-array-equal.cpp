class Solution {
public:
    int minOperations(int n) {
        vector<int>ans(n);

        for(int i=0; i<n; i++){
               ans[i]= (2*i)+ 1;
        }

        int i=0, j= n-1;
       int res=0;
        while(i<=j){
            res+= max(abs(n-ans[i]),abs(n- ans[j]));
            i++;
            j--;
        }

        return  res;
    }
};