// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int max;

        do {
            max = scanner.nextInt();
            if (a < max)
                a = max;
        } while (max != 0);

        System.out.println(a);

    }
}