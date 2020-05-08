import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

class Main {
    public static void main(String[] args) throws Exception {
        try (Reader reader = new BufferedReader(new InputStreamReader(System.in))) {
            // start coding here
            char[] buffer = new char[50];
            int i = reader.read(buffer);
            for (int j = i - 1; j > -1; j--) {
                System.out.print(buffer[j]);
            }
        }
    }
}
