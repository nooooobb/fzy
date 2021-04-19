public class Ali {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
//        l1.next = new ListNode(2);
//        l1.next.next = new ListNode(4);
//        l1.next.next.next = new ListNode(3);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
//        l2.next.next = new ListNode(4);

        ListNode res = sum(l1,l2);
        while(res!=null){
            System.out.println(res.val);
            res = res.next;
        }
//        System.out.println(sum(l1, l2));
    }
    public static ListNode sum(ListNode head1,ListNode head2){
        ListNode pre1 = reverse(head1);
        ListNode pre2 = reverse(head2);
        ListNode res = new ListNode(0);
        ListNode mid = res;

        int carry = 0;
        while(pre1!=null && pre2!=null){
            int n1 = pre1 != null ? pre1.val : 0;
            int n2 = pre2 != null ? pre2.val : 0;

            int sum = n1+n2+carry;
            carry = sum/10;

            mid.next = new ListNode(sum%10);
            mid = mid.next;
            pre1 = pre1.next;
            pre2 = pre2.next;
        }


        while (pre1 != null){
            int a = pre1.val;
            int sum = a + carry;
            carry = sum/10;
            mid.next = new ListNode(sum%10);
            mid = mid.next;
            pre1 = pre1.next;
        }

        while (pre2 != null){
            int a = pre2.val;
            int sum = a + carry;
            carry = sum/10;
            mid.next = new ListNode(sum%10);
            mid = mid.next;
            pre2 = pre2.next;
        }

        if(carry > 0){
            mid.next = new ListNode(1);
        }

        return reverse(res.next);
    }

    public static ListNode reverse(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
