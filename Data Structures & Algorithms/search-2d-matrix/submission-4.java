class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
          int m= matrix.length;
          int n= matrix[0].length;

          int i=0;
          int j= m*n -1;

          while(i<=j){
               int mid= i+ (j-i)/2;
                 int r= mid/n;
                 int c= mid%n;
               if(matrix[r][c]< target){
                   i= mid+1;
               }
               else if(matrix[r][c]> target){
                      j= mid-1;
               }
               else{
                return true;
               }
          }

          return false;
    }
}
