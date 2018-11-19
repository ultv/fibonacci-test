import java.math.BigInteger;

public class Fibonacci {

    public void print() {
        BigInteger result = new BigInteger("0");
        BigInteger preLast = new BigInteger("-1");
        BigInteger last = new BigInteger("1");
        for (int i = 0; i < 100; i++) {
            result = preLast.add(last);
            preLast = last;
            last = result;
            System.out.print(result + " ");
        }
        System.out.println("");
    }

    public BigInteger print(BigInteger count) {
        BigInteger result = new BigInteger("0");
        BigInteger preLast = new BigInteger("-1");
        BigInteger last = new BigInteger("1");
        for (int i = 0; i < count.intValue(); i++) {
            result = preLast.add(last);
            preLast = last;
            last = result;
            System.out.print(result + " ");
        }
        System.out.println("");
        return result;
    }
}

