/* Please, do not rename it */
class Problem {

    public static void main(String args[]) {
        //String operator = args[0];
        // write your code here

        if (args[0].equals("MAX")){
            System.out.println(max(args));
        } else if (args[0].equals("MIN")) {
            System.out.println(min(args));
        } else if (args[0].equals("SUM")){
            System.out.println(sum(args));
        }

//        String[] test = {"MAX", "7", "3", "4", "1", "8", "11", "3", "2"};
//        System.out.println(max(test));
//        System.out.println(min(test));
//        System.out.println(sum(test));
    }

    public static int max(String... asd) {
        int temp = Integer.parseInt(asd[1]);
        for (int i = 1; i < asd.length - 1; i++) {
            if (temp < Integer.parseInt(asd[i + 1])){
                temp = Integer.parseInt(asd[i + 1]);
            }
        }
        return temp;
    }

    public static int min(String... asd) {
        int temp = Integer.parseInt(asd[1]);
        for (int i = 1; i < asd.length - 1; i++) {
            if (temp > Integer.parseInt(asd[i + 1])){
                temp = Integer.parseInt(asd[i + 1]);
            }
        }
        return temp;
    }

    public static int sum(String... asd) {
        int temp = Integer.parseInt(asd[1]);
        for (int i = 2; i < asd.length; i++) {
            temp += Integer.parseInt(asd[i]);
            }
        return temp;
        }
}
