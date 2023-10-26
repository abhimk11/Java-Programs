package udemyminutes.threads;

import java.util.stream.IntStream;

public class ThreadsJava8 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<1000;i++){
                    System.out.println(Thread.currentThread().getId() + ":" + i);
                }
            }
        };

        Runnable runnable2 = ()-> {
            IntStream.rangeClosed(0,1000).forEach(i-> System.out.println(Thread.currentThread().getId() + ":" + i));
        };

        Thread thread = new Thread(runnable2);
        thread.start();

        Thread thread1 = new Thread(runnable2);
        thread1.start();

        Thread thread2 = new Thread(runnable2);
        thread2.start();
    }
}
