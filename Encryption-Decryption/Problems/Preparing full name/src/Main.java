import java.util.Scanner;

public class Main {

    public static String prepareFullName(String firstName, String lastName) {
        // write your code here
        String result = null;

        if ((firstName == null) && (lastName == null))
            result = "";
        if ((firstName == null) && (lastName != null))
            result = lastName;
        if ((firstName != null) && (lastName == null))
            result = firstName;
        if ((firstName != null) && (lastName != null))
         result = firstName + " " + lastName;

        return result;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        firstName = "null".equals(firstName) ? null : firstName;

        String lastName = scanner.nextLine();
        lastName = "null".equals(lastName) ? null : lastName;

        System.out.println(prepareFullName(firstName, lastName));
    }
}