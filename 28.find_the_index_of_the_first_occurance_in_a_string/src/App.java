public class App {
    public static void main(String[] args) throws Exception {
        String tester = "compoundword";
        System.out.println(strStr(tester, "ruby"));
    }

    public static int strStr(String haystack, String needle){
        int haystackL = haystack.length();
        int needleL = needle.length();
                
        for(int i = 0; i < haystackL; i++){
            //System.out.print(haystack.charAt(i) + ", ");
            if(haystack.substring(i, needleL + i).equals(needle)){
                System.out.println(haystack.substring(i, needleL + i));
                return i;
            }
            else{
                continue;
            }
        }
        //*/
        return -1;
    }
}
