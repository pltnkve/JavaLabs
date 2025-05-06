package lab6;

import java.util.Scanner;

public class Encoding1654 {
    public static String restore(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            int len = sb.length();
            if (len > 0 && sb.charAt(len - 1) == c) {
                sb.deleteCharAt(len - 1);
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(restore(input));
    }
}
