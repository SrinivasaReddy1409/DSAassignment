public class dsa12{
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)
        return head;
        ListNode current=head;
        ListNode newhead=head.next;
        while(current!=null && current.next!=null){
            ListNode temp=current.next;
            current.next=current.next.next;
            temp.next=current;
            current=current.next;
            if(current!=null && current.next!=null)
            temp.next.next=current.next;
        }
        return newhead;
    }
}
