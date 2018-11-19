
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.math.BigInteger;

public class FibonacciTest {

    @DataProvider
    public Object[][] fibonacciSequence() {
        return new BigInteger[][] {
                {new BigInteger("1"), new BigInteger("0")},
                {new BigInteger("2"), new BigInteger("1")},
                {new BigInteger("3"), new BigInteger("1")},
                {new BigInteger("4"), new BigInteger("2")},
                {new BigInteger("5"), new BigInteger("3")},
                {new BigInteger("6"), new BigInteger("5")},
                {new BigInteger("7"), new BigInteger("8")},
                {new BigInteger("8"), new BigInteger("13")},
                {new BigInteger("9"), new BigInteger("21")},
                {new BigInteger("10"), new BigInteger("34")},
                {new BigInteger("11"), new BigInteger("55")},
                {new BigInteger("12"), new BigInteger("89")},
                {new BigInteger("13"), new BigInteger("144")},
                {new BigInteger("14"), new BigInteger("233")},
                {new BigInteger("15"), new BigInteger("377")},
                {new BigInteger("16"), new BigInteger("610")},
                {new BigInteger("17"), new BigInteger("987")},
                {new BigInteger("18"), new BigInteger("1597")},
                {new BigInteger("19"), new BigInteger("2584")},
                {new BigInteger("20"), new BigInteger("4181")},
                {new BigInteger("21"), new BigInteger("6765")},
                {new BigInteger("22"), new BigInteger("10946")},
                {new BigInteger("23"), new BigInteger("17711")},
                {new BigInteger("24"), new BigInteger("28657")},
                {new BigInteger("25"), new BigInteger("46368")},
                {new BigInteger("26"), new BigInteger("75025")},
                {new BigInteger("27"), new BigInteger("121393")},
                {new BigInteger("28"), new BigInteger("196418")},
                {new BigInteger("29"), new BigInteger("317811")},
                {new BigInteger("30"), new BigInteger("514229")},
                {new BigInteger("31"), new BigInteger("832040")},
                {new BigInteger("32"), new BigInteger("1346269")},
                {new BigInteger("33"), new BigInteger("2178309")},
                {new BigInteger("34"), new BigInteger("3524578")},
                {new BigInteger("35"), new BigInteger("5702887")},
                {new BigInteger("36"), new BigInteger("9227465")},
                {new BigInteger("37"), new BigInteger("14930352")},
                {new BigInteger("38"), new BigInteger("24157817")},
                {new BigInteger("39"), new BigInteger("39088169")},
                {new BigInteger("40"), new BigInteger("63245986")},
                {new BigInteger("41"), new BigInteger("102334155")},
                {new BigInteger("42"), new BigInteger("165580141")},
                {new BigInteger("43"), new BigInteger("267914296")},
                {new BigInteger("44"), new BigInteger("433494437")},
                {new BigInteger("45"), new BigInteger("701408733")},
                {new BigInteger("46"), new BigInteger("1134903170")},
                {new BigInteger("47"), new BigInteger("1836311903")},
                {new BigInteger("48"), new BigInteger("2971215073")},
                {new BigInteger("49"), new BigInteger("4807526976")},
                {new BigInteger("50"), new BigInteger("7778742049")},
                {new BigInteger("51"), new BigInteger("12586269025")},
                {new BigInteger("52"), new BigInteger("20365011074")},
                {new BigInteger("53"), new BigInteger("32951280099")},
                {new BigInteger("54"), new BigInteger("53316291173")},
                {new BigInteger("55"), new BigInteger("86267571272")},
                {new BigInteger("56"), new BigInteger("139583862445")},
                {new BigInteger("57"), new BigInteger("225851433717")},
                {new BigInteger("58"), new BigInteger("365435296162")},
                {new BigInteger("59"), new BigInteger("591286729879")},
                {new BigInteger("60"), new BigInteger("956722026041")},
                {new BigInteger("61"), new BigInteger("1548008755920")},
                {new BigInteger("62"), new BigInteger("2504730781961")},
                {new BigInteger("63"), new BigInteger("4052739537881")},
                {new BigInteger("64"), new BigInteger("6557470319842")},
                {new BigInteger("65"), new BigInteger("10610209857723")},
                {new BigInteger("66"), new BigInteger("17167680177565")},
                {new BigInteger("67"), new BigInteger("27777890035288")},
                {new BigInteger("68"), new BigInteger("44945570212853")},
                {new BigInteger("69"), new BigInteger("72723460248141")},
                {new BigInteger("70"), new BigInteger("117669030460994")},
                {new BigInteger("71"), new BigInteger("190392490709135")},
                {new BigInteger("72"), new BigInteger("308061521170129")},
                {new BigInteger("73"), new BigInteger("498454011879264")},
                {new BigInteger("74"), new BigInteger("806515533049393")},
                {new BigInteger("75"), new BigInteger("1304969544928657")},
                {new BigInteger("76"), new BigInteger("2111485077978050")},
                {new BigInteger("77"), new BigInteger("3416454622906707")},
                {new BigInteger("78"), new BigInteger("5527939700884757")},
                {new BigInteger("79"), new BigInteger("8944394323791464")},
                {new BigInteger("80"), new BigInteger("14472334024676221")},
                {new BigInteger("81"), new BigInteger("23416728348467685")},
                {new BigInteger("82"), new BigInteger("37889062373143906")},
                {new BigInteger("83"), new BigInteger("61305790721611591")},
                {new BigInteger("84"), new BigInteger("99194853094755497")},
                {new BigInteger("85"), new BigInteger("160500643816367088")},
                {new BigInteger("86"), new BigInteger("259695496911122585")},
                {new BigInteger("87"), new BigInteger("420196140727489673")},
                {new BigInteger("88"), new BigInteger("679891637638612258")},
                {new BigInteger("89"), new BigInteger("1100087778366101931")},
                {new BigInteger("90"), new BigInteger("1779979416004714189")},
                {new BigInteger("91"), new BigInteger("2880067194370816120")},
                {new BigInteger("92"), new BigInteger("4660046610375530309")},
                {new BigInteger("93"), new BigInteger("7540113804746346429")},
                {new BigInteger("94"), new BigInteger("12200160415121876738")},
                {new BigInteger("95"), new BigInteger("19740274219868223167")},
                {new BigInteger("96"), new BigInteger("31940434634990099905")},
                {new BigInteger("97"), new BigInteger("51680708854858323072")},
                {new BigInteger("98"), new BigInteger("83621143489848422977")},
                {new BigInteger("99"), new BigInteger("135301852344706746049")},
                {new BigInteger("100"), new BigInteger("218922995834555169026")},
        };
    }

    @Test
    public void checkFibonacciPrintAccept1Returned0() {
        Fibonacci fibonacci = new Fibonacci();
        BigInteger expectedFibonacci = new BigInteger("0");
        Assert.assertEquals(fibonacci.print(new BigInteger("1")), expectedFibonacci);
    }

    @Test
    public void checkFibonacciPrintAccept2Returned1() {
        Fibonacci fibonacci = new Fibonacci();
        BigInteger expectedFibonacci = new BigInteger("1");
        Assert.assertEquals(fibonacci.print(new BigInteger("2")), expectedFibonacci);
    }

    @Test
    public void checkFibonacciPrintAccept50Returned7778742049() {
        Fibonacci fibonacci = new Fibonacci();
        BigInteger expectedFibonacci = new BigInteger("7778742049");
        Assert.assertEquals(fibonacci.print(new BigInteger("50")), expectedFibonacci);
    }

    @Test
    public void checkFibonacciPrintAccept99Returned135301852344706746049() {
        Fibonacci fibonacci = new Fibonacci();
        BigInteger expectedFibonacci = new BigInteger("135301852344706746049");
        Assert.assertEquals(fibonacci.print(new BigInteger("99")), expectedFibonacci);
    }

    @Test
    public void checkFibonacciPrintAccept100Returned218922995834555169026() {
        Fibonacci fibonacci = new Fibonacci();
        BigInteger expectedFibonacci = new BigInteger("218922995834555169026");
        Assert.assertEquals(fibonacci.print(new BigInteger("100")), expectedFibonacci);
    }

    @Test(dataProvider = "fibonacciSequence")
    public void checkFibonacciSequence(BigInteger numberAccept, BigInteger expectedFibonacci) {
        Fibonacci fibonacci = new Fibonacci();
        Assert.assertEquals(fibonacci.print(numberAccept), expectedFibonacci);
    }
}
