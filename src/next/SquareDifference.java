package next;

import java.util.Scanner;

public class SquareDifference {

    static int calculateDifference(int n){
        int sum=0;
        int sum1=0;
        int sum2=0;
        for (int i=1;i<=n;i++){
            sum= (int) (sum + Math.pow(i,2));
        }
        System.out.println(sum);
        for (int i=1;i<=n;i++){
            sum1= sum1 + i;
            sum2= (int) (sum2+Math.pow(sum1,2));
        }
        System.out.println(sum2);
        return sum-sum2;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(calculateDifference(n));
    }
}
