public class App {
    public static void main(String[] args) throws Exception {
        String tester = "123456789";
        String tester2 = "987654321";

        System.out.println(multiply(tester, tester2));
    }

    public static String multiply(String num1, String num2){
        long number1 = Long.parseLong(num1);
        long number2 = Long.parseLong(num2);
        Long result = number1 * number2;

        return result.toString();
    }
}
