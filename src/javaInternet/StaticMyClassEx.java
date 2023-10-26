package javaInternet;

public class StaticMyClassEx {
    int count = 0;  // Static variable

    public StaticMyClassEx() {
        count++;

        // Accessing static variable


    }

    public static void main(String[] args) {
        //int num = StaticMyClassEx.count;
        //System.out.println("count"+num);//countfrom ither class is also accesible
        //int num = StaticMyClassEx2.count;
        //System.out.println("count"+num);
        StaticMyClassEx obj = new StaticMyClassEx();
        System.out.println("count" + obj.count);

    }
}
