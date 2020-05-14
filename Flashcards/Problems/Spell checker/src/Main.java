import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] temp;

        SortedSet<String> dict = new TreeSet<>();
        SortedSet<String> input = new TreeSet<>();
        SortedSet<String> output = new TreeSet<>();

        int countDict = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < countDict; i++) {
            dict.add(scanner.next().toLowerCase());
        }

        int countInput = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < countInput; i++) {
            temp = (scanner.nextLine().toLowerCase().split("\\s"));

            input.addAll(Arrays.asList(temp));
        }

        input.removeAll(dict);


        for (String s :
                input) {
            System.out.println(s);
        }
    }
}