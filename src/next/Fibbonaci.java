package next;

public class Fibbonaci {
    void fiboWithoutRecursion(int n){
        int a=0,b=1,c=1;

        for (int i=1;i<=n;i++){
            a=b;
            b=c;
            c=a+b;
            System.out.print(a+" ");
        }
    }

    static int n1=0,n2=1,n3=1;
    void fiboWithRecurssion(int n){

        if(n>0){
                n1 = n2;
                n2 = n3;
                n3 = n1+n2;
                System.out.print(n1+" ");
                fiboWithRecurssion(n-1);
            }
        }


    public static void main(String[] args) {
        Fibbonaci fibbonaci = new Fibbonaci();
        System.out.println("Without Recursion");
        fibbonaci.fiboWithoutRecursion(10);
        System.out.println("\n" +"With Recursion");
        fibbonaci.fiboWithRecurssion(10);
    }
}
