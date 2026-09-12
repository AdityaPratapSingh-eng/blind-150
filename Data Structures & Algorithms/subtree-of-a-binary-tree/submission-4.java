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
             boolean  solve(TreeNode p, TreeNode q){
                if(p==null && q==null){
                     return true;
                }

                if(p==null || q==null){
                    return false;
                }
                  
                return solve(p.left, q.left) && solve(p.right, q.right) &&(p.val== q.val);

        }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
           if(root==null && subRoot==null){
                 return true;
           }
           if(root==null || subRoot==null){
            return false;
           }  
            if(root.val==subRoot.val && solve(root, subRoot))
            { 
                 return true;
              
            }
            
            
           boolean left= isSubtree(root.left, subRoot);
           boolean right= isSubtree(root.right, subRoot);

           return left || right;
    }
}
