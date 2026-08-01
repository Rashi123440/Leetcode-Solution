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
    public ListNode sortList(ListNode head) {
      return mergelist(head);
}
 public ListNode mergelist(ListNode head){
    if(head ==null || head.next==null){
        return head;
    }
    ListNode middle=findMiddle(head);
    ListNode righthead = middle.next;
    middle.next=null;
    ListNode left =mergelist(head);
    ListNode right = mergelist(righthead);
    return merge(left,right);
 }
    public ListNode findMiddle(ListNode head){
       ListNode slow=head;
       ListNode fast=head.next;
       while(fast!=null&&fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
       }
       return slow;

    }
    public ListNode merge(ListNode left,ListNode right){
        if(left==null){
            return right;
        }
        if(right==null){
            return left;
        }
        ListNode head;
        if(left.val<=right.val){
            head=left;
            left=left.next;
        }
        else{
            head=right;
            right=right.next;
        
        }
        ListNode temp=head;
        while(left!=null && right!=null){
            if(left.val<=right.val){
                temp.next=left;
                left=left.next;
            }
            else{
                 temp.next=right;
                 right=right.next;
            }
            temp=temp.next;
        }
        if(left!=null){
            temp.next=left;
        }
        if(right!=null){
            temp.next=right;
        }
        return head;
    }
 }

   