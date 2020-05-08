// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();

        boolean leap = false;

        if (result % 4 == 0){
            if (result % 100 == 0){
                if (result % 400 == 0){
                    leap = true;
                }
                else leap = false;

            }
            else leap = true;
        }
        else leap = false;

        if(leap)
            System.out.println("Leap");
        else
            System.out.println("Regular");
    }
}