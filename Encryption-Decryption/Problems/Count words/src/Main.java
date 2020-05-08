import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

class Main {
    public static void main(String[] args) throws Exception {
        try (Reader reader = new BufferedReader(new InputStreamReader(System.in))) {
            // start coding here
            int counter = reader.read();
            int exit = 1;
            String string = "";

            while ((counter != -1)){
                char character = (char) counter;
                string += character;
                counter = reader.read();
            }
            String newString = string.trim();
           // System.out.println(string);

            if (newString.equals("")) {
                System.out.println(0);
            }else {
                char[] output = newString.toCharArray();

                for (int i = 0; i < output.length - 1; i++) {
                    if (output[i] != ' ' && output[i + 1] == ' ')
                        exit++;
                }
                System.out.println(exit);
            }
        }


    }

}