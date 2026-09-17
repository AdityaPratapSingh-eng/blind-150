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
               Map<Integer, Integer>mp;
               int idx;
           TreeNode solve(int[]preorder, int []inorder, int start, int end){
                if(end< start)return null;

                int rootV= preorder[idx];
                int i= mp.get(preorder[idx]);

                idx++;

                TreeNode root= new TreeNode(rootV);
                root.left= solve(preorder, inorder, start, i-1);
                root.right= solve(preorder, inorder, i+1, end);

                return root;
           }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n= preorder.length;
           mp= new HashMap<>();
          for(int i=0; i<n; i++){
              mp.put(inorder[i], i);
          }  
          idx=0;
            return solve(preorder, inorder, 0, n-1);
    }
}
