class Solution{
     public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode n = null;
        while(curr != null){
            n=curr.next;
            curr.next=prev;
            prev=curr;
            curr=n;
        }
        head=prev;
        return head ;
    }
}

// recursive way
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        if(head.next== null){
            return head;
        }
        
        ListNode node = reverseList(head.next);
        head.next.next =head;
        head.next= null;
        
        return node;
        
    }
}
