public class App {
    public static void main(String[] args) throws Exception {
        int dividend = Integer.MIN_VALUE;
        int divisor = 2;

        System.out.println("Answer: " + (dividend/divisor));
        System.out.print("Method Answer: " + divide(dividend,divisor));
    }

    public static int divide(int dividend, int divisor){
        boolean isNegative = false;
        if(dividend == 0){
            return 0;
        }
        if(dividend == Integer.MIN_VALUE && divisor == 1){//edge case
            return Integer.MIN_VALUE;
        }
        if(dividend == Integer.MAX_VALUE && divisor == 1){//edge case
            return Integer.MAX_VALUE;
        }
        if(dividend == Integer.MIN_VALUE && divisor == -1){//edge case
            return Integer.MAX_VALUE;
        }
        if(dividend == Integer.MAX_VALUE && divisor == -1){//edge case
            return Integer.MIN_VALUE;
        }
        if(dividend < 0 ^ divisor < 0){
            isNegative = true;
        }

        long longDividend = Math.abs(dividend);
        long longDivisor = Math.abs(divisor);
        long runningSum = 0;
        long count = 0;

        while(runningSum <= longDividend){
            runningSum += longDivisor;
            count++;
        }
        count--;
        return (int)(isNegative ? -count : count);
    }
}
