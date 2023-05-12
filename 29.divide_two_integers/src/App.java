public class App {
    public static void main(String[] args) throws Exception {
        int dividend = 101;
        int divisor = 5;

        System.out.println("Answer: " + (dividend/divisor));
        System.out.println("Method Answer: " + divide(dividend,divisor));

        //System.out.println(12<<0<<1);
    }

    public static int divide(int dividend, int divisor){
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE; //Cornor case when -2^31 is divided by -1 will give 2^31 which doesnt exist so overflow 
         
        boolean negative = dividend < 0 ^ divisor < 0; //Logical XOR will help in deciding if the results is negative only if any one of them is negative
        
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        int quotient = 0, subQuot = 0;
        
        // << will shift you left in binary and >> will shift you right
        while (dividend - divisor >= 0) {
            for (subQuot = 0; dividend - (divisor << subQuot << 1) >= 0; subQuot++);
            quotient += 1 << subQuot; //Add to the quotient
            dividend -= divisor << subQuot; //Substract from dividend to start over with the remaining
            System.out.println(dividend);
        }
        return negative ? -quotient : quotient;
    }
}
