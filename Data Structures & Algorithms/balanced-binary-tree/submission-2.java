/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
           
         int[] solve(TreeNode root){
               if(root==null){
              return new int[]{1,0};
               }
         int[] left= solve(root.left);
         int[] right= solve(root.right);

            if((left[0]>=1 && right[0]>=1)&& Math.abs(left[1]- right[1]) <=1){
                 return new int[]{1, 1+ Math.max(left[1], right[1])};
            }

            else{
                   return new int[]{0, -1};
            }

         }
    public boolean isBalanced(TreeNode root) {
            if(root==null)return true;
            int[] ans= new int[2];
             ans=  solve(root);

             return ans[0]==1;
    }
}
