package java8;

//swap without temp
public class swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        System.out.println("a is = " + a + " b is = " + b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping: "+"a is = " + a + " b is = " + b);
    }
}
