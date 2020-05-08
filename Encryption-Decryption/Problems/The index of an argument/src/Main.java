class Problem {
    public static void main(String[] args) {

        int counter = -1;

        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("test")){
                counter = i;
            }
        }

        if (counter == -1){
            System.out.println(-1);
        } else System.out.println(counter);
    }
}