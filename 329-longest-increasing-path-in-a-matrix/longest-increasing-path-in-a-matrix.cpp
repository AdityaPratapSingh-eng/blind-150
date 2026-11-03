class Solution {
public:
        vector<vector<int>>memo;
       int  dfs(vector<vector<int>>&matrix, int m ,int n, int i, int j, int prev){
               if(i>=m || j>=n || i<0 || j<0 || matrix[i][j]<=prev){
                  return 0;
               }

               if(memo[i][j]!= -1)return memo[i][j];
            

        int down= dfs(matrix, m, n, i+1, j, matrix[i][j]);
        int up=   dfs(matrix, m, n, i-1, j, matrix[i][j]);
        int right= dfs(matrix, m, n, i, j+1, matrix[i][j]);
        int left=  dfs(matrix, m, n, i, j-1, matrix[i][j]);


        return memo[i][j]= (1+ max({up, down, left, right}));

             
          }
        
    int longestIncreasingPath(vector<vector<int>>& matrix) {
        int m= matrix.size();
        int n= matrix[0].size();
        int ans=INT_MIN;
        memo.resize(m, vector<int>(n, -1));
          for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
            ans= max(ans, dfs(matrix, m, n, i, j, -1));
            }
          }
              return ans;
            }
};