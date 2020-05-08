// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        char[] numbers = string.toCharArray();
        int[] digits = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            digits[i] = Character.getNumericValue(numbers[i]);
        }

        if ((digits[0] + digits[1] + digits[2]) == (digits[3] + digits[4] + digits[5])){
            System.out.println("Lucky");
        } else System.out.println("Regular");

    }
}