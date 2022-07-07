public class Solution {
    public boolean hasCycle(ListNode head) {
      HashMap<ListNode,Boolean> hm = new HashMap<>();
        ListNode temp = head;
        while(temp != null){
            ListNode val= temp;
            if(hm.get(val) != null){
                return true;
            }
                else
                     hm.put(val,true);
                
                temp = temp.next;
            }
         return false;
           
        }
       
    
}
