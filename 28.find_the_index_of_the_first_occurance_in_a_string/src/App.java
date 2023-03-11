public class App {
    public static void main(String[] args) throws Exception {
        String tester = "abc";
        System.out.println(strStr(tester, "c"));
    }

    public static int strStr(String haystack, String needle){
        int haystackL = haystack.length();
        int needleL = needle.length();
                
        for(int i = 0; i < haystackL; i++){
            //System.out.print(haystack.charAt(i) + ", ");
            if(haystackL == 1 && haystack.substring(0).equals(needle)){
                return 0;
            }
            if(haystackL < i + needleL){
                break;
            }
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
