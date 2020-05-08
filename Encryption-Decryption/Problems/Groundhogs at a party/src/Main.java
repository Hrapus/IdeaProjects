// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int x = scanner.nextInt();
        boolean week = scanner.nextBoolean();

        boolean result = (!week && (x >= 10 && x <= 20)) ||
                (week && (x >= 15 && x <= 25));

        System.out.println(result);
    }
}