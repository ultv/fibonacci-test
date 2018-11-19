import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigInteger;

public class FactorialTest {

    @Test
    public void checkFactorialPrintAccept0Returned1() {
        Factorial factorial = new Factorial();
        BigInteger expectedFactorial =
                new BigInteger("1");
        Assert.assertEquals(factorial.print(0), expectedFactorial);
    }

    @Test
    public void checkFactorialPrintAccept1Returned1() {
        Factorial factorial = new Factorial();
        BigInteger expectedFactorial =
                new BigInteger("1");
        Assert.assertEquals(factorial.print(1), expectedFactorial);
    }

    @Test
    public void checkFactorialPrintAccept50Returned30414093201713378043612608166064768844377641568960512000000000000() {
        Factorial factorial = new Factorial();
        BigInteger expectedFactorial =
                new BigInteger("30414093201713378043612608166064768844377641568960512000000000000");
        Assert.assertEquals(factorial.print(50), expectedFactorial);
    }

    @Test
    public void checkFactorialPrintAccept99Returned933262154439441526816992388562667004907159682643816214685929638952175999932299156089414639761565182862536979208272237582511852109168640000000000000000000000() {
        Factorial factorial = new Factorial();
        BigInteger expectedFactorial =
                new BigInteger("933262154439441526816992388562667004907159682643816214685929638952175999932299156089414639761565182862536979208272237582511852109168640000000000000000000000");
        Assert.assertEquals(factorial.print(99), expectedFactorial);
    }

    @Test
    public void checkFactorialPrintAccept100Returned93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000() {
        Factorial factorial = new Factorial();
        BigInteger expectedFactorial =
                new BigInteger("93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000");
        Assert.assertEquals(factorial.print(100), expectedFactorial);
    }
}
