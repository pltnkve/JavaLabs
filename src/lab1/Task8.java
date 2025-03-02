package lab1;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input first number: ");
        int num1 = in.nextInt();

        System.out.println("Input second number: ");
        int num2 = in.nextInt();

        System.out.println("Sum of first and second numbers is " + (num1 + num2));
    }
}
