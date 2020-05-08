// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int index = scanner.nextInt();

        int[] arr = new int[index];
        int sum = 0;

        for (int i = 0; i < index; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] % 6 == 0)
                sum += arr[i];
        }

        System.out.println(sum);

    }
}