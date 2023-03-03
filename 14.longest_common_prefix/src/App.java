import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        String[] tester = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(tester));

    }

    public static String longestCommonPrefix(String[] strs){
        String result = "";
        Arrays.sort(strs); // sort in alphabetical order, meaning the shortest will be first and longest last
        String first = strs[0];
        String last = strs[strs.length - 1];
        int i = 1;
        while(first.substring(0, i).equals(last.substring(0, i))){
            result = first.substring(0, i);
            i++;
        }
        return result;
    }
}
