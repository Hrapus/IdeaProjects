// Posted from EduTools plugin
import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Method;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().toLowerCase();
        char[] wordArr = word.toCharArray();

        int countG = 0;
        int countS = 0;
        int superCount = 0;

        for (int i = 0; i < wordArr.length; i++) {
            char c = wordArr[i];

            if (Method(c) && countS == 0) {
                countG++;
            }

            if (!Method(c) && countG == 0) {
                countS++;
            }


            if (Method(c) && countS > 0){
                countG++;
                countS = 0;
            }

            if (!Method(c) && countG > 0){
                countS++;
                countG = 0;
            }

            if (countG == 3) {
                superCount++;
                countG = 0;
                i--;
            }
            if (countS == 3) {
                superCount++;
                countS = 0;
                i--;
            }
        }

        System.out.println(superCount);

    }

    public static boolean Method(Character character){
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};

        boolean x = false;
        int a = 0;

        for (char vowel : vowels) {
            if (character == vowel) {
                a = 1;
            }
        }

        if (a > 0)
            return true;
        else
            return false;
    }
}