public class App {
    public static void main(String[] args) throws Exception {
        int dividend = Integer.MIN_VALUE;
        int divisor = -1109186033;

        System.out.println("Answer: " + (dividend/divisor));
        System.out.println("Method Answer: " + divide(dividend,divisor));

        //System.out.println(12<<0<<1);
    }

    public static int divide(int dividend, int divisor){
        boolean isNegative = false;
        if(dividend == 0){
            return 0;
        }
         if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;//edge case that is out of range of int
        }
        if(dividend < 0 ^ divisor < 0){//XOR statement looking for negative answers
            isNegative = true;
        }
        if(Math.abs(divisor) == 1){
            int posDividend = Math.abs(dividend);
            return (isNegative ? -posDividend : posDividend);
        }
        if(Math.abs(dividend>>1) < Math.abs(divisor>>1)){
            return 0;
        }
       

        int posDividend = Math.abs(dividend);
        int posDivisor = Math.abs(divisor);
        int runningSum = 0;
        int count = 0;

        if(dividend == Integer.MIN_VALUE){//edge case of Integer.MIN_VALUE
            posDividend = Math.abs(dividend>>1);
            while(posDividend - runningSum >= posDivisor){
                runningSum += posDivisor;
                count++;
            }
            count = count<<1;
            return (isNegative ? -count : count);
        }
        while(posDividend - runningSum >= posDivisor){
            runningSum += posDivisor;
            count++;
        }
        return (isNegative ? -count : count);
    }
}
