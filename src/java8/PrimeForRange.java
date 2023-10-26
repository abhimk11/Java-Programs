package java8;

public class PrimeForRange {

    static boolean checkPrime(int n) {

        if (n == 0 || n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //int[] ar = {1,2,3,4,5,6,7};
        for (int i = 1; i <= 20; i++) {
            if (checkPrime(i)) {
                System.out.println(i + " is a Prime Number");
            }
          /*else {
              System.out.println(i + " is Composite Number");
          }*/
        }
    }
}
