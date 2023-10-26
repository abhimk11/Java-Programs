package next;

import java.util.Scanner;

public class PrimeUptoRange {

    static void UptoPrime(int n){

        System.out.println("The Prime Numbers till "+ n +" are: \n");
        for (int j=1;j<=n;j++) {

            int c = 0;
            for (int i = 1; i <= j; i++) {
                if (j % i == 0) {
                    c++;
                }
            }
            if (c == 2) {
                System.out.println(j);
            }
        }
    }

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        UptoPrime(n);
    }
}
