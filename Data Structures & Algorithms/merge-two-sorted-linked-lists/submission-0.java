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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode i=  list1;
        ListNode j= list2;
         ListNode head= new ListNode(-101);
             ListNode  k= head;
      while(i!= null && j!= null){
            if(i.val < j.val){
                 k.next= i;
                i= i.next;

            }
            else{
                   k.next= j;
                   j= j.next;
            }

            k= k.next;
        }

        while(i!= null){
            k.next= i;
            i= i.next;
            k= k.next;
        }
         while(j!= null){
            k.next= j;
            j= j.next;
            k= k.next;
        }
        
        return head.next;
    }
}