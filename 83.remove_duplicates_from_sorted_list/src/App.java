public class App {
    public static void main(String[] args) throws Exception {
        ListNode head = new ListNode(0,null);
        ListNode tail = new ListNode();
        tail.next = head;

        ListNode node1 = new ListNode(0, null);
        ListNode node2 = new ListNode(1, null);
        ListNode node3 = new ListNode(1, null);
        ListNode node4 = new ListNode(2, null);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ListNode result = deleteDuplicates(head);
        tail = result;
        System.out.print("Result: ");
        while(tail.next != null){
            System.out.print(tail.val + ", ");
            tail = tail.next;
        }
        System.out.println(tail.val);
    }

    public static ListNode deleteDuplicates(ListNode head){
        ListNode tail = head;
        while(tail != null && tail.next != null){
            if(tail.val == tail.next.val){
                tail.next = tail.next.next;
            }
            else{
            tail = tail.next;
            }
        }
        return head;
    }
    }
}
