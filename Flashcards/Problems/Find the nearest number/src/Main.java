import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int target = scanner.nextInt();


        Map<Integer, Integer> mainMap = new HashMap<>();

        int[] arr = new int[input.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        int distance = Math.abs(arr[0] - target);

        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i] - target) < distance)
                distance = Math.abs(arr[i] - target);
        }

        for (int value : arr) {
            if (!mainMap.containsKey(value)) {
                mainMap.put(value, 1);
            } else mainMap.replace(value, ((mainMap.get(value)) + 1));
        }


        for (var v : mainMap.entrySet()){
            if (Math.abs(target - v.getKey()) == distance){
                int x = v.getValue();
                for (int i = 0; i < x; i++) {
                    System.out.print(v.getKey() + " ");
                }
            }
        }
    }
}