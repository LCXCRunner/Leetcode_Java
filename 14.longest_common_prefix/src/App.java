import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        String[] tester = {""};
        System.out.println(longestCommonPrefix(tester));

    }

    public static String longestCommonPrefix(String[] strs){
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        int idx = 0;
        while(idx < first.length() && idx < last.length()){
            if(first.charAt(idx) == last.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
        return first.substring(0, idx);
        }
    }

