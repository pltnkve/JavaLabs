package lab1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input your birth year: ");
        int birthYear = in.nextInt();

        System.out.println("You are " + (2025 - birthYear) + " years old");
    }
}
