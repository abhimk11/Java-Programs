package java8;

public class factorial {
    public static int fact(int n){
        int fac=1;
        for(int i=1;i<=n;i++){
            fac = fac * i;
        }
        return fac;
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
