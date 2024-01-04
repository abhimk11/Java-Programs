package Try;

public class Singleton {

    static private Singleton singleton = null;

    private Singleton() {
    }

    static synchronized Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public static void main(String[] args) {
        Singleton a = Singleton.getSingleton();
        Singleton b = Singleton.getSingleton();
        Singleton c = Singleton.getSingleton();

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());
    }
}
