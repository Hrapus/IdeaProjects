class Problem {

    public static void main(String[] args) {

        String sign = args[0];
        String first = args[1];
        String second = args[2];

        if (sign.equals("+")){
            System.out.println(Integer.parseInt(first) + Integer.parseInt(second));
        } else if (sign.equals("-")){
            System.out.println(Integer.parseInt(first) - Integer.parseInt(second));
        } else if (sign.equals("*")){
            System.out.println(Integer.parseInt(first) * Integer.parseInt(second));
        }
        else System.out.println("Unknown operator");
    }
}