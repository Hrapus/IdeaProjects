import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

class Main {
    public static void main(String[] args) throws IOException {
        // put your code here
        int index0 = 0;
        int index1 = 0;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            // start coding here
            String myString = reader.readLine();
            myString = myString.trim() + " ";
            char[] chars = myString.toCharArray();

            for (int i = index1; i < chars.length - 1; i++) {
                if (chars[i] != ' ' && chars[i + 1] == ' ') {
                    index0 = i + 1;

                    String s = "";
                    for (int j = index1; j < index0; j++) {
                        s = s + chars[j];
                    }
                    index1 = index0;

                    System.out.print(s.trim());
                    System.out.println();


                }


            }


        }
    }
}