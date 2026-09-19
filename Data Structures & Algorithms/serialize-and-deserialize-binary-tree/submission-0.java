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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null)return "N,";

        return String.valueOf(root.val)+","+ serialize(root.left)+ serialize(root.right);
    }

          TreeNode solve(StringTokenizer st){
                   String s=  st.nextToken();

              if(s.equals("N")){
                return null;
              }

              TreeNode root= new TreeNode(Integer.parseInt(s));
              root.left= solve(st);
              root.right= solve(st);

              return root;
          }
      

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
          StringTokenizer st= new StringTokenizer(data, ",");
            TreeNode root=  solve(st);

            return root;
    }
}
