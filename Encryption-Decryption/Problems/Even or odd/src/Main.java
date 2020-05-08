// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int x;

        do {

            x = scanner.nextInt();
            if (x == 0) break;
                else if (x % 2 == 0){
                    System.out.println("even");
                } else System.out.println("odd");

        }
        while (x != 0);

    }
}