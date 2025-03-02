package lab1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input your name: ");
        String name = in.nextLine();

        System.out.println("Input your birth year: ");
        int birthYear = in.nextInt();

        System.out.println(name + ", " + (2025 - birthYear) + " y.o.");
    }
}
