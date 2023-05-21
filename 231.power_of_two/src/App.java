public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(isPowerOfTwo(31));
    }

    public static boolean isPowerOfTwo(int n) {
        double result = 2;

        if(n == 1){
            return true;
        }

        while(result <= n){
            if(result == n){
                return true;
            }
            result *= 2;
            System.out.print(result + ", ");
        }
        return false;
    }
}
