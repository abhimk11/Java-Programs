package next;

import java.util.Scanner;

public class DivisibleBy3Or5 {

    static int calculateSum(int n){
        int sum=0;
        for (int i=1;i<=n;i++)
        {
            if (i%3==0||i%5==0){
                sum+=i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        System.out.println(calculateSum(n));
    }
}
