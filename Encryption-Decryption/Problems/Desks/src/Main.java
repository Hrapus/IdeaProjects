// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        int x0 = x / 2 + x % 2;
        int y0 = y / 2 + y % 2;

        int z0 = z / 2 + z % 2;


        System.out.println(x0 + y0 + z0);
    }
}