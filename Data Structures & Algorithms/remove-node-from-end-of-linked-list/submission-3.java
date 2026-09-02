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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null && n==1)return null;
         
               int count= 0;
               ListNode curr= head;

               while(curr != null){
                   count++;
                   curr= curr.next;
               }
                  curr= head;
               if(count- n ==0){
                return curr.next;
               }
             int i=0;
               ListNode prev= null;
            
             while(i!= count-n){
                  prev= curr;
                  curr= curr.next;
                  i++;
             }
             prev.next= curr.next;

             return head;
    }
}
