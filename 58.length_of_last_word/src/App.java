public class App {
    public static void main(String[] args) throws Exception {
        String tester = "H ";
        System.out.println(lengthOfLastWord(tester));
    }

    public static int lengthOfLastWord(String s){
        int result;
        int lastSpace = s.lastIndexOf(" ");

        if(lastSpace == -1){
            return s.length();
        }

        while(s.substring(s.length() -1).equals(" ")){
            s = s.substring(0, lastSpace );
            lastSpace = s.lastIndexOf(" ");
        }

        result = s.substring(lastSpace + 1).length();

        return result;
    }
}
