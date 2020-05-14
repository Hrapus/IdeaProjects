import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[3];
        int[] arr2 = new int[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        Arrays.sort(arr2);

        if (arr[0] == arr2[0] && arr[1] == arr2[1] && arr[2] == arr2[2]){
            System.out.println("Box 1 = Box 2");

        } else if (arr[0] < arr2[0] && arr[1] < arr2[1] && arr[2] < arr2[2]){
            System.out.println("Box 1 < Box 2");
        } else if (arr[0] < arr2[0] && arr[1] <= arr2[1] && arr[2] <= arr2[2]){
            System.out.println("Box 1 < Box 2");
        }else if (arr[0] <= arr2[0] && arr[1] < arr2[1] && arr[2] <= arr2[2]){
            System.out.println("Box 1 < Box 2");
        }else if (arr[0] <= arr2[0] && arr[1] <= arr2[1] && arr[2] < arr2[2]){
            System.out.println("Box 1 < Box 2");
        }

        else if (arr[0] > arr2[0] && arr[1] > arr2[1] && arr[2] > arr2[2]){
            System.out.println("Box 1 > Box 2");
        } else if (arr[0] > arr2[0] && arr[1] >= arr2[1] && arr[2] >= arr2[2]){
            System.out.println("Box 1 > Box 2");
        }else if (arr[0] >= arr2[0] && arr[1] > arr2[1] && arr[2] >= arr2[2]){
            System.out.println("Box 1 > Box 2");
        }else if (arr[0] >= arr2[0] && arr[1] >= arr2[1] && arr[2] > arr2[2]){
            System.out.println("Box 1 > Box 2");
        }

        else System.out.println("Incomparable");


    }
}