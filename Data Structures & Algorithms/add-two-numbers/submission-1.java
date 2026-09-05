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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode i= l1;
        ListNode j= l2;
       
        ListNode k= null;
        ListNode head=null;
         int c=0;
        while(i!= null && j!= null){
               int v= (i.val + j.val+ c)%10;
               c= (i.val + j.val+ c)/10;

               if(k==null){
                k= new ListNode(v);
                 head=k;
               }
               else{
                k.next= new ListNode(v);
                 k= k.next;
               }
               i= i.next;
               j= j.next;
             
        }

        while(i!=null){
               int v= (i.val+ c)%10;
               c= (i.val+ c)/10;

               k.next= new ListNode(v);
               i= i.next;
               k= k.next;
        }
                while(j!=null){
               int v= (j.val+ c)%10;
               c= (j.val+ c)/10;

               k.next= new ListNode(v);
               j= j.next;
               k= k.next;
        }

                   if(c>0){
                    k.next= new ListNode(c);
                   }
              return head;
    }
}
