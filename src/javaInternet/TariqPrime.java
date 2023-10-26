package javaInternet;

public class TariqPrime {

    public static void main(String[] args) {

        for (int number=1;number<=10;number++){
            boolean b = true;
            if (number<=1) {
                b = false;
            }

            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    b = false;
                }
            }
            if (b==true)
            {
                System.out.println(number);
            }
        }
    }
}
