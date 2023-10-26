package nextString;

import java.util.Scanner;

public class MirrorImg {

    static String getImage(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        String s1 = stringBuilder.toString();
        return s + "|" + s1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String s1 = getImage(s);
        System.out.println(s1);
    }
}
