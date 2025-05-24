package lab7;

import java.util.*;
import java.io.*;

public class Sliders1617 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        Map<Integer, Integer> diameterCount = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int diameter = Integer.parseInt(reader.readLine());
            diameterCount.put(diameter, diameterCount.getOrDefault(diameter, 0) + 1);
        }

        int wagons = 0;
        for (int count : diameterCount.values()) {
            wagons += count / 4;
        }

        System.out.println(wagons);
    }
}
