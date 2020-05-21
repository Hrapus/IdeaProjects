import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.next();
        String word2 = scanner.next();

        int counter = 0;


        char[] arr1 = word1.toLowerCase().toCharArray();
        char[] arr2 = word2.toLowerCase().toCharArray();

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        Map<Character, Integer> commonMap = new HashMap<>();

        for (char c : arr1) {
            if (!map1.containsKey(c)) {
                map1.put(c, 1);
            } else {
                int x = map1.get(c);
                map1.replace(c, ++x);
            }
        }

        for (char c : arr2) {
            if (!map2.containsKey(c)) {
                map2.put(c, 1);
            } else {
                int x = map2.get(c);
                map2.replace(c, ++x);
            }
        }

        for (var entry : map1.entrySet()) {
            commonMap.put(entry.getKey(), entry.getValue());
        }

        for (var entry : map2.entrySet()) {
            if (!commonMap.containsKey(entry.getKey())) {
                commonMap.put(entry.getKey(), entry.getValue());
            } else {
                int x = commonMap.get(entry.getKey());
                commonMap.replace(entry.getKey(), entry.getValue() + x);
            }
        }

        Map<Character, Integer> newSet = new HashMap<>();


        for (var e : commonMap.entrySet()) {
            if (map1.containsKey(e.getKey()) && map2.containsKey(e.getKey())) {
                int a = map1.get(e.getKey());
                int b = map2.get(e.getKey());
                int i = Math.min(a, b);
                newSet.put(e.getKey(), i);
            }
        }

        int counterCommon = 0;
        for (var e : commonMap.entrySet()){
           counterCommon += e.getValue();
        }

        int counterOut = 0;
        for (var e : newSet.entrySet()){
            counterOut += e.getValue();
        }


            System.out.println(counterCommon - counterOut * 2);

    }


}
