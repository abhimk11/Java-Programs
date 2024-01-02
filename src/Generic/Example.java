package Generic;

public class Example {
    public static void main(String[] args) {

        Box<String> box = new Box<String>("Water");
        System.out.println(box.getValue());
        System.out.println(box.container.getClass().getName());
        box.performSomeTask();

        Box<Integer> box1 = new Box<Integer>(123);
        System.out.println(box1.getValue());
        System.out.println(box1.container.getClass().getName());
        box1.performSomeTask();

        Box<Boolean> box2 = new Box<Boolean>(true);
        System.out.println(box2.getValue());
        System.out.println(box2.container.getClass().getName());
    }
}
