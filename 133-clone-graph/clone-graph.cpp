/*
// Definition for a Node.
class Node {
public:
    int val;
    vector<Node*> neighbors;
    Node() {
        val = 0;
        neighbors = vector<Node*>();
    }
    Node(int _val) {
        val = _val;
        neighbors = vector<Node*>();
    }
    Node(int _val, vector<Node*> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
};
*/

class Solution {
public:
    Node* cloneGraph(Node* node) {
        if(node==NULL)return NULL;
       unordered_map<Node*, Node*>mp;
         Node *clone= new Node(node->val);
           queue<Node*>q;

           mp[node]= clone;
    q.push(node);

    while(!q.empty()){
        Node *curr= q.front();
        q.pop();

        for(Node*n : curr->neighbors){
               if(!mp.count(n)){
                Node*temp= new Node(n->val);
                    mp[n]= temp;
                    q.push(n);
               }
               mp[curr]->neighbors.push_back(mp[n]);
        }
    }
          return clone;
    }
};