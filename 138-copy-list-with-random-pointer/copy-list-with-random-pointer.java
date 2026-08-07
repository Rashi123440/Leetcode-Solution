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
    void insertNode(Node head){
        Node temp=head;
         while(temp!=null){
            Node nextelement = temp.next;
            Node copy= new Node(temp.val);
            copy.next=nextelement;
            temp.next=copy;
            temp=nextelement;
         }
    }
    void connectrandompointer(Node head){
        Node temp=head;
        while(temp!=null){
            Node copynode=temp.next;
            if(temp.random!=null){
                copynode.random=temp.random.next;

            }
            else{
                copynode.random=null;
            }
        
        temp=temp.next.next;
        }
    }
Node getdeepcopylist(Node head){
    Node temp=head;
    Node dummyNode = new Node(-1);
    Node res=dummyNode;
    while(temp!=null){
        res.next=temp.next;
        res=res.next;
        temp.next=temp.next.next;
        temp=temp.next;

    }
    return dummyNode.next;
}

    public Node copyRandomList(Node head) {
        if(head==null){
            return null;

        }
        insertNode(head);
        connectrandompointer(head);
         return getdeepcopylist(head);
    }
        
}