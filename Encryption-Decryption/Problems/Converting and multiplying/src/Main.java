import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String inp = scanner.nextLine();
        while (!inp.equals("0")){
            try {
                int x = Integer.parseInt(inp) * 10;
                System.out.println(x);
            } catch (Exception e){
                System.out.println("Invalid user input: " + inp);
            }

            inp = scanner.nextLine();
        }
    }
}