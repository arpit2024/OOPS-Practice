package Threads;

public class HelloWorld implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello world from new task....."+Thread.currentThread().getName());
    }
}
