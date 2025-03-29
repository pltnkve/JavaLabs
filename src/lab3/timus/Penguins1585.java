package lab3.timus;

import java.util.Scanner;

public class Penguins1585 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        int emperor = 0, little = 0, macaroni = 0;

        for (int i = 0; i < n; i++) {
            String penguin = scanner.nextLine();
            switch (penguin) {
                case "Emperor Penguin" -> emperor++;
                case "Little Penguin" -> little++;
                case "Macaroni Penguin" -> macaroni++;
            }
        }

        if (emperor > little && emperor > macaroni) System.out.println("Emperor Penguin");
        else if (little > emperor && little > macaroni) System.out.println("Little Penguin");
        else System.out.println("Macaroni Penguin");
    }
}
