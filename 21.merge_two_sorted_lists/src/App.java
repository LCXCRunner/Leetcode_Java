public class App {
    public static void main(String[] args) throws Exception {
        ListNode head = new ListNode();

        ListNode head2 = new ListNode(1);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(8);
        head2.next = node5;
        node5.next = node6;
        node6.next = node7;

        ListNode returned = mergeTwoLists(head, head2);
        ListNode pointer = returned.next;
        
        while(pointer != null){
            System.out.println(pointer.val);
            pointer = pointer.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        ListNode preMergedHead = new ListNode(-1);
        ListNode pointer = preMergedHead;

        while(curr1 != null && curr2 != null){
            if(curr1.val <= curr2.val){
                pointer.next = curr1;
                pointer = pointer.next;
                //System.out.println(pointer.val);
                curr1 = curr1.next;
            }
            else{
                pointer.next = curr2;
                pointer = pointer.next;
                //System.out.println(pointer.val);
                curr2 = curr2.next;
        }
    }

        while(curr1 != null){
            pointer.next = curr1;
            pointer = pointer.next;
            curr1 = curr1.next;
            //System.out.println(pointer.val);
        }

        while(curr2 != null){
            pointer.next = curr2;
            pointer = pointer.next;
            curr2 = curr2.next;
            //System.out.println(pointer.val);
        }
        return preMergedHead.next;
    }
}
