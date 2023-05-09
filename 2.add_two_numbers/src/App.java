public class App {
    public static void main(String[] args) throws Exception {
        ListNode head1 = new ListNode(1, null);
        ListNode node2 = new ListNode(2, head1);
        ListNode node3 = new ListNode(3, node2);
        ListNode tail1 = new ListNode(0, node3);
        ///*
        System.out.print("Head1: ");
        while(tail1.next != null){
            tail1 = tail1.next;
            System.out.print(tail1.val + ", ");
        }
        System.out.println();
        //*/

        ListNode head2 = new ListNode(5, null);
        ListNode node4 = new ListNode(7, head2);
        ListNode node5 = new ListNode(9, node4);
        ListNode tail2 = new ListNode(0, node5);

        System.out.print("Head2: ");
        while(tail2.next != null){
            tail2 = tail2.next;
            System.out.print(tail2.val + ", ");
        }
        System.out.println();

        ListNode result = addTwoNumbers(node3, node5);

        System.out.print("Head: ");
        while(result.next != null){
            System.out.print(result.val + ", ");
            result = result.next;
        }
        System.out.println(result.val);
        System.out.println();

        
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode head = new ListNode(0,null);
        ListNode tail = new ListNode();
        tail.next = head;
        int list1 = l1.val;
        int list2 = l2.val;
        int multiplier = 10;
        int resultInt = 0;

        if(l1.val == 0 && l2.val == 0){
            return head;
        }

        while(l1.next != null){
            l1 = l1.next;
            list1 = l1.val * multiplier + list1;
            multiplier *= 10;
        }
        //System.out.println(list1);
        multiplier = 10;

        while(l2.next != null){
            l2 = l2.next;
            list2 = l2.val * multiplier + list2;
            multiplier *= 10;
        }
        //System.out.println(list2);

        resultInt = list1 + list2;
        //System.out.println(resultInt);
        
        while(resultInt != 0){
            ListNode newNode = new ListNode(resultInt % 10, null);
            if(head.next == null){
                head.next = newNode;
                //head.val = newNode.val;
            }
            else{
                tail.next = newNode;
            }
            tail = newNode;
            resultInt /= 10;
        }
        return head.next;
    }
}
