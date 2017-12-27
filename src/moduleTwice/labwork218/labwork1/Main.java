package moduleTwice.labwork218.labwork1;

import java.math.BigInteger;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(40) + 10;

        System.out.println(n + "! = " + factorial(n));
    }

    public static BigInteger factorial(int n) {
        BigInteger factorial = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            BigInteger temp = new BigInteger(String.valueOf(i));
            factorial = factorial.multiply(temp);

        }
        return factorial;
    }
}
