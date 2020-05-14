import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();

        char[] charsWord1 = word1.toLowerCase().toCharArray();
        char[] charsWord2 = word2.toLowerCase().toCharArray();

        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char c : charsWord1) {
            if (!map1.containsKey(c)) {
                map1.put(c, 1);
            } else {
                int temp = map1.get(c);
                map1.put(c, ++temp);
            }
        }

        for (int i = 0; i < charsWord2.length; i++) {
            if (!map2.containsKey(charsWord2[i])){
                map2.put(charsWord2[i], 1);
            } else {
                int temp = map2.get(charsWord2[i]);
                map2.put(charsWord2[i], ++temp);
            }
        }

        if (Objects.equals(map1, map2))
            System.out.println("yes");
        else System.out.println("no");

    }
}