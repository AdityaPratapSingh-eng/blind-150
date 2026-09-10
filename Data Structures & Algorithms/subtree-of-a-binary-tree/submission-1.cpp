/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */

class Solution {  

public:     
   bool solve(TreeNode *p, TreeNode* q){
                if(p==NULL && q==NULL){
                     return true;
                }

                if(p==NULL || q==NULL){
                    return false;
                }
                  
                return solve(p->left, q->left) && solve(p->right, q->right) &&(p->val== q->val);

        }
    bool isSubtree(TreeNode* root, TreeNode* subRoot) {
           bool  flag= false;
            queue<TreeNode*>q;
                if(root==NULL   && subRoot==NULL){
                    return true;
                }
                if(root==NULL || subRoot==NULL){
                    return false;
                }
            q.push(root);

            while(!q.empty()){
                  TreeNode *curr= q.front();
                  q.pop();

                  if(curr->val==subRoot->val){
                      flag= flag || solve(curr, subRoot);
                  }

                  if(curr->left){
                    q.push(curr->left);
                  }
                  if(curr->right){
                    q.push(curr->right);
                  }
            }

            return flag;
    }
};
