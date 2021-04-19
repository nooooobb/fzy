public class 环形链表 {
    public ListNode detectCycle(ListNode head) {
        ListNode quick = head;
        ListNode slow = head;
        while (quick != null && quick.next != null){
            quick = quick.next.next;
            slow = slow.next;
            if (quick == slow){
                quick = head;
                while (quick != slow){
                    quick = quick.next;
                    slow = slow.next;
                }
                return quick;
            }

        }

        return null;
    }
}
