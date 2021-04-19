import java.util.concurrent.ThreadPoolExecutor;

public class 删除链表重复节点 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)return head;
        ListNode pre = head;

        while(pre.next != null){
            //如果当前节点的值等于下个节点的值 就把下个节点跳过去，当前指针不动
            if(pre.val == pre.next.val){

                pre.next = pre.next.next;
            }else{
                pre = pre.next;
            }
        }

        return head;

    }
}
