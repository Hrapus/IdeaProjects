import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double p;
        double result;

        p = (a + b + c) / 2;

        result = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println(result);
    }
}