package Mphasis;

public class fibountil {
    public static void main(String[] args) {
        fibonaciuntil(50);
    }

    private static void fibonaciuntil(int i) {
        long a=0,b=1;
        long c=1;
        while(i!=0){
            a=b;
            b=c;
            c=a+b;
            System.out.println(a);
            i--;
        }
    }
}
