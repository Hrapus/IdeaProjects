import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();

        int counter = 0;
        int counter1 = 0;

        char[] arr1 = word1.toLowerCase().toCharArray();
        char[] arr2 = word2.toLowerCase().toCharArray();

        SortedMap<Character, Integer> map1 = new TreeMap<>();
        SortedMap<Character, Integer> map2 = new TreeMap<>();

        for (char c : arr1) {
            if (!map1.containsKey(c)) {
                map1.put(c, 1);
            } else {
                int temp = map1.get(c);
                map1.put(c, ++temp);
            }
        }

        for (char c : arr2) {
            if (!map2.containsKey(c)) {
                map2.put(c, 1);
            } else {
                int temp = map2.get(c);
                map2.put(c, ++temp);
            }
        }


        for (var entry1 : map1.entrySet()) {
            for (var entry2: map2.entrySet()){
                if (entry1.getKey().equals(entry2.getKey()) && entry1.getValue().equals(entry2.getValue())){
                   //System.out.println("Совпадение " + entry1.getKey() + " = " +  entry2.getValue());
                    counter++;
                }

            }
        }

//        for (var entry :
//                map1.entrySet()) {
//            System.out.println(entry.getKey() + "=" + entry.getValue());
//        }
//        System.out.println();
//        for (var entry :
//                map2.entrySet()) {
//            System.out.println(entry.getKey() + "=" + entry.getValue());
//        }


        if (counter == 0)
            System.out.println(2);
        else System.out.println(map1.size() + map2.size() - counter * 2);
    }
}