package Executors;

public class HelloWorld implements Runnable {
    public int x;
    public HelloWorld(int x) {
        this.x=x;
    }

    @Override
    public void run(){
        System.out.println("currently executing ...."+Thread.currentThread().getName());
    }
}
