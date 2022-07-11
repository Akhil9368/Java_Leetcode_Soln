public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA ==null || headB== null ){
            return null;
        }
        ListNode start1 = headA;
        ListNode start2 =headB;
       while(start1 != start2 ){
           start1 = start1==null ? headB:start1.next;
           start2 = start2==null ? headA:start2.next;
       }
        return start1;
    }
}
