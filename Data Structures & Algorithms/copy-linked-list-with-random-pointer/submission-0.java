/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
            Node newH= null;
            Node curr= head;
          Map<Node, Node>mp= new HashMap<>();
            Node prev= null;

            while(curr!= null){
                 Node temp= new Node(curr.val);
                 mp.put(curr, temp);
                 if(newH==null){
                     newH= temp;
                     prev= newH;
                 }
                 else{
                    prev.next= temp;
                    prev= temp;
                 }
                    curr= curr.next;
            }

          
            Node temp= newH;
            curr = head;
            while(newH!= null){
                newH.random= mp.get(curr.random);
                newH= newH.next;
                curr= curr.next;
            }
           return temp;
    } 
}
