import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;
        int next = ((b - a) + 1);

        Random random = new Random(a + b);

        for (int i = 0; i < n; i++) {
            sum += ((random.nextInt(next)) + a);

        }

        System.out.println(sum);
    }
}