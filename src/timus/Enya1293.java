package timus;

import java.util.Scanner;

public class Enya1293 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of panels and their size (length and width) separated by spaces: ");
        String inputStr = in.nextLine();

        String[] numbers = inputStr.split(" ");

        int N = Integer.parseInt(numbers[0]);
        int A = Integer.parseInt(numbers[1]);
        int B = Integer.parseInt(numbers[2]);

        System.out.println("To cover " + N + " " + A + "-by-" + B + " panels you need " + (2 * N * A * B) + " nanograms of thorium sulfide");
    }
}
