class Solution {
    public int findMin(int[] nums) {
        int n= nums.length;
    int ans=Integer.MAX_VALUE;
        int i=0;
         int j=n-1;
         while(i<=j){
            int mid= i+(j-i)/2;

             if(nums[mid]>=nums[i] && nums[mid]> nums[j]){
                i= mid+1;
             }
             else if(nums[mid]<= nums[j]){
                ans= Math.min(ans, nums[mid]);
                  j= mid-1;
             }
             else{
                 i++;
                 j--;
             }
         }
         return ans;
    }
}
