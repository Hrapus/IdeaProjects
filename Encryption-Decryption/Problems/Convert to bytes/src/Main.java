import java.io.InputStream;

class Main {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        boolean eol = false;

        while (!eol){
            int one = inputStream.read();
            if (one == -1){
                eol = true;
                break;
            }
            System.out.print(one);
        }
    }
}
