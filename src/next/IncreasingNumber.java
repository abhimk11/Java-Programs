package next;

import java.util.Scanner;

public class IncreasingNumber {

    static boolean checkNumber(int n) {
        while (n > 0) {
            int r = n % 10; //Print the last Number, eg in 123 it will show 3.
            // System.out.println(r);
            n = n / 10;
            int g = n % 10; //Print the number after removing the last number, eg in 123 it will show 12.
            // System.out.println(n);
            if (g > r) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(checkNumber(n));
    }
}
