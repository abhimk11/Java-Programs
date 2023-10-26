package xtra;

import java.util.Scanner;

public class ContainsDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        boolean st = isContainDigit(s);
        System.out.println("The string '"+s+"' contains digit: "+st);
    }

    private static boolean isContainDigit(String s) {
        for (int i=0;i<s.length();i++){
            if (Character.isDigit(s.charAt(i))){
                return true;
            }
        }
        return false;
    }
}
