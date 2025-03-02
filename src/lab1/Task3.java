package lab1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input current weekday: ");
        String weekday = in.nextLine();

        System.out.println("Input current month: ");
        String month = in.nextLine();

        System.out.println("Input current day of the month: ");
        int day = in.nextInt();

        System.out.println("Current date is " + weekday + ", " + day + " of " + month);
    }
}
