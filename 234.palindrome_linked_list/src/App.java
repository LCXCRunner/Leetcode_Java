import java.util.LinkedList;

public class App { 
  public static void main(String[] args) { 
    LinkedList<Integer> list = new LinkedList<Integer>();
    list.add(1);
    list.add(1);
    list.add(8);
    list.add(9);
    System.out.println(list);
    isPalindrome(list);
  } 

public static boolean isPalindrome(LinkedList<Integer> intList){
    int halfListLength = intList.size() / 2;

    
    return false;
}
}