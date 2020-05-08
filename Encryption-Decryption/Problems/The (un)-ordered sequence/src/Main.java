// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] myStrArray = scanner.nextLine().split(" ");

        boolean asc = false;
        boolean desc = false;

//        for (String s : myStrArray) {
//            System.out.print(s + " ");
//        }

        // Check ascending
        for (int i = 0; i < myStrArray.length - 2; i++) {
            if (Integer.parseInt(myStrArray[i]) <= Integer.parseInt(myStrArray[i + 1])) {
                asc = true;
            } else {
                asc = false;
                break;
            }
        }

        // Check descending
        for (int i = 0; i < myStrArray.length - 2; i++) {
            if (Integer.parseInt(myStrArray[i]) >= Integer.parseInt(myStrArray[i + 1]))
            {
                desc = true;
            } else {
                desc = false;
                break;
            }
        }

        if (myStrArray.length <= 2) {
            System.out.println(true);
        } else if (asc || desc) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}