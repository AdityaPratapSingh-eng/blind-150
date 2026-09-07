/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
               int size=0;
               ListNode curr= head;
               ListNode  end= head;
               while(curr!= null){
                curr= curr.next;
                  size++;
               }
             int totalGroup= size/k;
                ListNode ans= null;
                ListNode s= head;
             while(totalGroup>0){
                    ListNode e= s;
                     for(int i=1; i<k; i++){
                         e= e.next;
                     }

                     ListNode nextG= e.next;
                       ListNode groupSt= s;
                      ListNode prev= nextG;
                     while(s!= nextG){
                          ListNode temp =s.next;
                          s.next= prev;

                          prev= s;
                          s= temp;
                     }
                     if(ans==null){
                        ans= prev;
                     }

                     else{
                        end.next= prev;
                     }

                     end= groupSt;

                     totalGroup--;
             }

             return ans;
    }
}
