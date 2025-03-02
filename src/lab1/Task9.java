package lab1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = in.nextInt();

        int firstNum = num - 1;
        int thirdNum = num + 1;
        int fourthNum = (firstNum + num + thirdNum) * (firstNum + num + thirdNum);

        System.out.println(firstNum + ", " + num + ", " + thirdNum + ", " + fourthNum);
    }
}
