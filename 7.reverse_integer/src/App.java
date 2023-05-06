public class App {
    public static void main(String[] args) throws Exception {
        int tester = -2147483648;
        //System.out.println(Integer.MIN_VALUE);
        System.out.println(reverseInt(tester));
    }

    public static int reverseInt(int x){
        boolean isNeg = false;
        if(x == Integer.MIN_VALUE){
            return 0;
        }
        else if(x < 0){
            isNeg = true;
            x *= -1;
        }
        else if(x == 0){
            return 0;
        }
        String result = "";
        int helper = 0;
        while(x != 0){
            helper = x%10;
            result = result + helper;
            x /= 10;
        }
        long checker = Long.valueOf(result);
        System.out.println();
        if(checker >= 2147483647 || checker <= -2147483647){// makes sure that the value after reversing can actually be an integer and does not create and overflow error
            return 0;
        }
        int resultInt = Integer.valueOf(result);
        if(isNeg == true){
            resultInt = resultInt * -1;
        }
        return resultInt;
    }
}
