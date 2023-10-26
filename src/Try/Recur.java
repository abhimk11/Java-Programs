package Try;

public class Recur {

    public static void main(String[] args) {
        int n = recurs(9);
        System.out.println(n);
    }

    private static int recurs(int i) {
        while(i!=0){
            return i+recurs(i-1);
        }
        return i;
    }
}
