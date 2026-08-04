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
        ListNode temp=head;
        ListNode prevnode = null;
        ListNode nextNode =null;
        while(temp!=null){
           ListNode  kth = temp;
           for(int i=1;i<k;i++){
            if(kth==null){
                break;
            }
            kth=kth.next;
           }
            if(kth==null){
                if(prevnode!=null){
                    prevnode.next=temp;
                }
                    break;
                }
            nextNode = kth.next;
            kth.next=null;
            reverse(temp);
            if(temp==head){
                head=kth;
            }
            else{
                prevnode.next=kth;
            }
                prevnode=temp;
                temp=nextNode;
            }
            return head;
            }
            public void reverse(ListNode head){
                ListNode prev= null;
                ListNode curr=head;
                while(curr!=null){
                    ListNode next =curr.next;
                    curr.next=prev;
                    prev=curr;
                    curr=next;
        }
        
    }
}