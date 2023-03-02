public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(isPalindrome(10));
    }
    public static boolean isPalindrome(int x){
        if(x < 0){
            return false;
        }
        String xString = Integer.toString(x);
        int i = 0;
        int j = xString.length() - 1;

        while(i != j && i < j){
            if(xString.charAt(i) == xString.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
