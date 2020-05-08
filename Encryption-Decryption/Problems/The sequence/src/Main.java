// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int digit = scanner.nextInt();
        int counter = 0;

        for (int i = 0; i <= digit; i++) {
            for (int j = 0; j < i; j++) {
                if (counter < digit) {
                    System.out.print(i + " ");
                    counter++;
                } else break;
            }
        }
    }
}