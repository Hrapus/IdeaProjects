// Posted from EduTools plugin
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int qualOfBridge = scanner.nextInt();
        boolean crash = false;

        int[] bridges = new int[qualOfBridge];

        for (int i = 0; i < qualOfBridge; i++) {
            bridges[i] = scanner.nextInt();
        }

        for (int i = 0; i < qualOfBridge; i++) {
            if (height >= bridges[i]) {
                System.out.println("Will crash on bridge " + (i+1));
                crash = true;
                break;
            }
        }
        if (!crash)
            System.out.println("Will not crash");

    }
}