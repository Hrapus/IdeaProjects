// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int result = 0;

        for (int i = x; i <= y; i++) {
            result = result + i;
        }

        System.out.println(result);
    }
}