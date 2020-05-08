// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();

        if ((K % N == 0 || K % M == 0) && (N * M >= K)){
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
}