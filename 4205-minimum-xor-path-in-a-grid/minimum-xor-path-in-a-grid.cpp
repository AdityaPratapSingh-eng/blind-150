class Solution {
public:

        int dp[1001][1024];
          
     int solve(int i, int j, vector<vector<int>>& grid, int m , int n, int xr){
          if(i==m-1 && j==n-1){
              return xr^grid[i][j];
          }
         if(i>=m || j>= n){
             return  INT_MAX;
         }
              int idx= i*n +j;
         if(dp[idx][xr]!=-1){
            return dp[idx][xr];
         }
       
         int down= solve(i+1, j,grid, m, n, xr^grid[i][j]);
         int right= solve(i, j+1, grid,  m, n, xr^grid[i][j]);



         return  dp[idx][xr]= min(down, right);
     }
    
    int minCost(vector<vector<int>>& grid) {
        int m= grid.size();
        int n= grid[0].size();
        int xr=0;
       memset(dp, -1, sizeof(dp));
        return solve(0,0, grid, m, n, xr);
    }
};