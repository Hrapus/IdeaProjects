import java.math.BigInteger;
import java.util.Scanner;

class Factorial {

    static BigInteger a = BigInteger.ONE;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        System.out.println(calcDoubleFactorial(x));

    }

    public static BigInteger calcDoubleFactorial(int n) {
        // type your java code here
        BigInteger a = BigInteger.ONE;

        if (n % 2 == 0) {
            for (int i = 2; i <= n; ) {
                a = a.multiply(BigInteger.valueOf(i));
                //System.out.println(a);
                i += 2;
            }

        }
        else {
            for (int i = 1; i <= n; ) {
            a = a.multiply(BigInteger.valueOf(i));
            //System.out.println(a);
            i += 2;
        }

        }
        return a;
    }
}