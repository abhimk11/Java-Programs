package next;

import java.util.Scanner;

public class CheckPowerof2 {
    static boolean checkNumber(int n){
        while (n%2==0){
            n=n/2;
        }
        if (n==1){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(checkNumber(n));
    }
}
