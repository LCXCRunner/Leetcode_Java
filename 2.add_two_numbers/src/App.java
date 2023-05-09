public class App {
    public static void main(String[] args) throws Exception {
        Long tester1 = 9999999991L;

        ListNode head = longToLinkedListReverseOrder(tester1);
        ListNode tail = head;

        System.out.print("Head1: ");
        while(tail.next != null){
            System.out.print(tail.val + ", ");
            tail = tail.next;
        }
        System.out.println(tail.val);


        Long tester2 = 9L;

        ListNode head2 = longToLinkedListReverseOrder(tester2);
        ListNode tail2 = head2;

        System.out.print("Head2: ");
        while(tail2.next != null){
            System.out.print(tail2.val + ", ");
            tail2 = tail2.next;
        }
        System.out.println(tail2.val);
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

    //example: 1234 would return [4,3,2,1] as a linked list
    public static ListNode longToLinkedListReverseOrder(long num){
        ListNode head = new ListNode();
        ListNode tail = new ListNode();

        while(num != 0){
            ListNode newNode = new ListNode((int)(num % 10), null);
            if(head.next == null){
                head.next = newNode;
            }
            else{
                tail.next = newNode;
            }
            tail = newNode;
            num /= 10;
        }
        return head.next;
    }
}
