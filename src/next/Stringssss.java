package next;

public class Stringssss {
    public static void main(String[] args) {
        String a ="Im best";
        String b="Im best";
        StringBuilder st = new StringBuilder();
        st.append("Im best");
        st.replace(2,4,"ytr");
        System.out.println(st);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
