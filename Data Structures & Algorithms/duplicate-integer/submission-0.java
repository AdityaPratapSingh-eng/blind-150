
class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums == null || nums.length <= 1) return false;
        Set<Integer>st= new HashSet<>(nums.length);

        int n= nums.length;

        for(int i=0; i<n; i++){
            if(!st.add(nums[i])){
                return true;
            }

        }

       
         return false;
    }
}