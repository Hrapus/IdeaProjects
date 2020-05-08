// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        float arAv = 0;
        int counter = 0;

        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                arAv += i;
                counter++;
            }
        }

        System.out.println(arAv / counter);
    }
}