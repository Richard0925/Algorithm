package algorithm;

import java.math.BigInteger;

public class Factorial {

    public BigInteger factorialCalculation(int number){

        BigInteger result = new BigInteger("1");

        for (int i = 1; i <= number; i++){

            result = result.multiply(new BigInteger(i + ""));// BigInteger(must be some String so "" is needed)
        }

        return result;
    }

    public static void main(String[] args) {

        Factorial factorial = new Factorial();

        BigInteger value1 = factorial.factorialCalculation(6);

        System.out.println(value1);
    }
}