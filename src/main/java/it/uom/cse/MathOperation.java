package it.uom.cse;

import java.util.Arrays;


public class MathOperation {

    public static int sumOfPrimes(int n){
        int sum =0;
        for(int i = 2; i < n; i++){
            boolean isPrime = true;
            for(int j = 2; j < n - 1; j++){
                if(i %j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                sum += i;
            }
        }
        return sum;
    }

    public static double add(double... operands)
    {
        return Arrays.stream(operands).reduce(0d, Double::sum);
    }

    public static double subtract(double operand1, double operand2)
    {
        return operand1 - operand2;
    }

}
