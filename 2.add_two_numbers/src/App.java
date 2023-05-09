public class App {
    public static void main(String[] args) throws Exception {
        Long tester1 = 0L;

        ListNode head = longToLinkedListReverseOrder(tester1);
        ListNode tail = head;

        System.out.print("Head1: ");
        while(tail.next != null){
            System.out.print(tail.val + ", ");
            tail = tail.next;
        }
        System.out.println(tail.val);


        Long tester2 = 100L;

        ListNode head2 = longToLinkedListReverseOrder(tester2);
        ListNode tail2 = head2;

        System.out.print("Head2: ");
        while(tail2.next != null){
            System.out.print(tail2.val + ", ");
            tail2 = tail2.next;
        }
        System.out.println(tail2.val);

        ListNode result = addTwoNumbers(head, head2);
        ///*
        ListNode tail3 = result;

        System.out.print("Result: ");
        while(tail3.next != null){
            System.out.print(tail3.val + ", ");
            tail3 = tail3.next;
        }
        System.out.println(tail3.val);
        //*/
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode head = new ListNode(0,null);
        ListNode tail = new ListNode(0, head);
        ListNode deadNode = new ListNode(0, null);
        int carry = 0;
        int remainder = 0;
        int added = 0;

        while(tail.next != null){
            //find the value of the current place
            ListNode newNode = new ListNode(0,null);
            added = l1.val + l2.val + carry;
            remainder = added % 10;
            newNode.val = remainder;
            if(added > 9){
                carry = 1;
            }
            else{
                carry = 0;
            }
            
            //add to result list and then move on to next node
            if(head.next == null){
                head.next = newNode;
            }
            else{
                tail = tail.next;
            }
            tail.next = newNode;

            //check if there are digits left in the list, if not then use zero
            if(l1.next == null && l2.next == null){
                if(carry == 1){//make sure to add the final floating carry, lists will be empty.
                    ListNode finalNode = new ListNode(carry, null);
                    tail = tail.next;
                    tail.next = finalNode;
                    return head.next;
                }
                else{
                    return head.next;// stops if both source lists are empty
                }
            }
            if(l1.next == null){
                l1 = deadNode;
            }
            else{
                l1 = l1.next;
            }
            if(l2.next == null){
                l2 = deadNode;
            }
            else{
                l2 = l2.next;
            }
        }
        
        return head.next;
    }

    //example: 1234 would return [4,3,2,1] as a linked list
    public static ListNode longToLinkedListReverseOrder(long num){
        ListNode head = new ListNode();
        ListNode tail = new ListNode();

        if(num == 0){
            head.val = 0;
            return head;
        }

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
