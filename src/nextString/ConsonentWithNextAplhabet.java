package nextString;

import java.util.Scanner;

public class ConsonentWithNextAplhabet {

    static String alterString(String str) {

        String newStr = "";
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            char ip = Character.toUpperCase(ch);
            if (ip == 'A' || ip == 'E' || ip == 'I' || ip == 'O' || ip == 'U') {
                newStr = newStr + ch;
            } else {
                char c2 = (char) (ch + 1);
                newStr = newStr + c2;
            }
        }
        return newStr;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String s1 = alterString(s);
        System.out.println(s1);

    }
}
