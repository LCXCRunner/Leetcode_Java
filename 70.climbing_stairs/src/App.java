public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(iteratorMethod(3));
    }

    public static int climbStairs(int n){
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else if(n == 2){
            return 2;
        }
        else{
            return (climbStairs(n-1) + climbStairs(n -2));
        }
    }

    public static int iteratorMethod(int n){
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else if(n == 2){
            return 2;
        }
        else if(n == 3){
            return 3;
        }
        else{
            int n1 = 2;
            int n2 = 3;
            int nfinal = 0;
            for(int i = 3; i < n; i++ ){
                nfinal = n1 + n2;
                n1 = n2;
                n2 = nfinal;
            }
            return nfinal;
        }
    }
}