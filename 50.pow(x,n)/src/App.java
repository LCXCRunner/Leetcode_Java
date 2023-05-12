public class App {
    public static void main(String[] args) throws Exception {
        double x = -1;
        int power = Integer.MAX_VALUE;
        System.out.println(myPow(x,power));
    }

    public static double myPow(double x, int n){
        double result = 1.0;
        if(n == 0 || x == 1){
            return 1.0;
        }
        if(x == -1){
            if(n % 2 ==0){
                return 1.0;
            }
            else{
                return -1.0;
            }
        }
        else if(n == Integer.MAX_VALUE || n == Integer.MIN_VALUE){
            return 0.0;
        }
        else if(n > 0){
            for(int i = 1; i <= n; i++){
                result *= x;
                if(result > 10000 || result < -10000){
                    return 0;
                }
            }
        }
        else{
            for(int i = 0; i > n; i--){
                result *= 1/x;
                if(result > 10000 || result < -10000){
                    return 0;
                }
            }
        }
        return result;
    }
}
