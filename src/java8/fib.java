package java8;

public class fib {
    public static void printFibo(int count) {
        int a=0;
        int b=1;
        int c=1;

        for(int i=1;i<=count;i++){
            a=b;
            b=c;
            c=a+b;
            System.out.println(a+", ");
        }
    }

    public static void main(String[] args) {
        printFibo(10);
    }
}
