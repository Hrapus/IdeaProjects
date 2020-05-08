import java.util.Scanner;

import static java.util.Arrays.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();


        int[] arr = {x, y , z};
        sort(arr);

        //for(int s : arr) System.out.println(s);



        if (arr[2] > 0 && arr[1] <= 0){
            System.out.println(true);
        } else System.out.println(false);

    }
}