package lab1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input month: ");
        String month = in.nextLine();

        System.out.println("Input number of days in this month: ");
        int numOfDays = in.nextInt();

        System.out.println("There are " + numOfDays + " days in " + month);
    }
}
