package nextString;

import java.util.Scanner;

public class PositiveString {

    static boolean psvtString(String s) {
        s = s.toLowerCase();
        int len = s.length();
        //String[] str = new String[]{s};
        for (int i = 1; i < len; i++) {
            char current = s.charAt(i);
            char previous = s.charAt(i - 1);

            if (current < previous) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        boolean ans = psvtString(s);
        System.out.println("The Nature is: " + ans);
    }
}
