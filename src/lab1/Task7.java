package lab1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input your age: ");
        int age = in.nextInt();

        System.out.println("Your birth year is " + (2025 - age));
    }
}
