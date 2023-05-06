public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s){
        s = alphanumeric(s);
        s = s.toLowerCase();
        if(s == null){
            return true;
        }
        String reversed = reverseString(s);
        reversed = reversed.toLowerCase();
        if(s.equals(reversed)){
            return true;
        }
        else{
            return false;
        }
    }

    public static String alphanumeric(String s){
        String newString = "";
        for(int i = 0; i < s.length(); i++){
            boolean condition1 = Character.isDigit(s.charAt(i));
            boolean condition2 = Character.isAlphabetic(s.charAt(i));
            if(condition1 || condition2){
                newString += s.substring(i, i + 1);
            }
        }
        return newString;
    }

    public static String reverseString(String s){
        String result = "";
        for(int i = s.length() -1; i >= 0; i--){
            result += s.substring(i, i + 1);
        }
        return result;
    }
}