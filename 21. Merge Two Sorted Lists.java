class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
     ListNode dummy = new ListNode(0);
	ListNode p=dummy;

	while(list1!=null &&list2!=null){
		if(list1.val<list2.val){
			p.next=list1;
			list1=list1.next;
		}else{
			p.next=list2;
			list2=list2.next;
		}
		p=p.next;
	}
		p.next=(list1==null)?list2:list1;
	return dummy.next;
}
}