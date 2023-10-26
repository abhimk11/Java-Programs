package javaInternet;

class Single {

    public static Single single_instance = null;

    private Single() {
        String s = "Hello, It's inside Single";
    }

    public static synchronized Single getInstance() {
        if (single_instance == null) {
            single_instance = new Single();
        }
        return single_instance;
    }

}

public class SingletonMine {
    public static void main(String[] args) {
        Single x = Single.getInstance();
        Single y = Single.getInstance();
        Single z = Single.getInstance();

        System.out.println("Address of x :" + x.hashCode());
        System.out.println("Address of y :" + y.hashCode());
        System.out.println("Address of z :" + z.hashCode());

        if (x == y && y == z) {
            System.out.println("All the Instances have same object, Hence it's a singleton class.");
        } else {
            System.out.println("All Instances have different objects are is not a singleton class");
        }
    }
}
