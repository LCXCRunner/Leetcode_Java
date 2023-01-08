import java.util.LinkedList;

public class App { 
  public static void main(String[] args) { 
    LinkedList<Integer> list = new LinkedList<Integer>();
    list.add(1);
    list.add(2);
    list.add(2);
    list.add(1);
    System.out.println(list);
    System.out.println(isPalindrome(list));
  } 

public static boolean isPalindrome(LinkedList<Integer> intList){
    int Length = intList.size();
    LinkedList<Integer> checkerList = new LinkedList<>();

    for(int i = Length-1; i >= 0; i--){
        checkerList.add(intList.get(i));
    }

    System.out.println(intList);
    System.out.println(checkerList);

    if(intList.equals(checkerList)){
      return true;
    }
    else{
      return false;
    }

}
}