import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int sum = 0;

        for (int x : arr) {
            if (x > n)
                sum += x;
        }

        System.out.println(sum);
    }
}