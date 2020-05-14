import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        long first = scanner.nextLong();
        char operator = scanner.next().charAt(0);
        long second = scanner.nextLong();



        if (second != 0){
            switch (operator){
                case '+' : {
                    System.out.println(first + second);
                    break;
                }
                case '-' : {
                    System.out.println(first - second);
                    break;
                }
                case '/' : {
                    System.out.println(first / second);
                    break;
                }
                case '*' : {
                    System.out.println(first * second);
                    break;
                } default:
                    System.out.println("Unknown operator");
                    break;
            }
        } else System.out.println("Division by 0!");

    }
}