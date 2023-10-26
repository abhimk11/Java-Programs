package next;

public class Cube {
    int sumOfCubes(int n){
        int sum=0;
        while (n>0){
            int digit = n%10;
            sum = sum + (digit*digit*digit);
            n=n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Cube c = new Cube();
        System.out.println(c.sumOfCubes(34));
    }
}
