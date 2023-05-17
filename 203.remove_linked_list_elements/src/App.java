public class App {
    public static void main(String[] args) throws Exception {
        ListNode node4 = new ListNode(5, null);
        ListNode node3 = new ListNode(1, node4);
        ListNode node2 = new ListNode(5, node3);
        ListNode node1 = new ListNode(8, node2);

        ListNode tester = removeElements(node1, 5);
        ListNode tail = new ListNode(0, tester);

        while(tail.next != null){
            System.out.print(tail.next.val + ", ");
            tail = tail.next;
        }
    }

    public static ListNode removeElements(ListNode head, int val){
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode itterator = new ListNode();
        itterator = newHead;

        while(itterator.next != null){
           if(itterator.next.val == val){
                itterator.next = itterator.next.next;
           }
           else{
            itterator = itterator.next;
           }
        }
        return newHead.next;
    }
}
