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
      
        int solve(TreeNode root,int mx){
            if(root==null){
                return 0;
            }
            if(root.val >=mx){
                 mx= root.val;
                return 1+ solve(root.left, mx)+ solve(root.right, mx);
            }
            else{
                return solve(root.left , mx)+ solve(root.right ,mx);
            }
        }
    public int goodNodes(TreeNode root) {
        int mx= Integer.MIN_VALUE;
        return solve(root,mx);
    }
}
