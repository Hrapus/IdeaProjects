// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        long n = 1;
        while (m > 0) {
            m /= n++;
        }
        System.out.println(--n);
    }
}