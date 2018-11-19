import java.math.BigInteger;

public class Factorial {

    public static BigInteger print(int count)
    {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= count; ++i) {
            result = result.multiply(BigInteger.valueOf(i));
            System.out.print(result + " ");
        }
        System.out.println("");
        return result;
    }
}

