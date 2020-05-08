// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        int count = string.length();

        if (count % 2 == 0){
            String new1 = string.substring(0, count / 2 - 1);
            String new2 = string.substring(count / 2 + 1, count);
            System.out.println(new1 + new2);
        } else {
            String new1 = string.substring(0, count / 2);
            String new2 = string.substring(count / 2 + 1, count);
            System.out.println(new1 + new2);
        }
    }
}