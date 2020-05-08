// Posted from EduTools plugin
//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.next();
        String string2 = scanner.next();
        String string3 = scanner.next();
        String string4 = scanner.next();
        String string5 = scanner.next();

        System.out.println("The form for " + string1 + " is completed. We will contact you if we need a chef that cooks " + string5 + " dishes. \n");
    }
}