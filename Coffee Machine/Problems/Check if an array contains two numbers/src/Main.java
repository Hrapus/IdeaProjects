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
        int m = scanner.nextInt();

        boolean result = false;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == n || arr[i] == m){
                if (arr[i + 1] == m || arr[i + 1] == n)
                    result = true;
            }
        }
        System.out.println(result);
    }
}