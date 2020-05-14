package encryptdecrypt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String mode = "enc";
        String fileIn = "";
        String fileOut = "";
        int key = 0;
        String data = "";
        String algorithm = "shift";


        for (int i = 0; i < args.length; i += 2) {
            switch (args[i]) {
                case "-mode":
                    mode = args[i + 1];
                    break;
                case "-key":
                    key = Integer.parseInt(args[i + 1]);
                    break;
                case "-data":
                    data = args[i + 1];
                    break;
                case "-in":
                    fileIn = args[i + 1];
                    break;
                case "-out":
                    fileOut = args[i + 1];
                    break;
                case "-alg":
                    algorithm = args[i + 1];
                    break;
            }
        }

        // данные через строку, вывод на экран
        if (!data.equals("") && fileOut.equals("")) {
            switch (mode) {
                case "enc":
                    System.out.println(getEncryption(data, key, algorithm));
                    break;
                case "dec":
                    System.out.println(getDecryption(data, key, algorithm));
                    break;
            }
        }
        // данные через строку, вывод в файл
        else if (!data.equals("")) {
            File file = new File(fileOut);

            try {
                PrintWriter printWriter = new PrintWriter(file);

                switch (mode) {
                    case "enc":
                        printWriter.println(getEncryption(data, key, algorithm));
                        break;
                    case "dec":
                        System.out.println(getDecryption(data, key, algorithm));
                        break;
                }
                printWriter.close();

            } catch (FileNotFoundException e) {
                //e.printStackTrace();
                System.out.println("Error");
            }
        }
        // данные из файла, вывод на экран
        else if (fileOut.equals("")) {
            File file = new File((fileIn));

            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNext()) {
                    switch (mode) {
                        case "enc":
                            System.out.println(getEncryption(scanner.nextLine(), key, algorithm));
                            break;
                        case "dec":
                            System.out.println(getDecryption(scanner.nextLine(), key, algorithm));
                            break;
                    }
                }
                scanner.close();
            } catch (FileNotFoundException e) {
                //e.printStackTrace();
                System.out.println("Error");
            }


        }
        // данные из файла, вывод в файл
        else {
            File fileI = new File((fileIn));
            File fileO = new File((fileOut));

            try {
                Scanner scanner = new Scanner(fileI);
                PrintWriter printWriter = new PrintWriter(fileO);

                while (scanner.hasNext()) {
                    switch (mode) {
                        case "enc":
                            printWriter.println(getEncryption(scanner.nextLine(), key, algorithm));
                            break;
                        case "dec":
                            printWriter.println(getDecryption(scanner.nextLine(), key, algorithm));
                            break;
                    }
                }
                printWriter.close();
                scanner.close();
            } catch (FileNotFoundException e) {
                //e.printStackTrace();
                System.out.println("Error");
            }
        }
    }

    public static String getDecryption(String data, int key, String algorithm) {
        switch (algorithm) {
            case "unicode": {
                char[] temp = data.toCharArray();
                for (int i = 0; i < temp.length; i++) {
                    temp[i] -= key;
                }
                StringBuilder builder = new StringBuilder();
                for (char value : temp) {
                    builder.append(value);
                }
                return builder.toString();
            }
            default: {

                char[] temp = data.toCharArray();
                for (int i = 0; i < temp.length; i++) {
                    temp[i] = shiftCalc(temp[i], key);
                }
                StringBuilder builder = new StringBuilder();
                for (char value : temp) {
                    builder.append(value);
                }
                return builder.toString();
            }
        }


    }


    public static String getEncryption(String data, int key, String algorithm) {
        switch (algorithm) {
            case "unicode": {
                char[] temp = data.toCharArray();
                for (int i = 0; i < temp.length; i++) {
                    temp[i] += key;
                }
                StringBuilder builder = new StringBuilder();
                for (char value : temp) {
                    builder.append(value);
                }

                return builder.toString();
            }
            default: {


                char[] temp = data.toCharArray();
                for (int i = 0; i < temp.length; i++) {
                    temp[i] = deShiftCalc(temp[i], key);
                }
                StringBuilder builder = new StringBuilder();
                for (char value : temp) {
                    builder.append(value);
                }
                return builder.toString();
            }
        }

    }

    static char shiftCalc(char c, int key) {
        if (c > 96 && c < 123) {
            int x = c - 96;
            int intKey = key % 26;
            int temp = 0;

            temp = (x - intKey);
            if (temp <= 0) {
                temp = 26 + temp;
            }
            return (char) (temp + 96);

        } else if (c > 64 && c < 91) {
            int x = c - 64;
            int intKey = key % 26;
            int temp = 0;

            temp = (x - intKey);
            if (temp <= 0) {
                temp = 26 + temp;
            }
            return (char) (temp + 64);
        } else return c;
    }

    static char deShiftCalc(char c, int key) {
        if (c > 96 && c < 123) {
            int x = c - 96;
            int intKey = key % 26;
            int temp = 0;

            temp = (x + intKey);
            if (temp > 26) {
                temp = temp - 26;
            }
            return (char) (temp + 96);

        } else if (c > 64 && c < 91) {
            int x = c - 64;
            int intKey = key % 26;
            int temp = 0;

            temp = (x + intKey);
            if (temp > 26) {
                temp = temp - 26;
            }
            return (char) (temp + 64);
        } else return c;
    }
}
