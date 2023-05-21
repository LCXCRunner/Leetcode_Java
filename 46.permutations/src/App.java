import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(factorialUsingRecursion(10));
    }
    /*
    public static List<List<Integer>> permute(int[] nums) {
        

    }*/

    /*1 <= nums.length <= 6
    -10 <= nums[i] <= 10
    All the integers of nums are unique.
    we can get away with int here
    */
    public static int factorialUsingRecursion(int n) {
    if (n <= 2) {
        return n;
    }
    return n * factorialUsingRecursion(n - 1);
}
}
