// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int x = scanner.nextInt();

        boolean result = (x < 10) && (x > 0);

        System.out.println(result);
    }
}