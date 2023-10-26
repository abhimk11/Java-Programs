package Mphasis;

import java.util.Scanner;

public class PerfectSq {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean b = perfectSquare(a);
        if (b){
            System.out.println(a +" is a perfect sq.");
        }
        else {
            System.out.println(a + " is not a perfect sq.");
        }
    }

    private static boolean perfectSquare(int a) {
        if (a==1){
            return true;
        }
        for (int i=2;i<a;i++){

            if (a/i == i && a%i==0){
               return true;
            }
        }
        return false;
    }
}
