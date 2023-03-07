import java.util.ArrayList;

public class App { 
  public static void main(String[] args) { 
    ListNode head = new ListNode();
    ListNode node2 = new ListNode(3, null);
    ListNode node3 = new ListNode(2, null);
    ListNode node4 = new ListNode(1, null);
    head.next = node2;
    node2.next = node3;
    node3.next = node4;
    head.val = 1; 
    
    System.out.println(isPalindrome(head));
  } 

  public static boolean isPalindrome(ListNode head){
    if(head == null){
      return false;
    }

    ArrayList<Integer> list = new ArrayList<Integer>();
    ListNode curr = head;

    while(curr != null){
      list.add(curr.val);
      //System.out.println(curr.val);
      curr = curr.next;
    }

    int length = list.size();
    ArrayList<Integer> checker = new ArrayList<>();

    for(int i = length - 1; i >= 0; i--){
      checker.add(list.get(i));
    }
    if(checker.equals(list)){
      return true;
    }

    return false;
}
}