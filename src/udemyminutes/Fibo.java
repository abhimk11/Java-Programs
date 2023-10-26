package udemyminutes;

public class Fibo{

     static void fibonaci(int n){
        int a=0,b=1,c=1;
        for (int i=1;i<=n;i++){
            a=b;
            b=c;
            c=a+b;
            System.out.print(a+" ");
        }
    }

    public static void main(String[] args) {
        int n=7;
        fibonaci(n);
    }
}
