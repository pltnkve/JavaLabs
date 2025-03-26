package lab3;

import java.util.HashMap;

public class Task5 {
    public static void main(String[] args) {
        HashMap<Integer, String> myHashMap = new HashMap<>();

        myHashMap.put(0, "The");
        myHashMap.put(1, "quick");
        myHashMap.put(2, "brown");
        myHashMap.put(3, "fox");
        myHashMap.put(4, "jumps");
        myHashMap.put(5, "over");
        myHashMap.put(6, "the");
        myHashMap.put(7, "lazy");
        myHashMap.put(8, "happy");
        myHashMap.put(9, "dog");

        for (int i = 0; i < myHashMap.size(); i++) {
            if (i > 5) {
                System.out.print(myHashMap.get(i) + " ");
            }

            if (i == 0) {
                String result = myHashMap.values().toString();
                System.out.println(result.substring(1, result.length() - 1));
            }
        }
    }
}
