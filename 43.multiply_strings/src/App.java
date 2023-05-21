public class App {
    public static void main(String[] args) throws Exception {
        String tester = "123456789";
        String tester2 = "987654321";

        System.out.println(tester.substring(tester.length() - 1));

        System.out.println(multiply(tester, tester2));
    }

    public static String multiply(String num1, String num2){

        return "test";
    }
    /*
     * long number1 = Long.parseLong(num1);
        long number2 = Long.parseLong(num2);
        Long result = number1 * number2;

        return result.toString();
        I see two optoins
        - multiply the final char in the string against each char in the first string and then sum all of the results
        - brute for it, and just add the second number x amount of times to itself, x being number 1
        - both have to be done using strings for length
     */
}
