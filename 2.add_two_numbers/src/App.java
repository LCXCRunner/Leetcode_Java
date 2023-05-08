public class App {
    public static void main(String[] args) throws Exception {
        ListNode head1 = new ListNode(0, null);
        int count = 0;
        while(count <= 4){
            ListNode newNode = new ListNode();
            newNode.val = count;
            newNode.next = head1;
            head1 = newNode;
            count++;
        }
        /*
        System.out.print("Head1: ");
        while(head1.next != null){
            System.out.print(head1.val + ", ");
            head1 = head1.next;
        }
        System.out.println();
        */

        ListNode head2 = new ListNode(0, null);
        int count2 = 4;
        while(count2 >= 0){
            ListNode newNode = new ListNode();
            newNode.val = count2;
            newNode.next = head2;
            head2 = newNode;
            count2--;
        }
        /*
        System.out.print("Head2: ");
        while(head2.next != null){
            System.out.print(head2.val + ", ");
            head2 = head2.next;
        }
        System.out.println();
        */

        addTwoNumbers(head1, head2);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode newNode = new ListNode();
        int list1 = l1.val;
        int list2 = l2.val;
        int multiplier = 10;

        while(l1.next != null){
            l1 = l1.next;
            list1 = l1.val * multiplier + list1;
            multiplier *= 10;
        }
        System.out.println(list1);
        multiplier = 10;

        while(l2.next != null){
            l2 = l2.next;
            list2 = l2.val * multiplier + list2;
            multiplier *= 10;
        }
        System.out.println(list2);

        
        return newNode;
    }
}
