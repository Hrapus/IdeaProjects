// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();

        long dif = b - a;

        long result = a;


        for (int i = 1; i < dif; i++) {
            result = result * (a + i);
        }

        System.out.println(result);

    }
}